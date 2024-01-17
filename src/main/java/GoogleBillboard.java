

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public final static String nums; 
	public final static double othNum; 
	public static void main(final String[] args) {
		for (int i = 2; i < e.length()-10; i++) {
    			nums = e.substring(i,10+i);
    			othNum = Double.parseDouble(nums);
    			if (isPrime(othNum) == true) {
      				System.out.println(othNum);
      				break;
    			}
  		}
	}
	

	//Finish this function
	public boolean isPrime(double num){
  		if (num < 2) {
    			return false;
  		} else {
    			for (int i = 2; i <= Math.sqrt(num); i++) {
      				if (num%i == 0) {
        				return false;
      				} 
    			}
    		return true;
  		}
	}

}

