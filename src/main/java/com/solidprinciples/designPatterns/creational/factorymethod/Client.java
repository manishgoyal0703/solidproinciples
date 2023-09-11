package com.solidprinciples.designPatterns.creational.factorymethod;


import com.solidprinciples.designPatterns.creational.factorymethod.message.Message;

public class Client {

	public static void main(String[] args) {

		printMessage(new JSONMessageCreator());
		printMessage(new TextMessageCreator());
	}
	
	public static void printMessage(MessageCreator creator) {
		Message msg = creator.getMessage();
		System.out.println(msg);
	}
}
