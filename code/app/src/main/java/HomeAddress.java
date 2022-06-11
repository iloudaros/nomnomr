// Class that describes a Customer's Address.
public class HomeAddress {

    private String street;
    private int number;
    private String city;
    private Location location;
    private int floorNumber;

    // Address Contructor.
    public HomeAddress(String newStreet, int newNumber, String newCity, Location newLocation, int newFloorNumber) {

        street = newStreet;
        number = newNumber;
        city = newCity;
        location = newLocation;
        floorNumber = newFloorNumber;
    }
}