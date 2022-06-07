package com.example.project;

import android.view.MenuItem;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Order {
	private  int Id ;
	private LocalDate dateOrdered;
	private LocalTime timeDelivered;
	private Boolean delivery;
	private Address deliveryAddress;
    private float finalPrice;
    private ArrayList<MenuItem> orderItems = new ArrayList<>();

    enum state {
    	inStore,
		ready,
		onTheWay,
		delivered
	}

    //private Address delivAddress;
    //private Payment paymentMethods;
	//private Shop shopChoice;
	//private MenuItem[] orderItems;
	
	public Shop getShopChoice() {
		return shopChoice;
	}
	public MenuItem[] getMenuItems(){
		return MenuItem[];
	}
	public float getFinalPrice(){
		return finalPrice;
	}
	public Address getDelivAddress(){
		return delivAddress;
	}
	public Payment getPaymentMethods(){
		return paymentMethods;
	}
	
	public void setShopChoice(Shop shopChoice){
		this.shopChoice = shopChoice;
	}
	public void setMenuItem(MenuItem[] orderItems){
		this.orderItems = orderItems;
	}
	public void setFinalPrice(float finalPrice){
		this.finalPrice = finalPrice;
	}
	public void setDelivAddress(Address delivAddress){
		this.delivAddress = delivAddress;
	}
	public void setPaymentMethods(Payment paymentMethods){
		this.paymentMethods = paymentMethods;
	}
}
