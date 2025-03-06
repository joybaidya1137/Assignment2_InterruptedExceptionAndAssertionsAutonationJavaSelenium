package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Text;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;



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

    static void interactWithLinks() throws InterruptedException {
    System.out.println("Welcome to the interactWithLinks.");
    driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(2000);
    WebElement  Links = driver.findElement(By.linkText("Redirect Link"));
                Links.click();
        Thread.sleep(2000);
    }


    static void interactWithImage() throws InterruptedException {
    System.out.println("Welcome to the interactWithImage.");
    driver.get("https://demo.guru99.com/");

        // WebElement Image = driver.findElement(By.xpath("//img[@alt='Guru99 Demo Sites']"));
        // WebElement Image = driver.findElement(By.xpath("//img[@src='/logo.png']"));
        try {
            WebElement Image = driver.findElement(By.xpath("//img[@role='presentation']"));
            Thread.sleep(2000);
            String imageUrl = Image.getAttribute("src");
            System.out.println("Image source: " + imageUrl);

            // Click the image (if clickable)
            Image.click();
            // Pause for demonstration
            Thread.sleep(2000);
        } catch (Exception e) {
            throw new RuntimeException(e);

        }


    }

    static void interactWithTables(){
    System.out.println("Welcome to the interactWithTables.");
        driver.get("https://the-internet.herokuapp.com/tables");
        WebElement Tables = driver.findElement(By.id("table1"));
        List<WebElement> rows = Tables.findElements(By.tagName("tr"));
        for (WebElement Row : rows) {
            List<WebElement> cols = Row.findElements(By.tagName("td"));
            for (WebElement col : cols) {
                System.out.print(col.getText() + "\t");
            }
            System.out.println();
        }

    }


   //don't clear Understands
    static void interactWithFrames() throws InterruptedException {
    System.out.println("Welcome to the interactWithFrames.");
        driver.get("https://the-internet.herokuapp.com/iframe");
        Thread.sleep(2000);
        driver.switchTo().frame("mce_0_ifr");
        Thread.sleep(2000);
        WebElement editor = driver.findElement(By.id("tinymce"));
        editor.clear();
        Thread.sleep(2000);
        editor.sendKeys("Hello, Frame!");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        WebElement title = driver.findElement(By.xpath("//h3"));
        Thread.sleep(2000);
        System.out.println(title.getText());
    }

    static void interactWithAlerts() throws InterruptedException {
    System.out.println("Welcome to the interactWithAlerts.");
    driver.get("https://the-internet.herokuapp.com/javascript_alerts");


      //fast Alerts
       /* WebElement alertButton = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        alertButton.click();

        Alert alert = driver.switchTo().alert();
        Thread.sleep(200);
        System.out.println(alert.getText());
        Thread.sleep(200);
        alert.accept();
        //alert.dismiss();
        Thread.sleep(200);

        / Verify the result text
        WebElement result = driver.findElement(By.id("result"));
        System.out.println("Result message: " + result.getText());
        //alert.accept();
        //alert.dismiss();
      */



        //2nd Alerts
      /* WebElement confirm = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
         confirm.click();

        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(alert.getText());
        Thread.sleep(2000);
        alert.accept();
        //alert.dismiss();
        Thread.sleep(2000);

        // Verify the result text
        WebElement result = driver.findElement(By.id("result"));
        System.out.println("Result message: " + result.getText());
        //alert.accept();
        //alert.dismiss();
    */



        //3rd Alerts test send need
        WebElement prompt = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
         prompt.click();

        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(alert.getText());
        Thread.sleep(2000);
        alert.sendKeys("my name is joy");

        alert.accept();
        //alert.dismiss();
        Thread.sleep(2000);

        // Verify the result text
        WebElement result = driver.findElement(By.id("result"));
        System.out.println("Result message: " + result.getText());

        //alert.accept();
        //alert.dismiss();

    }



/*
1️⃣ মূল পৃষ্ঠায় যাবে।
2️⃣ প্রথম "Click Here" ক্লিক করলে প্রথম নতুন উইন্ডো খুলবে।
3️⃣ প্রথম নতুন উইন্ডোতে সুইচ করবে।
4️⃣ ওই নতুন উইন্ডো থেকে আবার "Click Here" ক্লিক করলে দ্বিতীয় নতুন উইন্ডো খুলবে।
*/
   static void interactWithWindowsAndTabs() throws InterruptedException {
    System.out.println("Welcome to the interactWithWindowsAndTabs.");

        driver.get("https://the-internet.herokuapp.com/windows");

       /* String parentWindow = driver.getWindowHandle(); // মূল উইন্ডোর হ্যান্ডল সংগ্রহ
        driver.findElement(By.linkText("Click Here")).click();

            Thread.sleep(2000);

        Set<String> handles = driver.getWindowHandles();
        for (String window : handles) {
            driver.switchTo().window(window);
            break;
        }

        driver.findElement(By.linkText("Click Here")).click();

            Thread.sleep(2000);
*/


       String parentWindow = driver.getWindowHandle(); // Store main window handle
       driver.findElement(By.linkText("Click Here")).click(); // Open new tab

       Thread.sleep(2000);

       // Get all window handles
       Set<String> handles = driver.getWindowHandles();
       for (String window : handles) {
           if (!window.equals(parentWindow)) {
               driver.switchTo().window(window);
               System.out.println("Switched to new window: " + driver.getTitle());
               driver.findElement(By.tagName("body")).getText(); // Example interaction
               Thread.sleep(2000);
               driver.close(); // Close the new window
           }
       }
       // Switch back to parent window
       Thread.sleep(2000);
       driver.switchTo().window(parentWindow);
       System.out.println("Back to parent window: " + driver.getTitle());

    }




    static void interactWithHiddenElements(){
    System.out.println("Welcome to the interactWithHiddenElements.");



    }

    static void hoverOverElement() throws InterruptedException {
    System.out.println("Welcome to the hoverOverElement.");
    driver.get("https://the-internet.herokuapp.com/hovers");

        Actions actions = new Actions(driver);

        Thread.sleep(2000);
        WebElement avatar1 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
        actions.moveToElement(avatar1).perform();
        Thread.sleep(2000);

        Thread.sleep(2000);
        WebElement avatar2 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));
        actions.moveToElement(avatar2).perform();

        Thread.sleep(2000);
        WebElement avatar3 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[3]"));
        actions.moveToElement(avatar3).perform();
        Thread.sleep(2000);


        Thread.sleep(2000);
        WebElement avatar = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
        actions.moveToElement(avatar).perform();
        Thread.sleep(2000);

        WebElement viewProfile = driver.findElement(By.linkText("View profile"));
        viewProfile.click();
        Thread.sleep(2000);
        WebElement TextPrint = driver.findElement(By.xpath("/html/body/h1"));
        TextPrint.click();
        Thread.sleep(2000);

    }

    static void dragAndDrop() throws InterruptedException {
    System.out.println("Welcome to the dragAndDrop.");
    driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        WebElement source = driver.findElement(By.id("column-a"));
        WebElement target = driver.findElement(By.id("column-b"));
            Thread.sleep(2000);

            new Actions(driver).dragAndDrop(source, target).perform();
            Thread.sleep(2000);

            new Actions(driver).dragAndDrop(source, target).perform();
            Thread.sleep(2000);



    }
    static void scrollPage() throws InterruptedException {
    System.out.println("Welcome to the scrollPage.");

        // Open a sample website
        driver.get("https://www.selenium.dev/documentation/en/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
            Thread.sleep(2000);

        // Scroll down by 500 pixels
        js.executeScript("window.scrollBy(0,500);");
            Thread.sleep(2000);

        // Scroll up by 500 pixels
        js.executeScript("window.scrollBy(0,-500);");
            Thread.sleep(2000);


        // Scroll to bottom of the page
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
            Thread.sleep(2000);


        // Scroll back to top
        js.executeScript("window.scrollTo(0, 0);");
            Thread.sleep(2000);


        // Find the element to scroll to
        WebElement element = driver.findElement(By.linkText("Selenium Overview"));


        // Scroll to the element
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(3000);
        // Highlight the element (for visibility)
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", element);
            Thread.sleep(5000);


        // Find the element to scroll to
        WebElement element1 = driver.findElement(By.xpath("//a[text()='About this documentation']"));
        Thread.sleep(3000);
        // Scroll to the element
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
        Thread.sleep(3000);
        // Highlight the element (for visibility)
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='2px solid red'", element1);
        Thread.sleep(5000);


    }

    static void JavaScriptClick(){
    System.out.println("Welcome to the JavaScriptClick.");


    }


    static void doubleClick() throws InterruptedException {
    System.out.println("Welcome to the doubleClick.");

        driver.get("https://www.selenium.dev/documentation/en/");
/*
        // Use WebDriverWait to wait until the input field is enabled
        // Use WebDriverWait to wait until the input field is enabled
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='The Selenium Browser Automation Project']")));
*/
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//h1[text()='The Selenium Browser Automation Project']"));
        actions.doubleClick(element).perform();

        System.out.println("doubleClicked at :" + element.getText());

            Thread.sleep(5000);



    }
    static void rightClick() throws InterruptedException {
    System.out.println("Welcome to the rightClick.");

        driver.get("https://www.selenium.dev/documentation/en/");

        // Use WebDriverWait to wait until the input field is enabled
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        // WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='The Selenium Browser Automation Project']")));

       /* Actions actions = new Actions(driver);
        //WebElement element = driver.findElement(By.xpath("//h1[text()='The Selenium Browser Automation Project']"));
        actions.contextClick(element).perform();
         System.out.println("rightClicked at :" + element.getText());
         Thread.sleep(5000);
        */


        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.className("td-sidebar-nav-active-item"));
        actions.contextClick(element).perform();
        System.out.println("rightClicked at :" + element.getText());
        Thread.sleep(5000);

    }


    static void handleSpecialKeys() throws InterruptedException {
    System.out.println("Welcome to the handleSpecialKeys.");
        driver.get("https://the-internet.herokuapp.com/key_presses");
        WebElement inputField = driver.findElement(By.id("target"));
        inputField.sendKeys("I am joy baidya");
        inputField.sendKeys(Keys.CONTROL + "a");
        Thread.sleep(2000);
        inputField.sendKeys(Keys.CONTROL + "x");
        Thread.sleep(3000);
        inputField.sendKeys(Keys.CONTROL + "v");
        Thread.sleep(2000);
        inputField.sendKeys(Keys.CONTROL + "z");

            Thread.sleep(2000);
        inputField.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

    }

    static void uploadFile() throws InterruptedException {
    System.out.println("Welcome to the uploadFile.");
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement ChooseFile = driver.findElement(By.id("file-upload"));
            Thread.sleep(1000);
        ChooseFile.sendKeys("C:\\Users\\User\\Downloads\\Joy Baidya(CV).pdf");
            Thread.sleep(5000);
            WebElement Upload = driver.findElement(By.id("file-submit"));Upload.click();
            Thread.sleep(5000);

        WebElement uploadedFile = driver.findElement(By.id("uploaded-files"));
        System.out.println("Uploaded File Name: " + uploadedFile.getText());
    }




    static void fatchingCssProperties(){
    System.out.println("Welcome to the fatchingCssProperties.");
        driver.get("https://www.selenium.dev/documentation/en/");

        // Locate the element
        WebElement element = driver.findElement(By.xpath("//h1[text()='The Selenium Browser Automation Project']"));

        // Fetch and print CSS properties
        String color = element.getCssValue("color");
        String fontSize = element.getCssValue("font-size");

        System.out.println("Color: " + color);
        System.out.println("Font Size: " + fontSize);

    }

    static void gettingSizeAndPosition(){
    System.out.println("Welcome to the gettingSizeAndPosition.");


        // 1.Locate the element Text
            //driver.get("https://www.selenium.dev/documentation/en/");
            // WebElement element = driver.findElement(By.xpath("//h1[text()='The Selenium Browser Automation Project']"));

        // 2.Locate the element image
             driver.get("https://www.selenium.dev/documentation/");
              WebElement element = driver.findElement(By.xpath("//img[@alt='BrowserStack']"));




        // Fetch and print size
        Dimension size = element.getSize();
        System.out.println("Width: " + size.getWidth() + ", Height: " + size.getHeight());

        // Fetch and print position
        Point position = element.getLocation();
        System.out.println("X Position: " + position.getX() + ", Y Position: " + position.getY());

    }


    static void handingDynamicElements() throws InterruptedException {
    System.out.println("Welcome to the handingDynamicElements.");
        driver.get("https://www.google.com/");

        // Using explicit wait to handle dynamic elements
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement dynamicElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div[1]/div[2]/textarea")));

        dynamicElement.sendKeys("bangladesh");
        Thread.sleep(2000);
        dynamicElement.click();
        System.out.println("Dynamic element clicked successfully.");

    }




    // Not clear this Screenshort process
    static void captureScreenshot(){
    System.out.println("Welcome to the captureScreenshot.");

        System.out.println("captureScreenshot");
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // Define destination file path
        File destination = new File("T1071.png");

        // Save the screenshot
        try {
            FileUtils.copyFile(screenshot, destination);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Screenshot captured at: " + screenshot.getAbsolutePath());
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
          //interactWithLinks();
          // interactWithImage();
          // interactWithTables();
          // interactWithFrames();
          // interactWithAlerts();
          //interactWithWindowsAndTabs();
          //interactWithHiddenElements();

          // hoverOverElement();
          // dragAndDrop();
          // scrollPage();
          //JavaScriptClick();
          //doubleClick();
          //rightClick();
          //handleSpecialKeys();
          uploadFile();
          //fatchingCssProperties();
         // gettingSizeAndPosition();
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