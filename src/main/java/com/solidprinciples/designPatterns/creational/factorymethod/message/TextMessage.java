package com.solidprinciples.designPatterns.creational.factorymethod.message;

public class TextMessage extends Message {
	
	@Override
	public String getContent() {
		return "Text";
	}
	
}
