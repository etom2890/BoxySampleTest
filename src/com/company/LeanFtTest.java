package com.company;

import com.hp.lft.sdk.java.Window;
import com.hp.lft.sdk.java.WindowDescription;
import com.hp.lft.sdk.mobile.Device;
import com.hp.lft.sdk.mobile.DeviceDescription;
import com.hp.lft.sdk.powerbuilder.ListView;
import com.hp.lft.sdk.powerbuilder.ListViewDescription;
import com.hp.lft.sdk.web.*;
import org.testng.annotations.*;
import com.hp.lft.sdk.*;


import unittesting.*;

public class LeanFtTest extends UnitTestClassBase {
    public static Browser browser;

    @BeforeClass
    public void beforeClass() throws Exception {
    }

    @AfterClass
    public void afterClass() throws Exception {
    }

    @BeforeMethod
    public void beforeMethod() throws Exception {
    }

    @AfterMethod
    public void afterMethod() throws Exception {
    }

    @AfterTest
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    private static void globalTearDown() throws GeneralLeanFtException {
        SrfLab.releaseEnvironment(browser);
    }
 /*   @Test
    public void test() throws GeneralLeanFtException {


        com.hp.lft.sdk.mobile.Application homeApplication = device.describe(com.hp.lft.sdk.mobile.Application.class, new com.hp.lft.sdk.mobile.ApplicationDescription.Builder()
                .identifier("MC.Home")
                .packaged(false).build());
        com.hp.lft.sdk.mobile.UiObject mobileObjectUiObject = homeApplication.describe(com.hp.lft.sdk.mobile.UiObject.class, new com.hp.lft.sdk.mobile.UiObjectDescription.Builder()
                .className("View")
                .mobileCenterIndex(60)
                .nativeClass("XCUIElementTypeOther").build());
        mobileObjectUiObject.tap();
        Browser browser = BrowserFactory.launch(BrowserType.SAFARI, device);
        browser.navigate("boxycharm.com");



        Link sUBSCRIBELink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("SUBSCRIBE")
                .role("")
                .tagName("A").build());
        sUBSCRIBELink.click();



    }*/

    @Test
    public void test1() throws GeneralLeanFtException{


        DeviceDescription dd = new DeviceDescription();
        dd.setOsType("Android"); //or: dd.set("osType", "Android")
        dd.setOsVersion("9"); //or: dd.set("osVersion", "5.02")
        dd.set("Test_Name", "LeanFT iOs mobile test");
        Device device = SrfLab.lockDevice(dd);

        //Device device = SrfLab.lockDevice(new DeviceDescription.Builder().osType("Android").osVersion("4").set("testName"," My LeanFT mobile test").build());

         browser = BrowserFactory.launch(BrowserType.FIREFOX, device);


        //Browser browser = BrowserFactory.launch(BrowserType.FIREFOX);

        browser.navigate("boxycharm.com");

        Link sUBSCRIBELink = browser.describe(Link.class, new LinkDescription.Builder()
                .accessibilityName("")
                .innerText("SUBSCRIBE")
                .role("")
                .tagName("A")
                .index(1).build());
        sUBSCRIBELink.click();

        browser.close();
       /* Button subscribeButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("button")
                .className("action tocart primary")
                .cssSelector("div#subscribe > div > div:nth-child(2) > div > div:nth-child(1) > section > div > div > button")
                .id("")
                .name("        Subscribe    ")
                .tagName("BUTTON")
                .xpath("//DIV[1]/SECTION[1]/DIV[1]/DIV[1]/BUTTON[1]").build());
        subscribeButton.click();

        subscribeButton.click(); */


    }

}










