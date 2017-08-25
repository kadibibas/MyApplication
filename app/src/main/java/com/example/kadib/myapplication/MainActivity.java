package com.example.kadib.myapplication;


import android.support.design.widget.FloatingActionButton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;


import com.getbase.floatingactionbutton.FloatingActionsMenu;
import com.mapbox.mapboxsdk.Mapbox;

import com.mapbox.mapboxsdk.constants.Style;

import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;


public class MainActivity extends AppCompatActivity  {

    FloatingActionsMenu fabMenu;
    MapView mapView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Mapbox.getInstance(this, "pk.eyJ1Ijoia2FkaWJpYmFzIiwiYSI6ImNqNnJ2bXN0aTBkZDYyeG56bnA5OGoxN3EifQ.gtbNnIgSv-jG9ssLf9I7SA");

        setContentView(R.layout.activity_main);

        mapView = (MapView) findViewById(R.id.mapview);
        mapView.setStyleUrl(Style.MAPBOX_STREETS);
        mapView.onCreate(savedInstanceState);


        fabMenu = (FloatingActionsMenu) findViewById(R.id.fab_menu);




    }



    public void selectStyle(View view)
    {
        fabMenu.collapse();
        mapView.setStyleUrl(Style.DARK);
    }

    public void selectStyle2(View view)
    {
        fabMenu.collapse();
        mapView.setStyleUrl(Style.LIGHT);
    }

    public void selectStyle3(View view)
    {
        fabMenu.collapse();
        mapView.setStyleUrl("mapbox://styles/kadibibas/cj6ou588l1zsn2rszxeic9w37");
    }

    public void selectStyle4(View view)
    {
        fabMenu.collapse();
        mapView.setStyleUrl(Style.SATELLITE_STREETS);
    }

    public void selectStyle5(View view)
    {
        fabMenu.collapse();
        mapView.setStyleUrl(Style.MAPBOX_STREETS);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mapView.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mapView.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }

}
