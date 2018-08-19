package com.gmail.gulyaev4420;

public class MyExeption extends Exception {

	public String messageText;

	public MyExeption(String messageText) {
		super();
		this.messageText = messageText;
	}

	public MyExeption() {
		super();
	}

	public String getMessageText() {
		return messageText;
	}

	@Override
	public String toString() {
		return "Exeption1 [messageText=" + messageText + "]";
	}

}
