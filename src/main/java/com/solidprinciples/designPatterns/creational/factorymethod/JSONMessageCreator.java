package com.solidprinciples.designPatterns.creational.factorymethod;


import com.solidprinciples.designPatterns.creational.factorymethod.message.JSONMessage;
import com.solidprinciples.designPatterns.creational.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
