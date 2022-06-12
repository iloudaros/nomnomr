//import com.google.android.gms.common.api.GoogleApiClient;
//import com.google.android.gms.maps.GoogleMap;
//import android.location.Location;
//import android.view.MenuItem;
//
//import com.google.android.gms.common.ConnectionResult;
//import com.google.android.gms.location.LocationRequest;
//import com.google.android.gms.maps.model.Marker;
//import com.google.android.gms.maps.model.MarkerOptions;
//import com.google.android.gms.location.LocationServices;

import java.util.ArrayList;
import java.util.HashMap;

public class Map<point, id> {

     private HashMap <point, id>  deliveryPersonLocation;

     private ArrayList<HomeAddress> addresses = new ArrayList<>();

    public ArrayList<HomeAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<HomeAddress> addresses) {
        this.addresses = addresses;
    }

   public boolean addressExists( HomeAddress a ){
       boolean address;
       if ( a.getAddressName() == "exists"){
            return true;
        }
        else{
            return false;
        }

   }

   public ArrayList<HomeAddress> getGpsAddress(){
        return addresses;
   }

   public HashMap<point, id> getDeliveryPosition(){
        return deliveryPersonLocation;
   }

    
}