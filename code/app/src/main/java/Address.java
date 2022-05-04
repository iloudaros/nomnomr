public class Address {
    private String AddressName;
    private String StreetName;
    private int StreetNumber;
    private User OrderUsername;
    private int FloorNumber;
    private Map mapTracking; 


    public void getAddressName(String AddressName) {
        this.AddressName = AddressName;
    }

    public void setAddressName() {
        return AddressName;
    }



    public void getStreetName(String StreetName) {
        this.StreetName = StreetName;
    }

    public void setStreetName() {
        return StreetName;
    }



    public int StreetNumber() {
        return StreetNumber;
    }

    public void setStreetNumber(int StreetNumber) {
        this.StreetNumber = StreetNumber;
    }



    public User getOrderUsername(){
		return OrderUsername;
	}

    

    public int FloorNumber() {
        return FloorNumber;
    }

    public void setFloorNumber(int FloorNumber) {
        this.FloorNumber = FloorNumber;
    }



    public Map getmapTracking(){
		return mapTracking;
	}

}


    