
public class Question4 {
	public static void doSomething(int x)

	{

		if (x >= 1)

		{

			System.out.print(x + " ");
			doSomething(x - 1);

		}

	}

	public static void main(String[] args) {
		doSomething(3);
	}
}
