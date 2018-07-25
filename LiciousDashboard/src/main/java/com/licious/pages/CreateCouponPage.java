package com.licious.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.licious.base.BaseTest;
import com.licious.base.DatePicker;

public class CreateCouponPage extends BaseTest
{
	@FindBy(how=How.XPATH, using="html/body/div[3]/div[2]/div/ul/li[48]/ul/li[1]/a")
	WebElement SelectCity;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"tab1\"]/div[2]/div/span/span[1]/span/ul")
	WebElement selectHub ;
	
	@FindBy(how=How.CSS, using="#errmssg")
	WebElement errorMsgOveride;
	
	@FindBy(how=How.CSS, using="#coupon_code")
	WebElement couponCode;
	
	@FindBy(how=How.CSS, using="#coupon_desc")
	WebElement couponDescription;
	
	@FindBy(how=How.CSS, using="#check_discounted")
	WebElement applicableDiscountedProduct;
	
	@FindBy(how=How.CSS, using="#check_Scheduled")
	WebElement applicableOnScheduled ;
	
	@FindBy(how=How.CSS, using="#check_firstorder")
	WebElement applicableOnlyFirstOrder;	

	@FindBy(how=How.CSS, using="#limit_use")
	WebElement limitOfUse ;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"tab1\"]/div[11]/div[1]/div/span/button/i")
	WebElement startDate ;
	
	@FindBy(how=How.CSS, using="#coupon_end_date")
	WebElement endDate;

	@FindBy(how=How.CSS, using="#discount")
	WebElement selectDiscountType ;

	@FindBy(how=How.CSS, using="#check_extra_discount")
	WebElement extraCashback;
	
	@FindBy(how=How.CSS, using="#mincart_value")
	WebElement minCartValue ;
	
	@FindBy(how=How.XPATH, using="#discount_value")
	WebElement maxDiscount ;
	
	@FindBy(how=How.CSS, using="#success_message")
	WebElement successMessage ;
	
	@FindBy(how=How.CSS, using="#errmssg_overide")
	WebElement errorMessageOveride;
	
	@FindBy(how=How.CSS, using="#checktrueplatform")
	WebElement platformLevel;
	
	@FindBy(how=How.CSS, using="#all")
	WebElement All;
	
	@FindBy(how=How.CSS, using="#plat_form_andriod")
	WebElement Andriod;
	
	@FindBy(how=How.CSS, using="#plat_form_ios")
	WebElement iOS;
	
	@FindBy(how=How.CSS, using="#plat_form_website")
	WebElement Website;
	
	@FindBy(how=How.CSS, using="#plat_form_msite")
	WebElement Msite;
	
	@FindBy(how=How.CSS, using="#plat_form_chc")
	WebElement CHC;
	
	@FindBy(how=How.CSS, using="#errplatf_message")
	WebElement erorrMessage;
	
	@FindBy(how=How.CSS, using="#checktrue_customer")
	WebElement customerLevel;
	
	@FindBy(how=How.CSS, using="#fileupload")
	WebElement chooseFile;
	
	@FindBy(how=How.CSS, using="#download_template")
	WebElement downloadTemplate;
	
	@FindBy(how=How.CSS, using="#limit_use_customer")
	WebElement limitUsageCustomer;
	
	@FindBy(how=How.CSS, using="#errmssg_customer")
	WebElement errorMessage;
	
	@FindBy(how=How.CSS, using="#checktruecategory")
	WebElement CategoryLevel;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"tab1\"]/div[30]/div[2]/div[1]/div/span/span[1]/span/ul/li/input")
	WebElement ForCategory;
	
	@FindBy(how=How.CSS, using="#add_categorys_down")
	WebElement addCategory;
	 
	@FindBy(how=How.CSS, using="#cat_2 > td:nth-child(2) > input")
	WebElement Categories;
	
	@FindBy(how=How.CSS, using="#min_cart")
	WebElement minProductsCart;
	
	@FindBy(how=How.CSS, using="#errmssg_category")
	WebElement errorMsg;
	
	@FindBy(how=How.CSS, using="#checktrueproduct")
	WebElement productLevel;
	
	@FindBy(how=How.CSS, using="//*[@id=\"tab1\"]/div[31]/div[2]/div[1]/div/span/span[1]/span/ul/li/input")
	WebElement forProducts;
	
	@FindBy(how=How.CSS, using="#add_products_down")
	WebElement addProducts;
	
	@FindBy(how=How.CSS, using="#prdn_pr_1hkj9ip97xk > td:nth-child(2) > input")
	WebElement minQtyRequired;
	
	@FindBy(how=How.CSS, using="#mincart_products")
	WebElement MinCartProducts;
	
	@FindBy(how=How.CSS, using="#errmssg_products")
	WebElement ProductErrorMessage;
	
	@FindBy(how=How.CSS, using="#status")
	WebElement Status ;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"addcoupon\"]/div/div/div[2]/div/div/a")
	WebElement Create;
	
	public CreateCouponPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createCoupon()
	{
		SelectCity.click();
		Select allCity=new Select(SelectCity);
		allCity.selectByVisibleText("All cities");
		//allCity.selectByVisibleText("Bangalore");
		//allCity.selectByVisibleText("Hyderabad");
		//allCity.selectByVisibleText("Gurugram");
		//selectHub.click();
		errorMsgOveride.sendKeys("Sorry! This coupon is not applicable in your area");
		couponCode.sendKeys("DISCOUNT50");
		couponDescription.sendKeys("Get 50%  off on order above 400");
		applicableDiscountedProduct.click();
		limitOfUse.sendKeys("10000");
		startDate.click();
		DatePicker dp=new DatePicker();
		
		dp.startDate(driver, element, sDate);
		
		
	}
}

