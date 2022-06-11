import java.util.ArrayList;

// Class that describes the Customer.
public class Customer implements User{

    // The Customer's username.
    private String id;
    // The Customer's password.
    private String password;
    // The Customer's added Adresses.
    private ArrayList<HomeAddress> addressList = new ArrayList<HomeAddress>();
    // The Customer's currently selected Address.
    private HomeAddress activeAddress;
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
    public ArrayList<HomeAddress> getAddressList() {

        return this.addressList;
    }

    // Update the Customer's current Address.
    public void setActiveAddress(HomeAddress newActiveAddress) {

        this.activeAddress = newActiveAddress;
    }

    // Add a new Address in the List.
    public void addAddress(HomeAddress newAddress) {

        this.addressList.add(newAddress);
    }
}
