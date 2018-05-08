public class FullName{
	private String given;
	private String family;
	public FullName(String x, String y){
		given = x;
		family = y;
	}
	public String toString(){
		return (String)(family + ", " + given);
	}
}