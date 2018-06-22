package automation;
import java.io.*;
import java.util.*;
public class destroy {
	int a;
	String b;
	destroy(int a,String b){
		this.a=a;
		this.b=b;
	}
	public static void main(String...args){
		destroy ob=new destroy(1,"shivam");
		System.out.println(ob);
		ArrayList list=new ArrayList();
		list.add(ob.a);
		list.add( ob.b);
		ob=null;
		System.out.println(list);
		ob=null;
		System.out.println(list);
	}
}
