package com.example.domain;

import java.math.BigDecimal;
import java.sql.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Emp {

	private int empno;
	private String ename;
	private String job;
	private BigDecimal mgr;
	private Date hiredate;
	private double sal;
	private double comm;
	private BigDecimal deptno;

	public Emp() {
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return json;
	}
	/**
	 * @return the empno
	 */
	public int getEmpno() {
		return empno;
	}

	/**
	 * @param value the empno to set
	 */
	public Emp setEmpno(final int value) {
		empno = value;
		return this;
	}

	/**
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}

	/**
	 * @param value the ename to set
	 */
	public Emp setEname(final String value) {
		ename = value;
		return this;
	}

	/**
	 * @return the job
	 */
	public String getJob() {
		return job;
	}

	/**
	 * @param value the job to set
	 */
	public Emp setJob(final String value) {
		job = value;
		return this;
	}

	/**
	 * @return the mgr
	 */
	public BigDecimal getMgr() {
		return mgr;
	}

	/**
	 * @param value the mgr to set
	 */
	public Emp setMgr(final BigDecimal value) {
		mgr = value;
		return this;
	}

	/**
	 * @return the hiredate
	 */
	public Date getHiredate() {
		return hiredate;
	}

	/**
	 * @param value the hiredate to set
	 */
	public Emp setHiredate(final Date value) {
		hiredate = value;
		return this;
	}

	/**
	 * @return the sal
	 */
	public double getSal() {
		return sal;
	}

	/**
	 * @param value the sal to set
	 */
	public Emp setSal(final double value) {
		sal = value;
		return this;
	}

	/**
	 * @return the comm
	 */
	public double getComm() {
		return comm;
	}

	/**
	 * @param value the comm to set
	 */
	public Emp setComm(final double value) {
		comm = value;
		return this;
	}

	/**
	 * @return the deptno
	 */
	public BigDecimal getDeptno() {
		return deptno;
	}

	/**
	 * @param value the deptno to set
	 */
	public Emp setDeptno(final BigDecimal value) {
		deptno = value;
		return this;
	}

}
