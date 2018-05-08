public class Telephone{
	private String number;
	private static int quantity;
	private static double total;
	public static String makeFullNumber(String x, int y){
		String strY = Integer.toString(y);
		return(strY+"-"+x);
	}
}