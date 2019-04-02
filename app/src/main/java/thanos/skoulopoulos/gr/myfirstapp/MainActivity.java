package thanos.skoulopoulos.gr.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button loginButton;
    Button registerButton;
    EditText emailEditText;
    EditText passwordEditText;
    String emailContent;
    String passwordContent;
    public static final String EMAIL = "email";
    public static final String PASSWORD = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        passwordEditText = findViewById(R.id.tv_pwd);
        emailEditText = (EditText) findViewById(R.id.tv_email);
        loginButton = (Button) findViewById(R.id.btn_login);
        registerButton = (Button) findViewById(R.id.btn_register);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                emailContent = emailEditText.getText().toString();
                passwordContent = passwordEditText.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(EMAIL, emailContent);
                intent.putExtra(PASSWORD,passwordContent);
                startActivity(intent);

            }
        });


        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RegisterActivity.class));

            }
        });



    }

}
