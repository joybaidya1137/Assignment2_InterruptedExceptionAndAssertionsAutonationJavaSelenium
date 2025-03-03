package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Interaction_in_Selenium {

    static WebDriver driver;


    static void interactWithTextBox() throws InterruptedException {
        System.out.println("1.Welcome to the interactWithTextBox.");
        driver.get("https://the-internet.herokuapp.com/login");
        WebElement Username = driver.findElement(By.cssSelector("input#username"));
        Username.sendKeys("JoyBaidya");
        System.out.println("Entered the text value is : " + Username.getAttribute("value"));
        Thread.sleep(1000);
        System.out.println("the Username Taxt is cleared");
        Username.clear();
        System.out.println("the text is Empty : " + Username.getAttribute("value"));
        Thread.sleep(1000);
        }



    static void interactWithButton() throws InterruptedException {
        System.out.println("2.Welcome to the interactWithTextBox.");
        driver.get("https://www.google.com/");
        try {
            WebElement Button = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
            Thread.sleep(2000);
            Button.click();
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println("BUTTON TYPE ERROR: "+e.getMessage());
        }

    }

    static void interactWithRadioButtons() throws InterruptedException {
    System.out.println("Welcome to the interactWithRadioButtons.");
     driver.get("https://demo.guru99.com/telecom/addcustomer.php");
        try {
            WebElement RadioButtons = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label"));
            Thread.sleep(1000);
            RadioButtons.click();
           // System.out.println("RadioButtons selected: " + RadioButtons.isSelected());
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("RadioButtons error is:"+e.getMessage());
        }
    }


    static void interactWithCheckBox() throws InterruptedException {
    System.out.println("Welcome to the interactWithCheckBox.");
    driver.get("https://the-internet.herokuapp.com/checkboxes");

        //WebElement CheckBox = driver.findElement(By.xpath("//input[1]"));
         WebElement CheckBox = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[1]"));
        Thread.sleep(2000);
        CheckBox.click();
        System.out.println("Checkbox selected: " + CheckBox.isSelected());

        Thread.sleep(2000);

    }


    static void interactWithDropDown() throws InterruptedException {
    System.out.println("Welcome to the interactWithDropDown.");
    driver.get("https://the-internet.herokuapp.com/dropdown");
        Select DropDown = new Select(driver.findElement(By.id("dropdown")));
        Thread.sleep(2000);
        DropDown.selectByVisibleText("Option 1");
        Thread.sleep(2000);
        DropDown.selectByValue("2");
        Thread.sleep(2000);
        DropDown.selectByIndex(1);
        Thread.sleep(2000);
        DropDown.selectByIndex(2);
        Thread.sleep(2000);
    }

    static void interactWithLinks(){
    System.out.println("Welcome to the interactWithLinks.");
    driver.get("https://the-internet.herokuapp.com/");

    }
    static void interactWithImage(){
    System.out.println("Welcome to the interactWithImage.");


    }

    static void interactWithTables(){
    System.out.println("Welcome to the interactWithTables.");


    }

    static void interactWithFrames(){
    System.out.println("Welcome to the interactWithFrames.");


    }

    static void interactWithAlerts(){
    System.out.println("Welcome to the interactWithAlerts.");


    }



    static void interactWithWindowsAndTabs(){
    System.out.println("Welcome to the interactWithWindowsAndTabs.");


    }

    static void interactWithHiddenElements(){
    System.out.println("Welcome to the interactWithHiddenElements.");


    }

    static void hoverOverElement(){
    System.out.println("Welcome to the hoverOverElement.");


    }

    static void dragAndDrop(){
    System.out.println("Welcome to the dragAndDrop.");


    }
    static void scrollPage(){
    System.out.println("Welcome to the scrollPage.");


    }

    static void JavaScriptClick(){
    System.out.println("Welcome to the JavaScriptClick.");


    }


    static void doubleClick(){
    System.out.println("Welcome to the doubleClick.");


    }
    static void rightClick(){
    System.out.println("Welcome to the rightClick.");


    }
    static void handleSpecialKeys(){
    System.out.println("Welcome to the handleSpecialKeys.");


    }

    static void uploadFile(){
    System.out.println("Welcome to the uploadFile.");


    }

    static void fatchingCssProperties(){
    System.out.println("Welcome to the fatchingCssProperties.");


    }
    static void gettingSizeAndPosition(){
    System.out.println("Welcome to the gettingSizeAndPosition.");


    }
    static void handingDynamicElements(){
    System.out.println("Welcome to the handingDynamicElements.");


    }
    static void captureScreenshot(){
    System.out.println("Welcome to the captureScreenshot.");


    }



public static void main(String[] args) throws InterruptedException {

    System.setProperty("webDriver.chrome.driver", "src/main/resources/chromedriver");
    driver = new ChromeDriver();
    driver.manage().window().maximize();

    Thread.sleep(2000);

     try{
          //interactWithTextBox();
          //interactWithButton();
          //interactWithRadioButtons();
          //interactWithCheckBox();
          //interactWithDropDown();
          interactWithLinks();
          //interactWithImage();
          //interactWithTables();
          //interactWithFrames();
          //interactWithAlerts();
          //interactWithWindowsAndTabs();
          //interactWithHiddenElements();

          //hoverOverElement();
          //dragAndDrop();
          //scrollPage();
          //JavaScriptClick();
          //doubleClick();
          //rightClick();
          //handleSpecialKeys();
          //uploadFile();
          //fatchingCssProperties();
          //gettingSizeAndPosition();
          //handingDynamicElements();
          //captureScreenshot();
         System.out.println("The Code Run completed");

     } catch (Exception e) {
         System.out.println("Error occurred during this test filed: " + e.getMessage());
     } finally {
         driver.quit();
     }

}

}