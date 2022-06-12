import android.view.MenuItem;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Order extends Room {
	private  int ID ;
	private LocalDate dateOrdered;
	private String shop;
	private LocalTime timeDelivered;
//	private Boolean delivery;
	private HomeAddress deliveryAddress;
    private float finalPrice;
    private ArrayList<MenuItem> orderItems = new ArrayList<>();
	private Payment orderPayment;
	private String orderType;
	private int completionEstimation;

    private enum OrderState {
    	inStore,
		ready,
		onTheWay,
		delivered
	}

	private OrderState state;


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
	public int getCompletionEstimation() {
		return completionEstimation;
	}

	public void setCompletionEstimation(int completionEstimation) {
		this.completionEstimation = completionEstimation;
	}


	public ArrayList<MenuItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(ArrayList<MenuItem> orderItems) {
		this.orderItems = orderItems;
	}

	public Payment getOrderPayment() {
		return orderPayment;
	}

	public void setOrderPayment(Payment orderPayment) {
		this.orderPayment = orderPayment;
	}

	public String getShop() {
		return shop;
	}

	public void setShop(String shop) {
		this.shop = shop;
	}

	public void setState(OrderState newState) {
		this.state = newState;
	}

	public boolean isCard(Payment p){
    	if(p.getPaymentMethod() == "card"){
    		return true;
		}
    	else{
    		return false;
		}
	}

//	public boolean isCompleted(){
//
//    	if
//
//	}

	public boolean isForDelivery() {

		if (orderType == "delivery"){
			return true;
		}
		else {
		return false;
	}
    }

	public Payment getPayment() {

		return this.orderPayment;
	}

}
