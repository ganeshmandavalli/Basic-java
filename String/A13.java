package String;
class demo{
	int a=9;
	public void disp() {
		System.out.println(a);
	}
	}
class demo2 extends demo{
	int b=99;
	public void disp() {
		System.out.println(b);
		System.out.println(this.b);
	}
	}
class demo3 extends demo2{
	int i=999;
public void disp() {
	System.out.println(i);
	System.out.println(super.b);
	System.out.println(b);
	System.out.println(a);
}
}
public class A13 {
	public static void main(String[] args) {
	demo3 d3=new demo3();
	demo2 d2=new demo2();
	demo d=new demo();
	d3.disp();	
	d2.disp();
	d.disp();
	}
}
