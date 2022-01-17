
public class Hltfive {
	
	
	// Q1
	
	public void prime(int number) { 
		
		boolean isPrime = true;
		
		if(number <= 1) {
			System.out.println(number + " is not a prime number");
			
		}
		else {
			
			for(int i = 2; i < number; i++) {
				
				if(number % i == 0) {
					System.out.println(number + " is not a prime number");
					isPrime = false;
					
					break;
				}
			}
				
			
		}
		
		
			if(isPrime == true) {	
				
				System.out.println(number + " is a prime number");
				
			}	
		
	}
	
	public void numberRange() {
		for(int i = 100; i <= 500; i++) {
			System.out.println(i);
		}
	}
	
	public void sum() {
		int sum = 0;
		
		for(int i = 1; i <= 10; i++)
		{
			
			sum = sum + i;	
		}
		
		System.out.println("Sum of number 1 - 10 is: " + sum);
	}
	
	public void reverseNumbers() {
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
	}
	
	
	

	public static void main(String[] args) {
		
		//Creating an objects for hltfive
		
		Hltfive q1 = new Hltfive();
		Hltfive q2 = new Hltfive();
		Hltfive q3 = new Hltfive();

		Hltfive q4 = new Hltfive();
		
		
		//Check wether a number is prime or not
		q1.prime(9);
		
		//Sum numbers 1-10
		q3.sum();
		
		//Displays number 1-10 in reverse order
		q4.reverseNumbers();
		
		//Displays number range 100-500
		q2.numberRange();
		
		

	}

}
