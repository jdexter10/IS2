package com.rainforest.model.buyer;


public class Buyer {

	private BuyerInfo info ;

	public Buyer(BuyerInfo info) {
		super();
		this.info = info;
	}

	@Override
	public int hashCode() {
		return info.hashCode();
	}
	
	
}
