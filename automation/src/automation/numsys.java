package automation;
// Form a number system with only 3 and 4. 
//Find the nth number of the number system. 
//import java.io.*;
import java.util.Scanner;
public class numsys {
	public static void main(String args[]){
		int num;
		System.out.println("enter no position");
		Scanner sc=new Scanner(System.in);
			num=sc.nextInt();
			findno(num);
	}
	public static int findno(int n){
		int [] arr=new int[100];
		n=n+1;
		int i=0;
		while(n!=1){
		if(n%2==0){
			arr[i]=3;
		}
		else{
			arr[i]=4;
		}
		n/=2;
		}
		return 0;
	}
}
