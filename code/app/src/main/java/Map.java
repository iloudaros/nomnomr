import com.google.android.gms.common.api.GoogleApiClient;  
import com.google.android.gms.maps.GoogleMap; 
import android.location.Location;  
import com.google.android.gms.common.ConnectionResult;   
import com.google.android.gms.location.LocationRequest;  
import com.google.android.gms.maps.model.Marker;  
import com.google.android.gms.maps.model.MarkerOptions;  
import com.google.android.gms.location.LocationServices;  

public class Map {
    private GoogleMap mMap;  
    private Location mLastLocation;  
    private Marker mCurrLocationMarker;  
    private GoogleApiClient mGoogleApiClient;  
    private LocationRequest mLocationRequest; 
    


    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap; 
    }

    protected synchronized void buildGoogleApiClient() {  
        mGoogleApiClient = new GoogleApiClient.Builder(this)  
                .addConnectionCallbacks(this)  
                .addOnConnectionFailedListener(this)  
                .addApi(LocationServices.API).build();  
        mGoogleApiClient.connect();  
    }     


    public void onConnected(Bundle bundle) {  
  
        mLocationRequest = new LocationRequest();  
    }


    public void onConnectionSuspended(int i) {  
  
    }  
  
    public void onLocationChanged(Location location) {  
  
        mLastLocation = location;  
        if (mCurrLocationMarker != null) {  
            mCurrLocationMarker.remove();  
        }  
    }

    
    public void onConnectionFailed(ConnectionResult connectionResult) {  
  
    }  
    
}