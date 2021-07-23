package stepdefwin;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;



import io.appium.java_client.windows.WindowsDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;





public class DeskopAppln {
	

public static  WindowsDriver WDriver=null;

@Given("^Launch notepad$")
public void Launch_notepad()
{ 
	}

@When("^enter text in notepad$")
public void deskappln() throws MalformedURLException, InterruptedException
{
DesiredCapabilities Dc=new 	DesiredCapabilities();
Dc.setCapability("app", "C:\\Windows\\System32\\notepad.exe");
Dc.setCapability("platformName", "Windows");
Dc.setCapability("deviceName", "WindowsPC");
WDriver=new WindowsDriver(new URL("http://127.0.0.1:4723"),Dc);
WDriver.findElement(By.name("Help")).click();
WDriver.findElement(By.name("About Notepad")).click();
WDriver.findElement(By.name("OK")).click();
WDriver.findElement(By.name("Text Editor")).sendKeys("hello i am notepad");

WDriver.findElement(By.name("Edit")).click();
Thread.sleep(3000);
//WDriver.findElementsByAccessibilityId("26")




WDriver.findElement(By.name("Go To...")).click();

String text=WDriver.findElement(By.name("Text Editor")).getAttribute("Value.Value");
System.out.println(text);



}
//add dependency as java-client(use io.appium as source in maven rep0..this will introudce winappdriver else it will iv error) 
//winappdriver v1.2 release candidate---its a .msi file.......latest oct 2019
//now go to folder where winappdriver is installe and click on exe ,p a msg will be shown win app driver listenig request at url
//developer mode should be ON----goto settings
//FOR INSPECT ELEMENT--TYPE windows 10 sdk in google and down load the installer only
//then go to this locstion C:\Program Files (x86)\Windows Kits\10\bin\10.0.19041.0\x64 and click on inspect

}
