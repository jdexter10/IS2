package com.rainforest.model.seller;

public class Seller {

	private SellerInfo info;

	public Seller(SellerInfo info) {
		this.info = info;
	}

	@Override
	public int hashCode() {
		return info.hashCode();
	}
	
	
}
