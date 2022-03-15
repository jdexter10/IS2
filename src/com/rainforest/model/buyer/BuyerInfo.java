package com.rainforest.model.buyer;

import com.rainforest.core.GUID;

public class BuyerInfo {
	
	private String name;
	private GUID buyerID;
	private String email;

	public BuyerInfo(String name, GUID buyerID, String email) {
		super();
		this.name = name;
		this.buyerID = buyerID;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}

	public GUID getBuyerID() {
		return buyerID;
	}

	public String getEmail() {
		return email;
	}
	
	@Override
	public int hashCode() {
		return buyerID.hashCode();
	}
	

	
}
