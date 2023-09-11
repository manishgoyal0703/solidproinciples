package com.solidprinciples.designPatterns.creational.abstractfactory.gcp;


import com.solidprinciples.designPatterns.creational.abstractfactory.Instance;
import com.solidprinciples.designPatterns.creational.abstractfactory.ResourceFactory;
import com.solidprinciples.designPatterns.creational.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Instance.Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}
	

}
