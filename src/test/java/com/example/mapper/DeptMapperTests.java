package com.example.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.Dept;



@RunWith(SpringRunner.class) //Autowired 를 쓰기 위해 필요하다.
@SpringBootTest
public class DeptMapperTests {
	@Autowired
	DeptMapper mapper; //Mybatis 가 DeptMapper 파일을 가져와서 구현해준다. 
	@Test
	public void test01_selectAll(){
	System.out.println("mapper="+mapper);	
	List<Dept> list = mapper.selectAll();
	
	for(Dept d:list){
		System.out.println(d.getDeptno()+","+d.getDname()+","+d.getLoc());
	}
	}
	@Test
	public void test02_selectByDeptno(){
		Dept d1=mapper.selectByDeptno(10);
		Dept d2=mapper.selectByDeptno(20);
		Dept d3=mapper.selectByDeptno(30);
		System.out.println("d1==>"+d1.getDeptno()+","+d1.getDname()+","+d1.getLoc());
		System.out.println("d2==>"+d2.getDeptno()+","+d2.getDname()+","+d2.getLoc());
		System.out.println("d3==>"+d3.getDeptno()+","+d3.getDname()+","+d3.getLoc());
	}
	
	@Test
	public void test03_insert(){
		Dept dept=new Dept();
		dept.setDeptno(50);
		dept.setDname("xxx");
		dept.setLoc("yyy");
		
		try{
			int rtn=mapper.insert(dept);
			System.out.println("rtn="+rtn);
		}catch(DuplicateKeyException e){
			System.out.println("중복에러 deptno="+dept.getDeptno());
		}
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

	

