
import android.view.MenuItem;

import com.example.project.Room;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Order extends Room {
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
//    public static void main (String[] args){
//	}

	public int getId(){
    	return Id;
	}
	public void setId(int id) {
		this.Id = Id;
	}

	public Boolean getDelivery() {
		return delivery;
	}
	public void setDelivery(Boolean delivery) {
		this.delivery = delivery;
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



}
