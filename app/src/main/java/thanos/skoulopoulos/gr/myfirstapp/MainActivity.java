package thanos.skoulopoulos.gr.myfirstapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.FocusFinder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button loginButton;
    Button registerButton;
    EditText emailEditText;
    EditText passwordEditText;
    TextView forgotPassword;
    String emailContent;
    String passwordContent;
    public static final String EMAIL = "email";
    public static final String PASSWORD = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();




        passwordEditText = findViewById(R.id.et_password);
        emailEditText = (EditText) findViewById(R.id.tv_username);
        loginButton = (Button) findViewById(R.id.btn_login);
        registerButton = (Button) findViewById(R.id.btn_register);
        forgotPassword = findViewById(R.id.tv_forgotPassword);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                emailContent = emailEditText.getText().toString();
                passwordContent = passwordEditText.getText().toString();
                String emptyUsernameOrPassword = getString(R.string.empty_username_or_password);
                String tooSmallPassword = getString(R.string.too_small_password);

                LoginValidator loginValidator = new LoginValidator();



                 if(loginValidator.checkValuesAreEmpty(emailContent,passwordContent)){

                    Context context = getApplicationContext();
                    CharSequence text = emptyUsernameOrPassword;
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                } else if (loginValidator.checkIfPasswordIsAtLeast8Chars(passwordContent))  {

                        Context context = getApplicationContext();
                        CharSequence text = tooSmallPassword ;
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                else {
                    Intent intent = new Intent(MainActivity.this, TasksActivity.class);
                    intent.putExtra(EMAIL, emailContent);
                    intent.putExtra(PASSWORD, passwordContent);
                    startActivity(intent);
                }
            }
        });

        emailEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO using this Drawable icon remomve  onclick
                emailEditText.setCompoundDrawablesWithIntrinsicBounds(0,0, 0, 0);

            }

        });

        emailEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (!emailEditText.isFocused()){
                    emailEditText.setCompoundDrawablesWithIntrinsicBounds(R.drawable.person,0, 0, 0);
                }
            }
        });

        passwordEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                passwordEditText.setCompoundDrawablesWithIntrinsicBounds(0,0,0,0);
            }
        });

//
//        passwordEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View view, boolean b) {
//                if(!passwordEditText.setCompoundDrawablesWithIntrinsicBounds(@android.R.drawable.ic_lock_idle_lock);)
//            }
//        });

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    MyDialogFragment fragment = MyDialogFragment.newInstance();
                    fragment.show(getSupportFragmentManager(), "MyDialogFragment");
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
