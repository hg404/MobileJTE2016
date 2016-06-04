package com.example.mrizkijuanda.carimesjid;

import android.Manifest;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.model.*;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Maps extends ActionBarActivity implements OnMapReadyCallback{
    GoogleMap gMaps;
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.ic_launcher);

        Intent intent = getIntent();
        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.mapslbs);
        mapFragment.getMapAsync(this);
        try {
            initializeMaps();
            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(5.570813, 95.371471))
                    .visible(true)
                    .title("Masjid Jamik Unsyiah"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(5.576526, 95.347824))
                    .visible(true)
                    .title("MASJID BABUTAQWA"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(5.567396, 95.338656))
                    .visible(true)
                    .title("MASJID AGUNG AL MAKMUR"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(5.553695, 95.317064))
                    .visible(true)
                    .title("Masjid Raya Baiturrahman"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(5.572934, 95.362081))
                    .visible(true)
                    .title("MASJID AL HASYIMI"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(5.536532, 95.307286))
                    .visible(true)
                    .title("MASJID TEUKU UMAR"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(5.568481, 95.382698))
                    .visible(true)
                    .title("Masjid Tungkop"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(5.575091, 95.375494))
                    .visible(true)
                    .title("Masjid Tanjung Selamat"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(5.589204, 95.397947))
                    .visible(true)
                    .title("MASJID LAMBARO ANGAN"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(5.597532, 95.375880))
                    .visible(true)
                    .title("MASJID RAUDHATUL JANNAH KAJHU"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(5.411946, 95.445018))
                    .visible(true)
                    .title("Masjid Abu Indrapuri"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(5.440584, 95.401182))
                    .visible(true)
                    .title("MASJID BESAR SAMAHANI"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(5.380934, 95.957858))
                    .visible(true)
                    .title("Masjid Al Falah"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(5.355098, 95.962848))
                    .visible(true)
                    .title("Masjid Runtoh Tijue"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(5.281719, 95.977257))
                    .visible(true)
                    .title("Masjid Abu Daud Beureueh"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(5.275507, 95.983250))
                    .visible(true)
                    .title("Masjid Beurunuen"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(5.303518, 96.013809))
                    .visible(true)
                    .title("Masjid Kembang Tanjong"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(5.347175, 95.990621))
                    .visible(true)
                    .title("Masjid Simpang Tiga"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(4.711569, 95.520148))
                    .visible(true)
                    .title("Masjid Rodatu Ulum Lhok Geulumpang"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(4.826935, 95.429826))
                    .visible(true)
                    .title("Masjid Jamik Baiturrahim Babah Nipah"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(4.698163, 95.521602))
                    .visible(true)
                    .title("Masjid Kualadoe"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(4.661203, 95.554836))
                    .visible(true)
                    .title("Masjid Gampong Baro"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(4.648873, 95.587691))
                    .visible(true)
                    .title("Masjid Panton Makmur"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(4.634473, 95.580937))
                    .visible(true)
                    .title("Masjid Agung Jabal Rahmah"));


            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return;
            }

            gMaps.setMyLocationEnabled(true);
            CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.572934, 95.362081)).zoom(13).build();

            gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 500, null);
        } catch (Exception e) {
        }
    }
    public void rood(View view)
    {
        gMaps.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    }
    public void sat(View view)
    {
        gMaps.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
    }
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private void initializeMaps() {
        if (gMaps == null) {
            gMaps = ((MapFragment) getFragmentManager().findFragmentById(R.id.mapslbs)).getMap();

            if(gMaps == null) {
                Toast.makeText(getApplicationContext(), "Unable to create maps", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        gMaps.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    }


    public void home(View view){

        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);
    }
}