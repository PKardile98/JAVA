package Practise1;

public class ArmstrongNumbers {

	// AS no is are numbers that are equal to the sum of their
	//own digits raised to the power of the number of digits
	// 1^1=1,2^1=2....
	
	    public static void main(String[] args) {
	        System.out.println("Armstrong numbers between 1 and 50:");
	        for (int num = 1; num <= 50; num++) {  // For loop for checking the Aemstrong no. between 1-50
	            if (isArmstrong(num)) {
	                System.out.print(num + " ");
	            }
	        }
	    }
	    
	    // method to check if a number is an Armstrong number
	    public static boolean isArmstrong(int number) {
	        int originalNumber = number;
	        int sum = 0;
	        int numDigits = countDigits(number);
	        
	        while (number > 0) {
	            int digit = number % 10;  
	            sum += Math.pow(digit, numDigits); // power function 1^1
	            number /= 10;
	        }
	        
	        return sum == originalNumber;
	    }
	    
	    // method to count the number of digits in a number
	    public static int countDigits(int number) {
	        int count = 0;
	        while (number > 0) {
	            number /= 10;
	            count++;
	        }
	        return count;
	    }
	}


