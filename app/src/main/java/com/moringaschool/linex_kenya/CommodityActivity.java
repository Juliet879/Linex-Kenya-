package com.moringaschool.linex_kenya;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CommodityActivity extends AppCompatActivity {
    private String[] items = new String [] {"Bedding", "vehicles", "food" ,"clothes" ,"shoes"};
    public static final String TAG = CommodityActivity.class.getSimpleName();
    private TextView mcourseTextView;


    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commodity);

        mcourseTextView = (TextView) findViewById(R.id.courseTextView);


        Intent intent = getIntent();
        String course = intent.getStringExtra("course");
        mcourseTextView.setText("Trending Ads:" + course);



            }



}