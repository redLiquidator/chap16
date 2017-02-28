package com.example.domain;

public class GuestbookMessage {

	private double messageId;
	private String guestName;
	private String password;
	private String message;

	public GuestbookMessage() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the messageId
	 */
	public double getMessageId() {
		return messageId;
	}

	/**
	 * @param value the messageId to set
	 */
	public GuestbookMessage setMessageId(final double value) {
		messageId = value;
		return this;
	}

	/**
	 * @return the guestName
	 */
	public String getGuestName() {
		return guestName;
	}

	/**
	 * @param value the guestName to set
	 */
	public GuestbookMessage setGuestName(final String value) {
		guestName = value;
		return this;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param value the password to set
	 */
	public GuestbookMessage setPassword(final String value) {
		password = value;
		return this;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param value the message to set
	 */
	public GuestbookMessage setMessage(final String value) {
		message = value;
		return this;
	}

}
