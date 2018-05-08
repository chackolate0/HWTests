import java.util.*;
public class Date {
int month;
int day;
int year;
	public String displayDate(){
		return(month+"/"+day+"/"+year);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Date date = new Date();
		System.out.print("Enter the month, day and year in the form XX XX XXXX and hit enter:");
		date.month = sc.nextInt();
		date.day = sc.nextInt();
		date.year = sc.nextInt();
		System.out.println("The Date object's state is: "+ date.displayDate());
		System.out.print("Enter a new year:");
		date.year = sc.nextInt();
		System.out.println("The Date object's state is: "+ date.displayDate());
		System.out.print("Enter a new day:");
		date.day = sc.nextInt();
		System.out.println("The Date object's state is: "+ date.displayDate());
		System.out.print("Enter a new month:");
		date.month = sc.nextInt();
		System.out.println("The Date object's state is: "+ date.displayDate());
	}

}
