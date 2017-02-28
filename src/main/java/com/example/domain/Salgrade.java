package com.example.domain;

public class Salgrade {

	private double grade;
	private double losal;
	private double hisal;

	public Salgrade() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the grade
	 */
	public double getGrade() {
		return grade;
	}

	/**
	 * @param value the grade to set
	 */
	public Salgrade setGrade(final double value) {
		grade = value;
		return this;
	}

	/**
	 * @return the losal
	 */
	public double getLosal() {
		return losal;
	}

	/**
	 * @param value the losal to set
	 */
	public Salgrade setLosal(final double value) {
		losal = value;
		return this;
	}

	/**
	 * @return the hisal
	 */
	public double getHisal() {
		return hisal;
	}

	/**
	 * @param value the hisal to set
	 */
	public Salgrade setHisal(final double value) {
		hisal = value;
		return this;
	}

}
