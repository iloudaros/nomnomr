package com.example.project;

public class Room{
    private int roomId;
    private Customer[] members;
    private String roomName;
    private int roomSize;
    private int maxShopDisp;

    private enum choiceCriteria {
        closest,
        highestRating,
        mostPopular,
        fastest,
        minimumCost
    }
	
	public int getRoomId() {
		return roomId;
	}
	public Customer[] getMemebers(){
		return Customer[];
	}
	public String getRoomName(){
		return roomName;
	}
	public int getRoomSize(){
		return roomSize;
	}
	public int getMaxShopDisp(){
		return maxShopDisp;
	}
	public choiceCriteria getChoiceCriteria(){
		return choiceCriteria;
	}
	
	public void setRoomId(int roomId){
		this.roomId = roomId;
	}
	public void setCustomer(Customer[] members){
		this.members = members;
	}
	public void setRoomName(String roomName){
		this.roomName = roomName;
	}
	public void setRoomSize(int roomSize){
		this.roomSize = roomSize;
	}
	public void setMaxShopDisp(int maxShopDisp){
		this.maxShopDisp = maxShopDisp;
	}
	public void setChoiceCriteria(choiceCriteria choiceCriteria){
		this.choiceCriteria = choiceCriteria;
	}
}
