import javax.tools.DocumentationTool.Location;

// Class that describes a Customer's Address.
public class Address {

    private String street;
    private int number;
    private String city;
    private Location location;

    // Address Contructor.
    public Address(String newStreet, int newNumber, String newCity, Location newLocation) {

        street = newStreet;
        number = newNumber;
        city = newCity;
        location = newLocation;
    }
}
