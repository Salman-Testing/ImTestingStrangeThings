package org.steps;



import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass {
	
	@Before (order=100)
	public void waitTime() {
		System.out.println("Implicitly Time");

	}
	
	@Before (order=10)
	public void screenShot() {
		System.out.println("Taking ScreenShot Before");

	}
	
	@Before (value="@Smoke")
	public void browserStarting() {
		System.out.println("Browser Launching from hooks");

	}
	
	@After (order = 20)
	public void ScreenShot() {
		System.out.println("ScreenShot After");

	}
	
	@After (order = 100)
	public void clearCookies() {
		System.out.println("Clear Cookies after");

	}
	
	@After (value="@Smoke")
	public void browserClosing() {
		System.out.println("BrowserClosing from hooks");

	}

}
