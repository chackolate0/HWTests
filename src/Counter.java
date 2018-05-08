public class Counter{
	private int counter;
	private int limit;
	public Counter(int x,int y){
		counter = x;
		limit = y;
	}
	public void increment(){
		if (counter<limit){
			counter++;
		}
	}
	public void decrement(){
		if (counter>0){
			counter--;
		}
	}
	public int getValue(){
		return counter;
	}
}