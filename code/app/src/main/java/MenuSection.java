import java.util.ArrayList;

public class MenuSection {
    private String title;
    ArrayList<MenuItem> items = new ArrayList<MenuItem>();


    public void addItem(MenuItem newItem){

        this.items.add(newItem);
    }
}