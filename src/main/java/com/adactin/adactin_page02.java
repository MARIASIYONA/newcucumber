package com.adactin;


	
	
	
	
	


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class adactin_page02 {
		
		public  WebDriver driver ;

		public WebElement getLocation() {
			return location;
		}

		public  WebElement getHotelname() {
			return hotelname;
		}

		public  WebElement getRoomtype() {
			return roomtype;
		}

		public  WebElement getRoomnumbers() {
			return roomnumbers;
		}

		public WebElement getAdultroom() {
			return adultroom;
		}

		public WebElement getChildroom() {
			return childroom;
		}

		public WebElement getSubmit() {
			return submit;
		}
		

		@FindBy(xpath = "//select[@name='location']")
		private static WebElement location;

		@FindBy(xpath = "//select[@name='hotels']")
		private static WebElement hotelname;

		@FindBy(xpath = "//select[@name='room_type']")
		private static WebElement roomtype;

		@FindBy(xpath = "//select[@name='room_nos']")
		private static WebElement roomnumbers;

		@FindBy(xpath = "//select[@name='adult_room']")
		private static WebElement adultroom;

		@FindBy(xpath = "//select[@name='child_room']")
		private static WebElement childroom;

		@FindBy(id = "Submit")
		private static WebElement submit;
		
		
		public adactin_page02(WebDriver driver2) {
			
			this.driver = driver2;
			
			PageFactory.initElements(driver, this);
		}
		
		
		
		
		
		
		
		
	}



