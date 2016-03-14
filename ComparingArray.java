public class ComparingArray {
	public static void main(String [] args) {
		int[] numbers = new int[10];
		for (int i=0; i<numbers.length; i++) {
			numbers[i] = i*2;
		}
		int[] numbers2 = new int[10];
		for (int i=0; i<numbers2.length; i++) {
			numbers2[i] = i*2;
		}
		for (int i=0; i<numbers2.length; i++) {
			System.out.println (numbers[i] + "\t" + numbers2[i]);
		}
		System.out.println(numbers);
		System.out.println(numbers2);
		System.out.println(numbers.equals(numbers2));

	}
}

