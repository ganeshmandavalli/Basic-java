package inheritance;
 class Acess{
	private int d=40;  // private = restricted access
	  public int get() { // Getter
	  return d;               //The get method returns the value of the variable name.
	  }                                   // setter
	  public void set(int d) {  // The set method takes a parameter (newName) and assigns it to the name variable.
	  this.d = d;                   // The this keyword is used to refer to the current object.
	  }
	  class demo1 extends Acess{
		  
	  }
	  class demo2{
		  
	  }
	public static void main(String[] args) {
		Acess a = new Acess();
	    a.set(1);                     // Set the value of the name variable to 1.
	    System.out.println(a.get());
	}
}