package com.moringaschool.linex_kenya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
//    public static final String TAG = MainActivity.class.getSimpleName();
//    private Button mGetStartedButton;
//    private EditText mcourseEditText;
    @BindView(R.id.getStartedButton) Button mGetStartedButton;
    @BindView(R.id.courseEditText) EditText mcourseEditText;
    @BindView(R.id.appNameTextView) TextView mAppNameTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        mcourseEditText = (EditText) findViewById(R.id.courseEditText);
//        mGetStartedButton = (Button) findViewById(R.id.getStartedButton);
        ButterKnife.bind(this);


        mGetStartedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String course = mcourseEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                intent.putExtra("course", course);
                startActivity(intent);

            }

        });
    }
}


