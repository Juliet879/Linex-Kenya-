package com.moringaschool.linex_kenya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    public static final String TAG = RegisterActivity.class.getSimpleName();
    private TextView mregisterTextView;
    private Button mAccountButton;
    private EditText mEditTextPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mEditTextPhone = (EditText) findViewById(R.id.editTextPhone);
        mAccountButton = (Button) findViewById(R.id.accountButton);
        mregisterTextView = (TextView) findViewById(R.id.registerTextView);

        Intent intent = getIntent();
        String course = intent.getStringExtra("course");
        mregisterTextView.setText("Welcome to Linex " );

        mAccountButton.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  String phone = mEditTextPhone.getText().toString();
                                                  Intent intent = new Intent(RegisterActivity.this, CommodityActivity.class);
                                                  intent.putExtra("phone", phone);
                                                  startActivity(intent);

                                              }
                                          });


    }
    }
