import java.util.Scanner;
public class xyz
{  
	public static void main(String[] args) {  
	Scanner input = new Scanner(System.in);
	System.out.print("enter the number : ");

	int number = input.nextInt();
	switch(number){  
    case 10: System.out.println("10");
	   break;  
    case 20: System.out.println("20");
	   break;  
    case 30: System.out.println("30");
	   break;  
    default:System.out.println("Not in 10, 20 or 30");  
    }
    System.out.println("i also made changes");  
}  
}  

