package com.tnsif.Springq;

import org.springframework.stereotype.Component;

@Component
public class Clothes implements ShoppingMall {
	public void purchase() {
		System.out.println("I'm going to order some dresses..");
	}

}
