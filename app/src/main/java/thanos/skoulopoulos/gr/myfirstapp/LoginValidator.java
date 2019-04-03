package thanos.skoulopoulos.gr.myfirstapp;

public class LoginValidator {

    public boolean checkValuesAreEmpty(String username,String password){

        return username.isEmpty() || password.isEmpty();

    }

    public boolean checkIfPasswordIsAtLeast8Chars(String password){

        return  password.length() < 7;

    }
}
