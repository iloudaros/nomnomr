import com.example.project.Room;

public class Payment extends Room {

    private int total;

    enum type {
       card,
       cash
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
