import java.lang.*;
import java.util.*;


class Reverse
{    

	public void Table(int No)
	{   
	   int iResult=0;
	   int icnt=1;
	   
	   for(int i=No;i>=1;i--)
	   {
		   icnt=i*icnt;
		
	   }
		
	    	  System.out.print(+icnt);

		
	}
}

class Demo
{
	public static void main(String args[])
	
	{
		Scanner sobj =new Scanner (System.in);
		
		System.out.println("Enter Your Number\n");
		
		int value =sobj.nextInt();
		
		Reverse robj=new Reverse();
		
		robj.Table(value);
		
		
	}
}