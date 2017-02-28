package com.example.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//DTO(Data Transfer Object)
//Model
//Entity
public class Dept {

	private int deptno;
	private String dname;
	private String loc;

	public Dept() {
		// TODO Auto-generated constructor stub
	}

@Override

public String toString(){
	ObjectMapper objectMapper =new ObjectMapper(); 
	String json=null;
	try {
		json=objectMapper.writeValueAsString(this);
		return objectMapper.writeValueAsString(this);
	} catch (JsonProcessingException e) {
		e.printStackTrace();
	}
	
	return json;
}

/**
	 * @return the deptno
	 */
	public int getDeptno() {
		return deptno;
	}

	/**
	 * @param value the deptno to set
	 */
	public Dept setDeptno(final int value) {
		deptno = value;
		return this;
	}

	/**
	 * @return the dname
	 */
	public String getDname() {
		return dname;
	}

	/**
	 * @param value the dname to set
	 */
	public Dept setDname(final String value) {
		dname = value;
		return this;
	}

	/**
	 * @return the loc
	 */
	public String getLoc() {
		return loc;
	}

	/**
	 * @param value the loc to set
	 */
	public Dept setLoc(final String value) {
		loc = value;
		return this;
	}

}
