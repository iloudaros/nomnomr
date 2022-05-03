package com.example.project;

public class Order {
    private Shop shopChoice;
    private MenuItem[] orderItems;
    private float finalPrice;
    private Address delivAddress;
    private Payment paymentMethods;
	
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
