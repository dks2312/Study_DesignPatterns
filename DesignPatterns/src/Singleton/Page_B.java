package Singleton;

public class Page_B {
	
	Page_Settings settings = Page_Settings.getPage_Settings();

	public void printSettings() {
		System.out.println(settings.getBackgroundColor() 
				+" "+ settings.getFontSize()
				+" "+ settings.isDarkMode());
	}

}
