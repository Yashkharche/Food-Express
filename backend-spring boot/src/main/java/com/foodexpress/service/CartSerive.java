package com.foodexpress.service;

import com.foodexpress.Exception.CartException;
import com.foodexpress.Exception.CartItemException;
import com.foodexpress.Exception.FoodException;
import com.foodexpress.Exception.UserException;
import com.foodexpress.model.Cart;
import com.foodexpress.model.CartItem;
import com.foodexpress.model.Food;
import com.foodexpress.model.User;
import com.foodexpress.request.AddCartItemRequest;
import com.foodexpress.request.UpdateCartItemRequest;

public interface CartSerive {

	public CartItem addItemToCart(AddCartItemRequest req, String jwt)
			throws UserException, FoodException, CartException, CartItemException;

	public CartItem updateCartItemQuantity(Long cartItemId, int quantity) throws CartItemException;

	public Cart removeItemFromCart(Long cartItemId, String jwt) throws UserException, CartException, CartItemException;

	public Long calculateCartTotals(Cart cart) throws UserException;

	public Cart findCartById(Long id) throws CartException;

	public Cart findCartByUserId(Long userId) throws CartException, UserException;

	public Cart clearCart(Long userId) throws CartException, UserException;

}
