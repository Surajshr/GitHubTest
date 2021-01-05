public class First {
	public static void main(String[] args)
	{
		int input=4;
		int result = calculate(input);
		System.out.print(result);
	}
	public static int calculate(int n)
	{
		int s = n*n;
		return s;
	}
}