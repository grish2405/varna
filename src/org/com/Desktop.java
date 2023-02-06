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
	
<<<<<<< HEAD
      private void desktop() {
		
    	  System.out.println("pushed by grish");
	}

=======
}	
>>>>>>> 5e11703fc8e6c3841173857dacb518d40fa5667f

public static void main(String[] args) {
	
	Desktop d = new Desktop();
	d.hardwareResources();
	d.softwareResources();
    
	
}
}
