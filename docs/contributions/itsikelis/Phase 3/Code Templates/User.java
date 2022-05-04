import java.util.ArrayList; // import the ArrayList class

interface User {	
	public String getId();
	public String getPassword();
}

class Customer implements User {
	private String id;
	private String password;

	public String getId() {
		return this.id;
	}

	public String getPassword() {
		return this.password;
	}
}

class ShopEmployee implements User {
	private String id;
	private String password;

	public String getId() {
		return this.id;
	}

	public String getPassword() {
		return this.password;
	}
}

class DeliveryPerson implements User {
	private String id;
	private String pass;

	public String getId() {
		return this.id;
	}

	public String getPassword() {
		return this.pass;
	}
}

class Card {
	private long cardNumber;
	private int cvv;

	public long getCardNumber() {
		return this.cardNumber;
	}

	public int getCVV() {
		return this.cvv;
	}
}


// Wallet class contains all the user's stored cards.
class Wallet {

	private ArrayList<Card> cards = new ArrayList<Card>(); // Create an ArrayList object

}