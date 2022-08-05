package Singleton;

public class Page_Settings {
	static Page_Settings singletonManager = new Page_Settings();
	public static Page_Settings getPage_Settings() {
		if(singletonManager == null) {
			singletonManager = new Page_Settings();
		}
		
		return singletonManager;
	}
	
	// 페이지의 공통된 값들
	private boolean darkMode = false;
	private int fontSize = 13;
	private String backgroundColor = "red";
	
	public boolean isDarkMode() { return darkMode; }
	public int getFontSize() { return fontSize; }
	public String getBackgroundColor() { return backgroundColor; }
	
	public void setDarkMode(boolean darkMode) {
		this.darkMode = darkMode;
	}
	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
	}
	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
}
