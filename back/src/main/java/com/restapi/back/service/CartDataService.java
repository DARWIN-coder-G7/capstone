package com.restapi.back.service;

import java.util.List;

import com.restapi.back.entity.CartData;

public interface CartDataService {
CartData saveCart(CartData cartdata);
List<CartData> getCartByUserid(long userid);
}
