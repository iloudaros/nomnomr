import java.time.LocalDate;

// Class that describes a Credit Card Object.
public class Card
{
    private String number;			// The Card's number.
    private String cardHolder;		// The Card's Holder.
    private String cvv;				// The Card's CVV.
    private LocalDate expiryDate;	// The Card's Expiration Date.

    // Card Object Constructor.
    public Card(String newNumber, String newCardHolder, String newCvv, LocalDate newExpiryDate) {
        number = newNumber;
        cardHolder = newCardHolder;
        cvv = newCvv;
        expiryDate = newExpiryDate;
    }

    // Set Card Number.
    public void setNumber(String newNumber) {
        this.number = newNumber;
    }

    // Set Card Holder.
    public void setCardHolder(String newHolder) {
        this.cardHolder = newHolder;
    }

    // Set CVV.
    public void setCvv(String newCvv) {
        this.cvv = newCvv;
    }

    // Set Expiry Date.
    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    // Return the current Card Object.
    public Card getCard() {
        return this;
    }

}