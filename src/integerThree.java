import java.util.*;
	public class integerThree{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int num1 = sc.nextInt();
		System.out.print("Enter second integer: ");
		int num2 = sc.nextInt();
		System.out.print("Enter third integer: ");
		int num3 = sc.nextInt();
		int avg = (num1+num2+num3)/3;
		int smallest = 0;
		int biggest = 0;
		if(num1>=num2 && num1>=num3) {
			biggest = num1;
			if (num2>num3) {
				smallest = num3;
			}
			else {
				smallest = num2;
			}
		}
		else if(num2>=num1 && num2>=num3) {
			biggest = num2;
			if(num1>num3) {
				smallest = num3;
			}
		}
		else if (num3>=num1 && num3 >= num2) {
			biggest = num3;
			if(num1>num2) {
				smallest = num2;
			}
			else {
				smallest = num1;
			}
		}
		System.out.printf("%d+%d+%d=%d\nInteger Avg=(%d+%d+%d)/%d=%d\n%d*%d*%d=%d\nOf %d, %d, and %d %d is the smallest.\nOf %d, %d, and %d %d is the largest.",num1,num2,num3,num1+num2+num3,num1,num2,num3,3,avg,num1,num2,num3,num1*num2*num3,num1,num2,num3,smallest,num1,num2,num3,biggest);
		
	}
	}