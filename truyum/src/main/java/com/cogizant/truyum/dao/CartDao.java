package com.cogizant.truyum.dao;

import java.util.List;

import com.cogizant.truyum.model.MenuItem;

public interface CartDao {
	
	public void addCartItem(long userId,long menuItemId);
	
	public List<MenuItem> getAllCartItems(long userId);
	
	public void removeCartItem(long userId,long menuItemId);

}
