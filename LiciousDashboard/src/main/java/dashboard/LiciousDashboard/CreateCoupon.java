package dashboard.LiciousDashboard;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class CreateCoupon 
{
	 public static WebDriver driver;
	
	 @Test
	    public void datePickerTest() {
	        //Declare a implicit wait for synchronisation
	        
	        //Get Today's number
	        String today = getCurrentDay();
	        System.out.println("Today's number: " + today + "\n");
	 
	        //Click and open the datepickers
	        driver.findElement(By.xpath("/html/body/div[8]/div[3]")).click();
	 
	        //This is from date picker table
	        WebElement dateWidgetFrom = driver.findElement(By.xpath(".//*[@id='calendar-100000000']/div[3]/table/tbody"));
	 
	        //This are the rows of the from date picker table
	        //List<WebElement> rows = dateWidgetFrom.findElements(By.tagName("tr"));
	 
	        //This are the columns of the from date picker table
	        List<WebElement> columns = dateWidgetFrom.findElements(By.tagName("td"));
	 
	        //DatePicker is a table. Thus we can navigate to each cell
	        //and if a cell matches with the current date then we will click it.
	        for (WebElement cell: columns) {
	            /*
	            //If you want to click 18th Date
	            if (cell.getText().equals("18")) {
	            */
	            //Select Today's Date
	            if (cell.getText().equals(today)) {
	                cell.click();
	                break;
	            }
	        }
	 
	        //Wait for 4 Seconds to see Today's date selected.
	        try {
	            Thread.sleep(4000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	 
	    //Close Driver
	    @AfterClass
	    public static void quitDriver() {
	        driver.quit();
	    }
	 
	    //Get The Current Day
	    private String getCurrentDay (){
	        //Create a Calendar Object
	        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
	 
	        //Get Current Day as a number
	        int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
	        System.out.println("Today Int: " + todayInt +"\n");
	 
	        //Integer to String Conversion
	        String todayStr = Integer.toString(todayInt);
	        System.out.println("Today Str: " + todayStr + "\n");
	        return todayStr;
	    }
	     
	    
}
