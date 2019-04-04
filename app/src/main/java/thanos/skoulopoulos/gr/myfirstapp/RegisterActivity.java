package thanos.skoulopoulos.gr.myfirstapp;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText newUsername;
    EditText newPassword;
    EditText newPasswordConfirmation;
    Button buttonNewAccount;
    String newUsernameText;
    String newPasswordText;
    String newPasswordConfirmationText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        newUsername = findViewById(R.id.et_NewUserName);
        newPassword =  findViewById(R.id.et_NewPassword);
        newPasswordConfirmation = findViewById(R.id.et_PasswordConfirmation);
        buttonNewAccount = findViewById(R.id.button_newAccount);


            buttonNewAccount.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    newUsernameText = newUsername.getText().toString();
                    newPasswordText = newPassword.getText().toString();
                    newPasswordConfirmationText = newPasswordConfirmation.getText().toString();
                    String emptyUsernameOrPassword = getString(R.string.empty_username_or_password);
                    String tooSmallPassword = getString(R.string.too_small_password);
                    String  passwordconfirmationFailed = getString(R.string.password_confirmation_is_incorrect);

                    LoginValidator validator = new LoginValidator();
                    Context context = getApplicationContext();
                    int duration = Toast.LENGTH_SHORT;


                    if (validator.checkValuesAreEmpty(newUsernameText,newPasswordText) || validator.checkValuesAreEmpty(newUsernameText,newPasswordConfirmationText) || validator.checkValuesAreEmpty(newPasswordText,newPasswordConfirmationText)){

                        Toast.makeText(context, emptyUsernameOrPassword, duration).show();

                    }else if (validator.checkIfPasswordIsAtLeast8Chars(newPasswordText)) {
                        Toast.makeText(context, tooSmallPassword, duration).show();

                    }else if (validator.checkPasswordConfirmation(newPasswordText,newPasswordConfirmationText)){
                        Toast.makeText(context, passwordconfirmationFailed, duration).show();

                    }else Toast.makeText(context, "Account created", duration).show();


                }
            });
    }

}
