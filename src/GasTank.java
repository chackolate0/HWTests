public class GasTank{
	private double amount = 0;
	public void addGas(double x){
		amount += x;
	}
	public void useGas(double x){
		if(amount-x < 0){
			amount = 0;
		}
		else{
			amount -= x;
		}
	}
	public boolean isEmpty(){
		if(amount<0.1){
			return true;
		}
		else{
			return false;
		}
	}
	public double getGasLevel(){
		return amount;
	}
}
