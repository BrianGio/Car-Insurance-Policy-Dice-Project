public class DemoBlock
{
	public static void main(String[] args) {
		System.out.println("Demonstrating block scope: ");
		int x = 1111;
		System.out.println("In the first block x is " + x);

		// inner block 1 //
		{
			int y = 2222;
			System.out.println("In the second block x is " + x);
			System.out.println("In the second block y is " + y);


		}
		// inner block 2 //
		{
			int y = 3333;
			System.out.println("In the third block x is " + x);
			System.out.println("In the third block y is " + y);
			demoMethod();
			System.out.println("After demoMethod, x is " + x);
			System.out.println("After demoMethod, y is  " + y);


		}
		System.out.println("After ALL of that, x is " + x);

	}

	public static void demoMethod()
	{
		int x = 8888, y = 9999;
		System.out.println("In demoMethod() x is " + x);
		System.out.println("In demoMethod() y is " + y);


	}
}