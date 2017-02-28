package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.domain.Dept;

@Mapper
public interface DeptMapper {
	
	@Select("select * from dept")
	List <Dept> selectAll();
	
	@Select("select*from dept where deptno=#{deptno}")
	Dept selectByDeptno(int deptno);
	
	@Insert("insert into dept values (#{deptno},#{dname},#{loc}")
	int insert(Dept dept);
	
	@Update("update dept set dname=#{dname},loc=#{loc} where deptno=#{deptno}")
	int updateByDeptno(Dept dept);
	
	@Delete("delete from dept where deptno=#{deptno}")
	int delete(int deptno);
}
