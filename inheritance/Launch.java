package inheritance;
class Demo1{}
class Demo2{}
class Demo3{}
class Demo4{}
class Demo5{}
class Demo6{}
class Demo7{}
class Demo8{}
class Demo9{}
class Demo10{
	public void disp(Object x) {
		System.out.println(x);
	}
}
public class Launch {
	public static void main(String[] args) {
		Demo10 d10 =new Demo10();
		Demo2 d2=new Demo2();
		Demo1 d1=new Demo1();
		System.out.println(d2);
		d10.disp(d2);
		System.out.println(d1);
		d10.disp(d1);
		System.out.println(new Demo1());
		d10.disp(new Demo1());
	}
}
