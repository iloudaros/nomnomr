import java.util.ArrayList;

// Class that describes a Customer's Wallet.
public class Wallet {

    private ArrayList<Card> cards = new ArrayList<Card>();

    // Wallet Constructor
    public Wallet(ArrayList<Card> newCards) {

        cards = newCards;
    }

    // Return the current Wallet Object.
    public Wallet getWallet() {

        return this;
    }

    // Save a newly added Card in the Wallet.
    public void saveCard(Card newCard) {

        this.cards.add(newCard);
    }
}
