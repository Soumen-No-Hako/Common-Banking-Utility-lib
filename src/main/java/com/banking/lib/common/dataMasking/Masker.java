package com.banking.lib.common.dataMasking;

public class Masker {
    public static String maskEmail(String email)
    {
        if (email == null || email.indexOf('@') < 5) { // Needs at least 3 chars before @
            return "******";
        }
        int pos = email.indexOf('@');
        String prefix = email.substring(0,3);
        String suffix = email.substring(pos-1);
        return prefix+"****"+suffix;
    }
    public static String maskPhoneNumber(String phone)
    {
        return phone.substring(0,2)+"xxxxxx"+phone.substring(phone.length()-2);
    }
    public static String maskEMVchipCardNumber(String cardNumber)
    {
        return "xxxx-xxxx-xxxx-"+cardNumber.substring(cardNumber.length()-4);
    }
}
