package com.moringaschool.linex_kenya;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class CommodityActivity extends AppCompatActivity {
    public static final String TAG = CommodityActivity.class.getSimpleName();
    private TextView mcourseTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commodity2);


         mcourseTextView = (TextView) findViewById(R.id.courseTextView);


        Intent intent = getIntent();
        String phone = intent.getStringExtra("phone");
        mcourseTextView.setText("Trending Ads:" );


    }



}