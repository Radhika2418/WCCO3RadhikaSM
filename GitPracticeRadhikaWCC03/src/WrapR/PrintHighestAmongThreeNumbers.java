package WrapR;

public class PrintHighestAmongThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main begins");
		printHighest(70,80,90);
		System.out.println("main ends");
		}

	public static void printHighest(int a , int b, int c)

		{
		int res = a>b ? (a > c ? a : c)  : (b > c ? b : c);

		{
		System.out.println("The Highest number is " + res);
		}

	}

}
