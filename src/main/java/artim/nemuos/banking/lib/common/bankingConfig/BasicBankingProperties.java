package artim.nemuos.banking.lib.common.bankingConfig;

import artim.nemuos.banking.lib.common.bankingExceptions.propertyException.UnableToGetPropertyException;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigException;

public class BasicBankingProperties extends BankingConfigLoader{
    Config bankingConfig;
    public BasicBankingProperties(String propsFileLocation) {
        if(propsFileLocation.contains("localProps")) bankingConfig = createConfigLoader(propsFileLocation);
        else bankingConfig = createConfigLoader("dummyVault"+propsFileLocation);
    }
    private String extractProperty(String bankingPropsPath)
    {
        try{
            return bankingConfig.getString(bankingPropsPath);
        }catch (ConfigException e)
        {
             return new UnableToGetPropertyException("No such property").getMessage();
        }
    }
}
