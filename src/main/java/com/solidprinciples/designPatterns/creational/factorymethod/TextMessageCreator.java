package com.solidprinciples.designPatterns.creational.factorymethod;


import com.solidprinciples.designPatterns.creational.factorymethod.message.Message;
import com.solidprinciples.designPatterns.creational.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {


    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
