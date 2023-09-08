package com.solidprinciples.designPatterns.creational.factorymethod;

import com.solidprinciples.designPatterns.creational.factorymethod.message.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {

    public Message getMessage(){
        Message msg = createMessage();
        msg.addDefaultHeaders();
        msg.encrypt();
        return msg;
    }

    //Factory method
    public abstract Message createMessage();
	
}
