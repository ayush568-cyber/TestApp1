package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button send_button;
    EditText send_text1;
    EditText send_text2;
    EditText send_text3;
    EditText send_text4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        send_button = (Button)findViewById(R.id.button);
        send_text1=(EditText)findViewById(R.id.user);
        send_text2=(EditText)findViewById(R.id.age);
        send_text3=(EditText)findViewById(R.id.mob);
        send_text4=(EditText)findViewById(R.id.loc);
        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // get the value which input by user in EditText
                // and convert it to string
                String value1 =send_text1.getText().toString();
                String value2 =send_text2.getText().toString();
                String value3 =send_text3.getText().toString();
                String value4 =send_text4.getText().toString();
                // Create the Intent object of this class Context() to Second_activity class
                Intent intent = new Intent(MainActivity.this,Profile.class);

                // now by putExtra method put the value in key, value pair
                // key is message_key by this key we will receive the value, and put the string

                intent.putExtra("key1",value1);
                intent.putExtra("key2",value2);
                intent.putExtra("key3",value3);
                intent.putExtra("key4",value4);
                // start the Intent
                startActivity(intent);
            }
        });
    }
}
