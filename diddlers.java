package EvenOdd;

public class diddlers {
	
	public static void main(String[] args) {
		
		int a = 7;
		System.out.println("A is "+The(a));
		int b = 2;
		System.out.println("B is "+The(b));
		
		

}
	public static boolean The(int Num){
		if (Num%2==0){
			return true;
		}else{
			return false;
		}
	}
	
}