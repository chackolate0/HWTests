
public class CTest {

	public int min(int x, int y, int z){
		if(x<y && x<z){
			return x;
		}
		else if (y<x && y<z){
			return y;
		}
		else{
			return z;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPremiumCustomer = false;
		int nbooksPurchased = 0;
		int freeBooks=0;
		if(isPremiumCustomer){
			if(nbooksPurchased>=8){
				freeBooks = 2;
			}
			else if(nbooksPurchased>=5 && nbooksPurchased<8){
				freeBooks = 1;
			}
		}
		else{
				if(nbooksPurchased>=12){
				freeBooks = 2;
			}
			else if(nbooksPurchased>=7 && nbooksPurchased<12){
				freeBooks = 1;
			}
		}
		System.out.print(freeBooks);
		CTest C = new CTest();
		System.out.println(C.min(1, 2, 3));
	}
	

}
