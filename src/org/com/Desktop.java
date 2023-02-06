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
  
    private void desktop() {
		System.out.println("Windows");
		System.out.println("pushed by ajju");
	    System.out.println("pushed");
}	

public static void main(String[] args) {
	
	Desktop d = new Desktop();
	d.hardwareResources();
	d.softwareResources();
    
	
}
}
