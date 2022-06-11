
import android.view.MenuItem;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Order extends Room {
	private  int ID ;
	private LocalDate dateOrdered;
	private String shop;
	private LocalTime timeDelivered;
	private Boolean delivery;
	private Address deliveryAddress;
    private float finalPrice;
    private ArrayList<MenuItem> orderItems = new ArrayList<>();

	private String state;

    private enum state {
    	inStore,
		ready,
		onTheWay,
		delivered
	}


	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public LocalDate getDateOrdered() {
		return dateOrdered;
	}

	public void setDateOrdered(LocalDate dateOrdered) {
		this.dateOrdered = dateOrdered;
	}

	public LocalTime getTimeDelivered() {
		return timeDelivered;
	}

	public void setTimeDelivered(LocalTime timeDelivered) {
		this.timeDelivered = timeDelivered;
	}

	public ArrayList<MenuItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(ArrayList<MenuItem> orderItems) {
		this.orderItems = orderItems;
	}

	public String getShop() {
		return shop;
	}

	public void setShop(String shop) {
		this.shop = shop;
	}

	public void setState(String state) {
		this.state = state;
	}

	public boolean isCard(Payment p){
    	if(p.getPaymentMethod() == "card"){
    		return true;
		}
    	else{
    		return false;
		}
	}

   public boolean isCompleted(){

  	if( state == "delivered"){
        return true;
	}
  	else {
  		return false;
	}
	}

	public boolean isForDelivery() {

		return delivery;
    }

    public String getState(){
    	return state;
	}




}
