package bitwise;

public class SubtractOne {

	static int subtractOne(int x)
	{
		return ((x << 1) + (~x));
	}

	/* Driver code*/
	public static void main(String[] args)
	{
		System.out.printf("%d", subtractOne(13));
	}
}

// This code has been contributed by 29AjayKumar

