import com.example.project.Menu;

public abstract class MenuItem extends Menu {

  private  int chosenItem;
  private String chosenItemName;
  private float chosenItemPrice;
  private int Ingredients;

    public int getChosenItem() {
        return chosenItem;
    }

    public void setChosenItem(int chosenItem) {
        this.chosenItem = chosenItem;
    }

    public String getChosenItemName() {
        return chosenItemName;
    }

    public void setChosenItemName(String chosenItemName) {
        this.chosenItemName = chosenItemName;
    }

    public float getChosenItemPrice() {
        return chosenItemPrice;
    }

    public void setChosenItemPrice(float chosenItemPrice) {
        this.chosenItemPrice = chosenItemPrice;
    }

    public int getIngredients() {
        return Ingredients;
    }

    public void setIngredients(int ingredients) {
        Ingredients = ingredients;
    }
}
