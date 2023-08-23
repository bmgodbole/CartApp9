package com.bg.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;

import com.bg.connection.DbCon;
import com.bg.dao.DiscountItemDao;
import com.bg.model.CartItem;
import com.bg.model.Item;
import com.bg.service.Offer;

public abstract class AbsOffer implements Offer {
     
	public abstract String getDisplayInfo() ;

	
	public int applyOffer(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int applyOffer(CartItem c) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
