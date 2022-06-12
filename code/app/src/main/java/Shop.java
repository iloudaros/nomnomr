import java.util.ArrayList;
import java.util.Queue;

public class Shop {

    private String id;
    private String name;
    private ArrayList<Category> foodCatergories;
    private Menu shopMenu;
    private int orderCounter;
    private float avgDeliveryTime;
    private Queue<Order> orderQueue;
    private HomeAddress shopAddress;
    private String shopPhoto;
    private boolean available;
    private float minOrder;

    public String getId() {

        return this.id;
    }

    public void setId(String newId) {

        this.id = newId;
    }

    public String getName() {

        return this.name;
    }

    public void setName(String newName) {

        this.name = newName;
    }

    public ArrayList<Category> getCategories() {

        return this.foodCatergories;
    }

    public void addCategory(Category newCategory) {

        this.foodCatergories.add(newCategory);
    }

    public void setCategoryList (ArrayList<Category> newList) {

        this.foodCatergories = newList;
    }

    public Menu getShopMenu() {

        return this.shopMenu;
    }

    public void setShopMenu(Menu newMenu) {

        this.shopMenu = newMenu;
    }

    public void setOrderCounter(int val) {

        this.orderCounter = val;
    }

    public void incrementOrderCounter() {

        this.orderCounter++;
    }

    public void setAvgDeliveryTime(float newTime) {

        this.avgDeliveryTime = newTime;
    }

    public float calculateAvgDeliveryTime() {

        return this.avgDeliveryTime;
    }

    public void setOrderQueue(Queue<Order> queue) {

        this.orderQueue = queue;
    }

    public Queue<Order> getOrderQueue() {

        return this.orderQueue;
    }

    public void addToQueue(Order order) {

        this.orderQueue.add(order);
    }

    public void setShopAddress(HomeAddress address) {

        this.shopAddress = address;
    }

    public HomeAddress getShopAddress() {

        return this.shopAddress;
    }

    public void setShopPhoto(String photo) {

        this.shopPhoto = photo;
    }

    public String getPhotoLocation() {

        return this.shopPhoto;
    }

    public boolean pingShop() {

        return this.available;
    }

    public float getMinOrder() {

        return this.minOrder;
    }

    // Check for minimum Order.
    public boolean minOrderCheck(Order order) {

        if (order.getOrderPayment().getTotal() >= this.minOrder) {

            return true;
        }
        else {

            return false;
        }
    }

    // Get Available Menu Items. For the purpose of this example, it returns the whole Menu.
    public Menu getAvailableItems() {

        return this.shopMenu;
    }

}
