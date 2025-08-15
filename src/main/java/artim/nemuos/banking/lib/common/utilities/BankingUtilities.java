package artim.nemuos.banking.lib.common.utilities;

public class BankingUtilities {
    public static boolean validateWebAddress(String webAddress)
    {
        return webAddress.matches("^(https?://)?(www.)?[-a-zA-Z0-9@:%._+~#=]{1,256}.[a-zA-Z0-9()]{1,6}\\b([-a-zA-Z0-9()@:%_+.~#?&/=]*)$");
    }
}
