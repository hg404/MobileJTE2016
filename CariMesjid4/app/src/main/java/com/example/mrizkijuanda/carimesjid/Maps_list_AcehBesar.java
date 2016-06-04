package com.example.mrizkijuanda.carimesjid;

import android.Manifest;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class Maps_list_AcehBesar extends ActionBarActivity implements OnMapReadyCallback {
    GoogleMap gMaps;
    String nama;


    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_list);
        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.mapslbs);
        mapFragment.getMapAsync(this);
        Intent intent = getIntent();
        nama = intent.getStringExtra("nama");
        setInfo(nama);
    }

    public void setInfo(String place) {
        if (place.equalsIgnoreCase("satu")) {
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                        .position(new LatLng(5.568481, 95.382698))
                        .visible(true)
                        .title("Masjid Tungkop"));
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
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.568481, 95.382698)).zoom(15).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);
            } catch (Exception e) {
            }
        } else if (place.equalsIgnoreCase("dua")) {
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                        .position(new LatLng(5.575091, 95.375494))
                        .visible(true)
                        .title("Masjid Tanjung Selamat"));
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
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.575091, 95.375494)).zoom(15).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);
            } catch (Exception e) {
            }
        } else {
        }
        if (place.equalsIgnoreCase("tiga")) {
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                        .position(new LatLng(5.589204, 95.397947))
                        .visible(true)
                        .title("MASJID LAMBARO ANGAN"));
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
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.589204, 95.397947)).zoom(15).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);
            } catch (Exception e) {
            }
        } else if (place.equalsIgnoreCase("empat")) {
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                        .position(new LatLng(5.597532, 95.375880))
                        .visible(true)
                        .title("MASJID RAUDHATUL JANNAH KAJHU"));
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
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.597532, 95.375880)).zoom(15).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);
            } catch (Exception e) {
            }
        } else {
        }
        if (place.equalsIgnoreCase("lima")) {
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                        .position(new LatLng(5.411946, 95.445018))
                        .visible(true)
                        .title("Masjid Abu Indrapuri"));
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
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.411946, 95.445018)).zoom(15).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);
            } catch (Exception e) {
            }
        } else if (place.equalsIgnoreCase("enam")) {
            try {
                initializeMaps();
                gMaps.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                        .position(new LatLng(5.440584, 95.401182))
                        .visible(true)
                        .title("MASJID BESAR SAMAHANI"));
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
                CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.440584, 95.401182)).zoom(15).build();
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);
            } catch (Exception e) {
            }
        } else {
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


    public void home (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
