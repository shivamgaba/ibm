package model;

public class initialdata {
	private String custname;
	private String custid;
	private String phone;
	public initialdata(String custname,String custid,String phone){
		super();
		custname=this.custname;
		custid=this.custid;
		phone=this.phone;
	}
	public void Setname(String name){
		custname=name;
	}
	public String Getname(){
		return custname;
	}
	public void Setid(String id){
		custid=id;
	}
	public String Getid(){
		return custid;
	}
	public void Setphone(String phon){
		phone=phon;
	}
	public String Getphone(){return phone;}
	/*public static void main(String...args){
		initialdata ob=new initialdata();
		ob.Setid(1);
		ob.Setname("shivam");
		ob.Setphone(955725934);
	}*/
}
