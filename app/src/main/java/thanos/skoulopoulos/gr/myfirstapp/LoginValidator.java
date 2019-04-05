package thanos.skoulopoulos.gr.myfirstapp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginValidator {

    public boolean checkValuesAreEmpty(String username,String password){

        return username.isEmpty() || password.isEmpty();

    }

    public boolean checkIfPasswordIsAtLeast8Chars(String password){

        return  password.length() < 7;

    }

    public boolean checkAtLeastOneNumb(String password){

        return !Pattern.compile(".*\\d+.*").matcher(password).matches();
    }



    public boolean checkPasswordConfirmation (String password, String passwordConfirmation){

        return  !password.equals(passwordConfirmation);
    }
}
