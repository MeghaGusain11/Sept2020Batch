package Assignments;

import java.util.ArrayList;

public class Browser {
	String browserName;
	String vendorName;
	String currentVersion;
	ArrayList<String> plugins = new ArrayList<String>();
	
	public Browser() {
		System.out.println("This is default constructor of Browser.. ");
	}
	
	public Browser(String browserName, ArrayList<String> plugins) {
		this.browserName= browserName;
		this.plugins = plugins;
	}
	
	public String getBrowserName() {
		return browserName;
	}
	
	public String getvendorName()
	{
		return vendorName;
	}
	
	public ArrayList<String> getplugins(){
		return plugins;
	}

}
