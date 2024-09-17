package Constructortypes;

public class parametrizedconstr {

	int a;
	String ok;
	
	public parametrizedconstr(int a,String ok) {
		this.a =a;
		this.ok = ok;
		System.out.println(a);
		System.out.println(ok);
	}
	
	public static void main(String[] args) {
		
		parametrizedconstr ik = new parametrizedconstr(5, "manish");
		
	}

}
