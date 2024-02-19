package common;

import java.util.regex.*;

public class InOutUtils {
    public static boolean isValidUsername(String username) {
        return username.matches("^[a-zA-Z0-9]{6,20}$");
    }

    public static boolean isValidPassword(String password) {
        return password.length() >= 8;
    }

    public static boolean isValidFullName(String fullName) {
        return fullName.matches("^[a-zA-Z\\s]+$");
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("^0[0-9]+$");
    }

    public static boolean isValidEmail(String email) {
        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern pattern = Pattern.compile(emailRegex);
        if (email == null) return false;
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
