package com.kese.stepdefinitions.Sprint_1_2;

import com.kese.pages.EvDegisimiPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US071RoomExchangePage8SetpD {
    EvDegisimiPage page = new EvDegisimiPage();

    @Then("user asserts ilerle button should be clickable if required informations are filled in page eights")
    public void userAssertsIlerleButtonShouldBeClickableIfRequiredInformationsAreFilledInPageEights() {
        page.page8CocuklarinizgetirebilirsinizEVET.click();
        page.page8EvcilhayvanlarigetirebilirsinizEVET.click();
        page.page8EvdeSigaraIcmeyeIzinVerilirEVET.click();
       // page.page8BakilmasiGerekenBitkiEVET.click();

        Assert.assertTrue(page.ilerleButton.isEnabled());
    }
}
