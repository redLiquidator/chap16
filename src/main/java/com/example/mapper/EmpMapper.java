package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.domain.Emp;

@Mapper
public interface EmpMapper {
	
	@Select("select * from emp")
	List <Emp> selectAll();
	
	@Select("select*from Emp where empno=#{empno}")
	Emp selectByEmpno(int empno);
	
	@Insert("insert into emp values (#{Empno},#{dname},#{loc}")
	int insert(Emp emp);
	
	@Update("update Emp set dname=#{dname},loc=#{loc} where Empno=#{Empno}")
	int updateByEmpno(Emp Emp);
	
	@Delete("delete from Emp where Empno=#{Empno}")
	int delete(int Empno);
}
