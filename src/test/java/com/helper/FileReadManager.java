package com.helper;

public class FileReadManager {
	
	private FileReadManager() {
		// TODO Auto-generated constructor stub
	}

	public  static FileReadManager getInstanceFR() {
		FileReadManager helper = new FileReadManager();
		return helper;
	}
	
	public configurationReader getInstanceCR() throws Throwable {
		configurationReader reader = new configurationReader();
		return reader;
	}
	
}
