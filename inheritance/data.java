package inheritance;
class charger {
	private String brand ;
	private float voltage;
	float getvoltage(){
		return voltage;
	}
	String getbrand() {
		return brand;
	}
	charger(String n,float d){
		brand=n;
		voltage=d;
	}
}
class mobile{
	os os=new os("iphone",128);
	public void hasA(charger ref) {
		System.out.println(ref.getbrand());
	    System.out.println(ref.getvoltage());
	}
}
class os{
	private int size;
	private String name;
	int getsize(){
		return size;
	}
	String getname() {
		return name;
	}
	os(String name,int size){
		this.size=size;
		this.name=name;
	}	
}
public class data {
	public static void main(String[] args) {
		mobile m= new mobile();
		charger c=new charger("oppo",2.5f);
		m.hasA(c); //--->aggregate access
	    System.out.println(m.os.getname());//--->composite access
	    System.out.println(m.os.getsize());// --->composite access
	    // System.out.println(os.getname());//---> Direct Access not possible for composite access
	    // System.out.println(os.getsize());// --->Direct Access not possible for composite access
	    m=null;
	    System.out.println(c.getbrand()); // ---> Direct Access possible for Aggregate access
	    System.out.println(c.getvoltage()); // ---> Direct Access possible for Aggregate access
	    System.out.println(m.os.getname()); // ---> composite Access not possible for if and only mobile reference object is a null. 
	    System.out.println(m.os.getsize()); // --->  composite Access not possible for if and only mobile reference object is a null. 
	}
}
