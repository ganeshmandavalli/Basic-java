package Constructor;
class Dog {
	private String name;
	private String colour;
	private int cost;
		Dog() {
		name="jimmy";
		colour="pink";
		cost=100; 
		}
		String getName() {
		return name;
		}
		String getColour() {
		return colour;
		}
		int getCost() {
		return cost;
		}
		Dog(String name,String colour,int cost) {
		this();
		this.name=name;
		this.colour=colour;
		this.cost=cost;
		}
	}
public class Launch {
	public static void main(String[] args)
	{
		Dog d1=new Dog();
	 	System.out.println(d1.getName());
	    System.out.println(d1.getColour());
    	System.out.println(d1.getCost());
    	Dog d2=new Dog("TOMMY","BLACK",5000);
    	System.out.println(d2.getName());
    	System.out.println(d2.getColour());
    	System.out.println(d2.getCost());
	}
}

