package com.solidprinciples.designPatterns.creational.singleton;

public class Client {

	public static void main(String[] args) {

//		EagerRegistry eagerRegistry = EagerRegistry.getInstance();
//		EagerRegistry eagerRegistry2 = EagerRegistry.getInstance();
//		System.out.println(eagerRegistry2 == eagerRegistry);
//
//		LazyRegistryWithDCL lazyRegistryWithDCL = LazyRegistryWithDCL.getInstance();
//		LazyRegistryWithDCL lazyRegistryWithDCL2 = LazyRegistryWithDCL.getInstance();
//		System.out.println(lazyRegistryWithDCL2 == lazyRegistryWithDCL);

		LazyRegistryIODH lazyRegistryIODH = LazyRegistryIODH.getInstance();
		LazyRegistryIODH lazyRegistryIODH1 = LazyRegistryIODH.getInstance();
		System.out.println(lazyRegistryIODH1 == lazyRegistryIODH);




	}

}
