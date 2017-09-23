package com.example.deltasix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txtMobile = (TextView) findViewById(R.id.txtMobileNumber);
                String check = txtMobile.getText().toString();

                    if (!check.matches(getString(R.string.RexMobile))) {
                        Toast.makeText(Login.this, getString(R.string.Mobile_No), Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Login.this, "شماره موبایل معتبر هست", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), Confirm.class);
                        String sMobile = txtMobile.getText().toString();
                        intent.putExtra("Mobile", sMobile);
                        startActivity(intent);
                    }
                /*TextView txtMobile = (TextView) findViewById(R.id.txtMobileNumber);
                Intent intent = new Intent(getApplicationContext(),Confirm.class);
                String sMobile =  txtMobile.getText().toString();
                intent.putExtra("Mobile",sMobile);
                startActivity(intent);
                startActivity(new Intent(Login.this,Confirm.class));*/
            }
        });
    }
}
