package com.banking.lib.common.dataValidation;

import java.util.regex.Pattern;

public class ProfileValidatorUtilities {
    private static final Pattern PAN_CARD_PATTERN = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}");
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
    private static final Pattern INDIAN_PHONE_PATTERN = Pattern.compile("^[6-9]\\d{9}$");
    private static final Pattern NON_DIGIT_PATTERN = Pattern.compile("\\D");

    public static boolean isValidEmail(String email)
    {
        if (email == null || email.trim().isEmpty()) {
            return false;
        }
        return EMAIL_PATTERN.matcher(email.trim()).matches();
    }
    public static boolean isValidPAN(String pan)
    {
        if (pan == null || pan.trim().isEmpty()) {
            return false;
        }
        return PAN_CARD_PATTERN.matcher(pan.trim()).matches();
    }
    public static boolean isValidPhoneNumber(String number)
    {
        if (number == null || number.trim().isEmpty()) {
            return false;
        }
        return INDIAN_PHONE_PATTERN.matcher(number.trim()).matches();
    }
    public static boolean isValidNonDigit(String inp)
    {
        if (inp == null || inp.trim().isEmpty()) {
            return false;
        }
        return NON_DIGIT_PATTERN.matcher(inp.trim()).matches();
    }
}