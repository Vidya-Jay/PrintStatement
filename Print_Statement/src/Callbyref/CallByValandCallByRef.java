package Callbyref;

public class CallByValandCallByRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValandCallByRef obj=new CallByValandCallByRef();
		
		//System.out.println(obj.testsum(10, 20));
		int x=10;
		int y=20;
		System.out.println(obj.testsum(x, y));

	}
public int testsum(int a,int b){
	 a=30;
	 b=40;
	int c=a+b;
	return c;
}
}
