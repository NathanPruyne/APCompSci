
public class LoopsIntroduction {

	public static void main(String[] args) {
		//example 1: output "Hello World" 20 times
		for (int i = 0; i < 20; i++) {
			System.out.println("Hello World!");
		}
		//example 2.0: add all #s 1-30
		int total = 0;
		//parts of loop: (counter initialization, condition check, counter update)
		for (int i = 1; i <= 30; i++) {
			total += i;
		}
		System.out.println(total);

		//example 2.1: add all ODD #s 9-51 (inclusive). Print result.
		int sum = 0;
		for (int i = 9; i <= 51; i += 2) {
			sum += i;
		}
		//System.out.println(i) will fail because i is local only to loop
		System.out.println(sum);
		
		/* for (int i = 1; i <= 10; i--) { //about to be infinite, bad!
			System.out.println(i);
		} */
		
	}

}
