import java.util.ArrayList;

public class MenuItem {
    private String name;
    private float price;
    private String description;
    ArrayList<MenuItemOptions> items = new ArrayList<MenuItemOptions>();
    private String comments;
    private boolean available;

    private String getItemName() {

        return this.name;
    }

    private float getItemPrice() {

        return this.price;
    }

    private String getItemDescription() {

        return this.description;
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