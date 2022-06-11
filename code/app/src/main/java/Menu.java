import java.util.ArrayList;

public class Menu {
    ArrayList<MenuSection> contents = new ArrayList<MenuSection>();

    public void addSection(MenuSection newMenuSection){
        this.contents.add(newMenuSection);
    }
}