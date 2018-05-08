
public class test {

	public static boolean what(){
		int a = 20;

		return (a>20) ? true : false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(what());
		int a = 0;
		int b = 1;
		System.out.println(b++);
		b = 1;
		System.out.println(++b);
		
		int x = 1;
		int y = 2;

		if ((x == 1) || (++y < 2)) {
		System.out.println(y);}
		
		int c = 1;
		int d = 2;

		if ((c == 1) && (++d < 2)) {

		System.out.println(d);
		}
		
		a=5;
		switch(a) {
		case 3:
		case 4:
		case 5:
			a++;
		case 6:
			a++;
		case 7:
			a++;
			break;
		}
		System.out.println("a is equal to: " + a);


	}

}
