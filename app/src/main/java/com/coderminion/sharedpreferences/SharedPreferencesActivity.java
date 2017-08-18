package com.coderminion.sharedpreferences;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SharedPreferencesActivity extends AppCompatActivity {

    Button login;
    EditText usernameEditText,passwordEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);

        login = (Button)findViewById(R.id.login);
        usernameEditText = (EditText) findViewById(R.id.username);
        passwordEditText = (EditText) findViewById(R.id.password);

        usernameEditText.setText(StoreData.LoadString("username"));
        passwordEditText.setText(StoreData.LoadString("password"));

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StoreData.SaveString("username",usernameEditText.getText().toString());
                StoreData.SaveString("password",passwordEditText.getText().toString());
                Toast.makeText(getApplicationContext(),"Values Saved, Now close and reopen app and check values in the fiealds",Toast.LENGTH_LONG).show();
            }
        });
    }
}
