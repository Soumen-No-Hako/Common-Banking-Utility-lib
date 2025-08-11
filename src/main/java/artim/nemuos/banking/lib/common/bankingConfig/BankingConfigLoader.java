package artim.nemuos.banking.lib.common.bankingConfig;

import artim.nemuos.banking.lib.common.bankingExceptions.propertyException.UnableToGetPropertyException;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import java.io.File;

public abstract class BankingConfigLoader {
    Config createConfigLoader(String fileLocation)
    {
        try{
            File file = new File(fileLocation);
            if (file.exists()) {
                return ConfigFactory.parseFile(file).resolve();
            } else {
                // Try to load from resources (classpath)
                return ConfigFactory.load(fileLocation);
            }
        }catch (Exception e)
        {
            System.out.println(new UnableToGetPropertyException("File path may not be correct").getMessage());
        }
        return null;
    }
}
