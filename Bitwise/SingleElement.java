package bitwise;

// Find the array element that occur only once.
class SingleElement {
	// Driver method.
	public static void main(String args[]) {
		int array[] = { 0, 3, 1, 3, 0, 5, 1, 3, 1, 0 };
		System.out.println("The single element is: " + getSingleElement(array));
	}

	// Method to find the element that occur only once
	static int getSingleElement(int array[]) {
		int arrLength = array.length;
		int ones = 0, twos = 0;
		int common_bit_mask;

		for (int i = 0; i < arrLength; i++) {
			twos = twos | (ones & array[i]);
			ones = ones ^ array[i];
			common_bit_mask = ~(ones & twos);
			ones = ones & common_bit_mask;
			twos = twos & common_bit_mask;
		}
		return ones;
	}
}