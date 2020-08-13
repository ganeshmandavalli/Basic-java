package collection;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
class Student{
	private String name,course;
	private int marks;
	public Student(String name, String course, int marks) 
	{
		this.name = name;
		this.course = course;
		this.marks = marks;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getCourse() 
	{
		return course;
	}
	public void setCourse(String course) 
	{
		this.course = course;
	}
	public int getMarks() 
	{
		return marks;
	}
	public void setMarks(int marks) 
	{
		this.marks = marks;
	}
	public String toString() {
		return name +" "+course+" "+marks;
		
	}
}
class Sort implements Comparator <Student> 
{

	@Override
	public int compare(Student s1, Student s2) {
		int m1=s1.getMarks();
		int m2=s2.getMarks();
		if(m1<m2)
			return +1;
		else if(m1>m2)
			return -1;
		else
			return 0;
			
	}
}
class Sort1 implements Comparator <Student> 
{
	@Override
	public int compare(Student s1, Student s2) {
		int x =s2.getName().compareTo(s1.getName());
		return x;
	}	
}
public class Tsobjhetr 
{
	public static void main(String[] args) 
	{
		TreeSet <Student> ts =new TreeSet<Student>(new Sort());
		ts.add(new Student("gani","cse",56));
		ts.add(new Student("ananad","mech",67));
		ts.add(new Student("zakir","eee",53));
		ts.add(new Student("tom","civil",12));
		ts.add(new Student("enaam","aeronautical",88));
		ts.add(new Student("hyder","petroleum science",99));
		System.out.println(ts.toString());
		ArrayList <Student> al = new ArrayList <Student>();
		al.add(new Student("arnab","cse",65));
		al.add(new Student("yogi","mech",45));
		al.add(new Student("modi","eee",32));
		al.add(new Student("osman","civil",22));
		al.add(new Student("bhagwan","aeronautical",12));
		al.add(new Student("zaman","petroleum science",44));
		System.out.println(al.toString());
		Collections.sort(al,new Sort1());
		System.out.println(al);
	}
}
