import java.util.*;
public class integerIO{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int num1 = sc.nextInt();
		System.out.print("Enter second integer: ");
		int num2 = sc.nextInt();
		System.out.printf("%d+%d=%d\n%d*%d=%d\n%d-%d=%d\n%d/%d=%d",num1,num2,num1+num2,num1,num2,num1*num2,num1,num2,num1-num2,num1,num2,num1/num2);
	}
}