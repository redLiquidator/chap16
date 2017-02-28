package com.example.mapper;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.Dept;
import com.example.domain.Emp;

@RunWith(SpringRunner.class)
@SpringBootTest     //spring에 관련된 객체를 읽어라.
public class EmpMapperTests {
	@Autowired
	EmpMapper mapper;
//	SimpleDateFormat format=new SimpleDateFormat("YYYY/MM/DD"); 


	@Test
	public void test01_selectAll(){
		List<Emp> list =mapper.selectAll();
		 
		for(Emp e:list){
			System.out.println(e.getEmpno()+","+e.getEname()+","+e.getJob()+","+e.getMgr()+","+e.getHiredate()+","+e.getSal()+","+e.getComm()+","+e.getDeptno());
		}
	}
		
	
	@Test
	public void test02_selectByEmpno(){
		Emp e1=mapper.selectByEmpno(7566);
		Emp e2=mapper.selectByEmpno(7654);
		Emp e3=mapper.selectByEmpno(7900);
		System.out.println("e1==>"+e1.getEmpno()+","+e1.getEname()+","+e1.getMgr());
		System.out.println("e2==>"+e2.getEmpno()+","+e2.getEname()+","+e2.getMgr());
		System.out.println("e3==>"+e3.getEmpno()+","+e3.getEname()+","+e3.getMgr());
	}
	
	@Test
	public void test03_insert(){
		
		Emp emp =new Emp();
		emp.setEmpno(7400);
		emp.setEname("Alex");
		emp.setJob("ANALYST");
		emp.setMgr(new BigDecimal(7902));
        Date date= DateFormat(2015, 1, 1);
        emp.setDate(DAte date);
		emp.setHiredate(date);
		emp.setSal(1600.00);
		emp.setComm(300.00);
		emp.setDeptno(new BigDecimal(10));
		
		try{
			int rtn=mapper.insert(emp);
			System.out.println("rtn="+rtn);
		}catch(DuplicateKeyException e){
			System.out.println("중복에러 empno="+emp.getEmpno());
		}
	}
	
	public static Date DateFormat( int Year, int Month, int Day ) {
		return new Date( Year, Month - 1, Day );
	}

	@Test
	public void test04_updateByDeptno(){
		Dept dept=new Dept();
		dept.setDeptno(50);
		dept.setDname("lo");
		dept.setLoc("behold");
		
		
		int rtn=mapper.updateByDeptno(dept);
		System.out.println("update rtn="+rtn);
	}
	
		@Test
		public void test05_deleteByDeptno(){
			int rtn=mapper.deleteByDeptno(60);
			System.out.println("delete rtn="+rtn);
		}
	}
