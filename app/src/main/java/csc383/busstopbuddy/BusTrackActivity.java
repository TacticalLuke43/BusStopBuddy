package csc383.busstopbuddy;

import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import static csc383.busstopbuddy.R.id.map;

public class BusTrackActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_track);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        /*// Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));*/

        LatLng flint = new LatLng(43.02, -83.69);
        mMap.addMarker(new MarkerOptions().position(flint).title("U of M Flint"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(flint, 15));

        Polyline testRoute1 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(43.019595, -83.685447)
                        , new LatLng(43.018385, -83.685345)
                        , new LatLng(43.016557, -83.689390)
                        , new LatLng(43.017436, -83.690173)
                        ,new LatLng(43.019595, -83.685447))
                .width(5)
                .color(Color.RED));

        Polyline testRoute2 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(43.019595, -83.685447)
                        , new LatLng(43.018385, -83.685345)
                        , new LatLng(43.017326, -83.684830)
                        , new LatLng(43.014980, -83.689915)
                        , new LatLng(43.021946, -83.695827)

                        , new LatLng(43.021946, -83.695827))
                .width(5)
                .color(Color.BLUE));
    }
}
