package com.practice.tocode.back.hemaexpenses;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText password;
    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.main_activity_editText_name);
        password = (EditText) findViewById(R.id.main_activity_editText_password);
        ok = (Button) findViewById(R.id.main_activity_button_ok);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(name.getText().toString().isEmpty() | password.getText().toString().isEmpty()) {
                   Toast.makeText(getApplicationContext(),"Fields should not be empty",Toast.LENGTH_SHORT).show();
               }
                else{
                   boolean id = name.getText().toString().contentEquals("hema");
                   boolean paswrd = password.getText().toString().contentEquals("password");

                   if(id && paswrd){
                       Intent intent = new Intent(MainActivity.this,NextMainActivity.class);
                       startActivity(intent);
                   }
                   else{
                       Toast.makeText(getApplicationContext(),"Wrong Credentials",Toast.LENGTH_SHORT).show();
                   }

               }
            }
        });
    }
}