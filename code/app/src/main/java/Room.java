import java.util.ArrayList;

public class Room {
    private int roomId;													// Room ID.
    private ArrayList<Customer> members = new ArrayList<Customer>();	// The Room's Customers.
    private int roomSize;												// Maximum Room size.
    private int maxShopDisp;											// Maximum Shops to display.

	// Shop Choice Criteria.
    private enum ChoiceCriteria {
        closest,
        highestRating,
        mostPopular,
        fastest,
        minimumCost
    }

	// A list of the Room's criteria to fetch Shops.
	private ArrayList<ChoiceCriteria> criteria = new ArrayList<ChoiceCriteria>();

	/*
	*  Getters - Setters
	*/

	// Room ID Getter.
	public int getRoomId() {

		return roomId;
	}

	// Member List Getter.
	public ArrayList<Customer> getMembers(){
		return this.members;
	}

	// Room SIze Getter.
	public int getRoomSize(){

		return roomSize;
	}

	// Maximum Shops to display Getter.
	public int getMaxShopDisp(){

		return maxShopDisp;
	}

	// Shop Choice Criteria Getter.
	public ArrayList<ChoiceCriteria> getChoiceCriteria() {

		return this.criteria;
	}

	// Room ID Setter.
	public void setRoomId(int roomId){

		this.roomId = roomId;
	}

	// Add Customer to Room.
	public void addCustomer(Customer newCustomer){

		this.members.add(newCustomer);
	}

	// Room Size Setter.
	public void setRoomSize(int roomSize){

		this.roomSize = roomSize;
	}

	// Maximum Shops to display Setter.
	public void setMaxShopDisp(int maxShopDisp){

		this.maxShopDisp = maxShopDisp;
	}

	// Choice Criteria Setter.
	public void setChoiceCriteria(ArrayList<ChoiceCriteria> choiceCriteria){

		this.criteria = choiceCriteria;
	}
}
