package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        TextView receiver_msg1;
        TextView receiver_msg2;
        TextView receiver_msg3;
        TextView receiver_msg4;

            receiver_msg1 = (TextView)findViewById(R.id.received_value_id1);
            receiver_msg2 = (TextView)findViewById(R.id.received_value_id2);
            receiver_msg3 = (TextView)findViewById(R.id.received_value_id3);
            receiver_msg4 = (TextView)findViewById(R.id.received_value_id4);
            // create the get Intent object
            Intent intent = getIntent();

            // receive the value by getStringExtra() method
            // and key must be same which is send by first activity
            String str1 = intent.getStringExtra("key1");
            String str2 = intent.getStringExtra("key2");
            String str3 = intent.getStringExtra("key3");
            String str4 = intent.getStringExtra("key4");
            // display the string into textView
            receiver_msg1.setText(str1);
            receiver_msg2.setText(str2);
            receiver_msg3.setText(str3);
            receiver_msg4.setText(str4);
        }
    }