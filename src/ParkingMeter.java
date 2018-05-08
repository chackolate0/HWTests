public class ParkingMeter{
	private int timeLeft = 0;
	private int maxTime;
	public ParkingMeter(int x){
		maxTime = x;
	}
	public boolean add(int x){
		if(x==25){
			if(timeLeft+30<=maxTime){
				timeLeft+=30;
				return true;
			}
			else {
				return false;
			}
		
		}
		return false;
	}
	public void tick(){
		if(timeLeft>0){
			timeLeft--;
		}
	}
	public boolean isExpired(){
		if(timeLeft==0){
			return true;
		}
		else{
			return false;
		}
	}
}