import java.util.ArrayList;

// Class that describes the Customer.
public class Customer implements User{

	// The Customer's username.
	private String id;
	// The Customer's password.
	private String password;
	// The Customer's added Adresses.
	private ArrayList<Address> addressList = new ArrayList<Address>();
	// The Customer's currently selected Address.
	private Address activeAddress;
	// The Customer's placed Orders, completed and ongoing.
	private ArrayList<Order> orderHistory = new ArrayList<Order>();

	// Returns the Customer's username.
	public String getId() {

		return this.id;
	}

	// Returns the Customer's password.
	public String getPassword() {

		return this.password;
	}

	// Returns the Customer's Address List.
	public ArrayList<Address> getAddressList() {

		return this.addressList;
	}

	// Update the Customer's current Address.
	public void setActiveAddress(Address newActiveAddress) {

		this.activeAddress = newActiveAddress;
	}

	// Add a new Address in the List.
	public void addAddress(Address newAddress) {

		this.addressList.add(newAddress);
	}
}
