package com.example.adp_27_register;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText first_name, last_name, username;
    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        first_name = findViewById(R.id.first_name);
        last_name = findViewById(R.id.last_name);
        username = findViewById(R.id.username);

        register = findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(first_name.getText().length() > 0 && last_name.getText().length() > 0 && username.getText().length() > 0) {
                    String first_nameVal = first_name.getText().toString();
                    String last_nameVal = last_name.getText().toString();
                    String usernameVal = username.getText().toString();

                    String toastMessage = "your first name is " + first_nameVal + " and your last name is " + last_nameVal + " and your username is " + usernameVal;
                    Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}