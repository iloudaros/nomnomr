public class Address {
    private String AddressName;
    private String StreetName;
    private int StreetNumber;
    private User OrderUsername;
    private int FloorNumber;
    private Map Marker; 



    public void setAddressName(String addressName) {
        AddressName = addressName;
    }

    public String getAddressName() {
        return AddressName;
    }

    public int getStreetNumber() {
        return StreetNumber;
    }

    public void setStreetName(String streetName) {
        StreetName = streetName;
    }

    public int StreetNumber() {
        return StreetNumber;
    }

    public void setStreetNumber(int StreetNumber) {
        this.StreetNumber = StreetNumber;
    }


    public User getOrderUsername() {
        return OrderUsername;
    }

    public int FloorNumber() {
        return FloorNumber;
    }

    public void setFloorNumber(int FloorNumber) {
        this.FloorNumber = FloorNumber;
    }


    public Map getMarker() {
        return Marker;
    }
}


    