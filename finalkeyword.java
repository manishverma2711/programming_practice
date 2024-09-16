package Cpractice;

class qa {
	
	void one()
	{
		int a=10;
		System.out.println(a);
	}		
}

class qc extends qa{
	
	void two()
	{
		int b=20;
		System.out.println(b);
		
	}	
	public static void main(String[] args) {
		qc a= new qc();
		
	}
	
}