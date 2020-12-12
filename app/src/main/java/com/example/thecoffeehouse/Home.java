package com.example.thecoffeehouse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {
    RecyclerView recycleuudai, recyclecapnhat,recycle_lover;
    itemAdapter itemAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView imageView = findViewById(R.id.imageView3);
        imageView.setOnClickListener(view -> {
            Intent intent = new Intent(Home.this, NotificationActivity.class);
            startActivity(intent);
        });

        List<item> uudailist = new ArrayList<>();
        uudailist.add(new item("The Coffee House đồng hành cùng bạn \"Go Green\"!","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Order ngay",R.drawable.item_1));
        uudailist.add(new item("Top 10 cửa hàng The Coffee House bạn nên trải nghiệm tại Hà Nội","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Order ngay",R.drawable.item_2));
        uudailist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Order ngay",R.drawable.item_3));
        uudailist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Order ngay",R.drawable.item_4));
        uudailist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Order ngay",R.drawable.item_5));

        List<item> capnhatlist = new ArrayList<>();
        capnhatlist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết",R.drawable.item_1));
        capnhatlist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết",R.drawable.item_2));
        capnhatlist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết",R.drawable.item_3));
        capnhatlist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết",R.drawable.item_4));
        capnhatlist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết",R.drawable.item_5));

        List<item>  loverlist = new ArrayList<>();
        loverlist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết",R.drawable.item_1));
        loverlist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết",R.drawable.item_2));
        loverlist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết",R.drawable.item_3));
        loverlist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết",R.drawable.item_4));
        loverlist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết",R.drawable.item_5));

        setRecycle_uudai(uudailist);
        setRecyclecapnhat(capnhatlist);
        setRecycle_lover(loverlist);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.news);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.news:
//                        startActivity(new Intent(getApplicationContext(),Home.class));
//                        overridePendingTransition(0,0);
                        return true;
                    case R.id.delivery:
                        startActivity(new Intent(getApplicationContext(),orderScreen.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.store:
                        startActivity(new Intent(getApplicationContext(),store_screen.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.account:
                        startActivity(new Intent(getApplicationContext(),account_screen.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
    public void setRecycle_uudai(List<item> itemList ){
        recycleuudai=findViewById(R.id.recycle_uudai);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recycleuudai.setLayoutManager(layoutManager);
        itemAdapter = new itemAdapter(this,itemList);
        recycleuudai.setAdapter(itemAdapter);
    }
    public void setRecyclecapnhat(List<item> itemList ){
        recyclecapnhat=findViewById(R.id.recycle_capnhat);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recyclecapnhat.setLayoutManager(layoutManager);
        itemAdapter = new itemAdapter(this,itemList);
        recyclecapnhat.setAdapter(itemAdapter);
    }
    public void setRecycle_lover(List<item> itemList ){
        recycle_lover=findViewById(R.id.recycle_lover);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recycle_lover.setLayoutManager(layoutManager);
        itemAdapter = new itemAdapter(this,itemList);
        recycle_lover.setAdapter(itemAdapter);
    }
}