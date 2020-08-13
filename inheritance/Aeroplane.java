package inheritance;
abstract class plane{
	abstract public void plane();
	abstract public void takeoff();
	abstract public void fly();
	abstract public void land();
}
 class cargo extends plane{
	public void plane(){
		System.out.println("cargo Plane is taking goods"); //specialized property
	}
	public void takeoff(){
		System.out.println("cargo Plane is ready to takeoff"); //overridden property because it is changed.
	}
	public void fly(){
		System.out.println("cargo Plane is in air");//overridden property because it is changed.
	}
	public void land(){
		System.out.println("cargo Plane is ready to land");//overridden property because it is changed.
	}
}
class passenger extends plane{
	public void plane(){
		System.out.println("passenger plane is taking goods"); //specialized property

		}
	public void takeoff(){
		System.out.println("passenger  plane is ready to takeoff");//overridden property because it is changed.
		}
	public void fly(){
		System.out.println("passenger Plane is in air");//overridden property because it is changed.
		}
	public void land(){
		System.out.println("passenger plane is ready to land");//overridden property because it is changed.
		}
}
class fighter extends plane{
	public void plane(){
		System.out.println("fighter plane is taking goods"); //specialized property
		}
	public void takeoff(){
		System.out.println("fighter plane is ready to takeoff");//overridden property because it is changed.
		}
	public void fly(){
		System.out.println("fighter Plane is in air");//overridden property because it is changed.
		}
	public void land() {
		System.out.println("fighter plane is ready to land");//overridden property because it is changed.		
	}
}
class access{
	public void acess(plane x) {
		x.plane();
		x.takeoff();
		x.fly();
		x.land();
		System.out.println("------------------------------------");
	}
}
public class Aeroplane {
	public static void main(String[] args) {
		access a=new access();
		a.acess(new cargo());
		a.acess(new passenger());
		a.acess(new fighter());
	}
}
