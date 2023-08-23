package com.bg.service.impl;

import com.bg.model.CartItem;

public class FixedPriceOffer extends AbsOffer {
	private int mFixedPrice;
	private String displayInfo;
	public FixedPriceOffer(int pPrice)
	{
		this.mFixedPrice = pPrice;
		this.setDisplayInfo("Flat "+pPrice+" off");
	}

	public int applyOffer(CartItem c) {
		// TODO Auto-generated method stub
		return c.getTotal_price()-mFixedPrice;
	}

	public String getDisplayInfo() {
		return displayInfo;
	}

	public void setDisplayInfo(String displayInfo) {
		this.displayInfo = displayInfo;
	}

}
