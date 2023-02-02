package org.com;

public class Desktop implements Hardware , Software{
    @Override
	public void softwareResources() {
		System.out.println("Hardware");
		
	}
    @Override
	public void hardwareResources() {
		System.out.println("Software");
		
	}
  
	
	


public static void main(String[] args) {
	
	Desktop d = new Desktop();
	d.hardwareResources();
	d.softwareResources();

	
}
}
