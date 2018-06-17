package automation;

public class fibonaaci {
	static int f1=0,f2=1,f3=0;
	public static void main(String args[]){
		int count=15;
		series(count);
	}
	static void series(int c){
		System.out.print(f1+" "+f2);
		while(c>2){
			f3=f1+f2;
			System.out.print(f3+" ");
			f1=f2;
			f2=f3;
			c--;
		}
		
	}
}
