package ram.ds.algo.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListOfObject {
	
	public static void main(String [] args)
	{
		List<String> str = new ArrayList<String>();
		str.add("priyanshu");
		str.add("ankur");
		str.add("astharv");
		str.add("apoorva");
		
		
		Collections.sort(str);
		//Comparator<String> com = (x,y) -> x.compareTo(y);
		
		//str.sort(com);
		str.forEach(System.out::println);
		SortListOfObject outerClass = new SortListOfObject();
		
		SortListOfObject.Student s = outerClass.new Student(1,"Atahrv");
		SortListOfObject.Student s1 = outerClass.new Student(30,"Priyanshu");
		SortListOfObject.Student s2 = outerClass.new Student(27,"Apoorva");
		SortListOfObject.Student s3 = outerClass.new Student(23,"Shivanshu");
		
		List<Student> list = new ArrayList<SortListOfObject.Student>();
		list.add(s);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		Collections.sort(list, Comparator.comparing(Student::getAge));
		
		list.forEach(System.out::println);
		
		
	}
	

public class Student{
	int age;
	String name;
	
	public Student(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public void setName(String name)
	{
		this.name= name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	@Override
	public String toString()
	{
		return "Student name "+ this.name + " age "+ this.age; 
	}
	
}


}


