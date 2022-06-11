import com.example.project.Room;

public class Payment {


    private int total;

    public enum type{
      card, cash;
    }
    private String paymentMethod;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    public void setPaymentMethod(String payment){this.paymentMethod = payment; }

    public String getPaymentMethod(){return this.paymentMethod;}

}
