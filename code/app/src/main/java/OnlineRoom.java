import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Integer;

public class OnlineRoom {


    private HashMap<Shop, Integer> totalLikes;
    private HashMap<Shop, Integer> totalSuperLikes;
    private CategoryList totalCategories;
    private ArrayList<String> roomCustomers;
    private Order finalOrder;


    public void mergeLikes(ArrayList<Shop> newLikes){ //Προσθέτει 1 like σε κάθε μαγαζί μέσα στο totalLikes που υπάρχει στο newLikes
        for (int i=0; i< newLikes.size();i++)
        {
            Shop key = newLikes.get(i);
            if (this.totalLikes.containsKey(key)) {
                Integer previousLikes = this.totalLikes.get(key);
                this.totalLikes.replace(key, Integer(previousLikes.intValue()+1));
            }
            else
            {
                this.totalLikes.put(newLikes.get(i), Integer(1));
            }

        }
    }

    public ArrayList<Shop> getShopList(){

    }


}
