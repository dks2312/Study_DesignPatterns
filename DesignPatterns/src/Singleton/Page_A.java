package Singleton;

public class Page_A {
	
	Page_Settings settings = Page_Settings.getPage_Settings();

	public void setAndPrintSettings() {
		settings.setBackgroundColor("blue");
		settings.setFontSize(20);
		settings.setDarkMode(true);
		
		System.out.println(settings.getBackgroundColor() 
					+" "+ settings.getFontSize()
					+" "+ settings.isDarkMode());
	}
}