package com.example.deltasix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Confirm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if(extras.containsKey("Mobile")){
                String sMobile = extras.getString("Mobile");

                Toast.makeText(getApplicationContext(), sMobile, Toast.LENGTH_SHORT).show();
            }
        }
    }
}
