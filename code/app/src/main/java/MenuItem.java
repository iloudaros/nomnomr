import java.util.ArrayList;

public class MenuItem {
    private String Name;
    private float itemPrice;
    private String description;
    ArrayList<MenuItemOptions> items = new ArrayList<MenuItemOptions>();
    private String comments;
    private boolean available;

    private String getItemName() {

        return this.ItemName;
    }

    private float getItemPrice() {

        return this.ItemPrice;
    }

    private String getItemDescription() {

        return this.ItemDescription;
    }

    private ArrayList<MenuItemOptions> getItems(){

        return this.items;
    }

    private String getComments(){

        return this.comments;
    }

    private boolean isAvailable(){

        return this.available;
    }

}