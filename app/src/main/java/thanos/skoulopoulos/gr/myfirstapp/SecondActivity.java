package thanos.skoulopoulos.gr.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    TextView emailView;
    TextView passwordView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secomd);

        emailView = findViewById(R.id.tv_emailView);
        passwordView = findViewById(R.id.tv_passwordView);


        Intent intent = getIntent();
        if (intent != null)
        {
            String email = intent.getStringExtra(MainActivity.EMAIL);
            String password =  intent.getStringExtra(MainActivity.PASSWORD);

            emailView.setText(email);
            passwordView.setText(password);
        }


    }
}
