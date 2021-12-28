package workFlows;

import Utillties.CommonOps;
import Utillties.Verification;
import extensions.MobileUIActions;
import io.qameta.allure.Step;
import org.testng.Assert;

public class MobileFlows extends CommonOps {
    @Step("check weight")
    public static void basicWeightSection(){
        MobileUIActions.click(basicWeightSection.txt_weight);
        MobileUIActions.click(basicWeightSection.weight_input);
        MobileUIActions.click(basicWeightSection.weight_number1);
        MobileUIActions.click(basicWeightSection.weight_number2);
        MobileUIActions.click(basicWeightSection.weight_selector);
        MobileUIActions.click(basicWeightSection.weight_lb);
    }
    @Step ("check temperature")
    public static void livingTempSection(){
        MobileUIActions.click(livingTempSection.living_section);
        MobileUIActions.click(livingTempSection.living_tempTab);
    }
    @Step ("check currency")
    public static void LivingCurrencySection(){
        MobileUIActions.click(livingCurrencySection.getLivingC_currency());
        MobileUIActions.click(livingCurrencySection.btn_mainMenu);
        MobileUIActions.click(livingCurrencySection.btn_settings);
        MobileUIActions.click(livingCurrencySection.btn_currencyChange);
        MobileUIActions.click(livingCurrencySection.getBtn_ruppeChoose());
        AndroidDriver.navigate().back();
    }


}
