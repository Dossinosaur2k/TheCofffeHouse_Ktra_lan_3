package com.example.thecoffeehouse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class store_screen extends AppCompatActivity implements OnMapReadyCallback {
    Spinner spinner1;
    RecyclerView recycle_quan;
    iteammapAdapter iteammapAdapter;
    String namequan;
    private GoogleMap gm;
    double vx,vy;
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_screen);
        createMap();
        Intent intent = getIntent();
        vx =intent.getDoubleExtra("x",16.047199);
        vy =intent.getDoubleExtra("y",108.219955);
        namequan=intent.getStringExtra("namequan");
        Log.d("locationx", String.valueOf(vx));
        Employee[] employees = EmployeeDataUtils.getEmployees();
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<Employee> LTRadapter1 = new ArrayAdapter<Employee>(store_screen.this, R.layout.spinner_item, employees);
        LTRadapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner1.setAdapter(LTRadapter1);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.store);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.news:
                        startActivity(new Intent(getApplicationContext(),Home.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.delivery:
                        startActivity(new Intent(getApplicationContext(),orderScreen.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.store:
//                        startActivity(new Intent(getApplicationContext(),store_screen.class));
//                        overridePendingTransition(0,0);
                        return true;
                    case R.id.account:
                        startActivity(new Intent(getApplicationContext(),account_screen.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
        List<itemmap> mapquan = new ArrayList<>();
        mapquan.add(new itemmap("THE COFFEE HOUSE Nguyễn Văn Linh","2 Nguyễn Văn Linh",16.0606967,108.2218018,R.drawable.housenguyenvanlinh));
        mapquan.add(new itemmap("THE COFFEE HOUSE Pasteur ","80 pasteur",16.0697464,108.2172623,R.drawable.housepasteur));
        mapquan.add(new itemmap("THE COFFEE HOUSE Núi Thành","1 Núi Thành",16.0545827,108.2203984,R.drawable.housenuithanh));
        mapquan.add(new itemmap("THE COFFEE HOUSE Trần Hưng Đạo","461 Trần Hưng Đạo",16.0643676, 108.2301452,R.drawable.housetranhungdao));
        mapquan.add(new itemmap("THE COFFEE HOUSE Nguyễn Chí Thanh","80A Nguyễn Chí Thanh",16.0726908,108.2206852,R.drawable.housenguyenchithanh));

        setRecycle_mapquan(mapquan);

    }

    public void setRecycle_mapquan(List<itemmap> itemList ){
        recycle_quan=findViewById(R.id.recycle_quan);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recycle_quan.setLayoutManager(layoutManager);
        iteammapAdapter = new iteammapAdapter(this,itemList);
        recycle_quan.setAdapter(iteammapAdapter);
    }
    public void createMap() {
        SupportMapFragment smf = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        smf.getMapAsync((OnMapReadyCallback) this);
    }
    @Override
    public void onResume() {
        super.onResume();
        createMap();
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng hcm = new LatLng(vx, vy);
        gm = googleMap;
        gm.addMarker(new MarkerOptions().position(hcm).title(namequan));
        CameraPosition cp = new CameraPosition.Builder().target(hcm).zoom(18).build();
        gm.animateCamera(CameraUpdateFactory.newCameraPosition(cp));
    }
}