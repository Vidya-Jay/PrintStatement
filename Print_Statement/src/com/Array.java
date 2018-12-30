package com;

public class Array {

	public static void main(String[] args) {
		int num[]=new int[4];
		num[0]=100;
		num[1]=200;
		num[2]=330;
		num[3]=400;
		
		System.out.println("the length of the array is::"+num.length);
		System.out.println(num[2]);
		
		for(int each:num)
		{
			System.out.println(each);
	}
Object [][] login=new Object[3][2];
login[0][0]="user1";
login[0][1]=1234;
login[1][0]="user2";
login[1][1]=1235;
login[2][0]="user3";
login[2][1]=3645;		
		
System.out.println("length of the row::"+login.length);
System.out.println("length of the column::"+login[0].length);

for (int i=0;i<login.length;i++)
{
	for(int j=0;j<login[0].length;j++)
	{
		//System.out.println(login[i][j]);
		//System.out.print("\n"+login[i][j]);
		System.out.print("\t"+login[i][j]);
				
	}
	System.out.println();
}


		
		
		
		
}

}