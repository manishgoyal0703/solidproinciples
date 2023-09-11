package com.solidprinciples.designPatterns.creational.abstractfactory.aws;

import com.solidprinciples.designPatterns.creational.abstractfactory.Instance;
import com.solidprinciples.designPatterns.creational.abstractfactory.ResourceFactory;
import com.solidprinciples.designPatterns.creational.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Instance.Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}


}
