
public class Amstrongnumber {

	public static void main(String[] args) {
		Amstrongnumber.findamstrong(158);
	
	}

public static void findamstrong(int n) 
{
	
    int r1=n%10; //Remainder 3 
    
    int a=n/10;
    
    int r2= a%10;
    
    int c=a/10;

  int sum= ((r1*r1*r1)+(r2*r2*r2)+(c*c*c));
	//System.out.println(sum);
	
	if(sum==n)
		System.out.println("given number is armstrong number");
	else
		System.out.println("given number is not armstrong number");
}

}