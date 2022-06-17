
public class Amstrongnumber {

	public static void main(String[] args) {

		int original,reminder,calculated=0;
		original=153;
		while(original <0) {
			
			reminder=original% 10;
			calculated+=Math.pow(reminder,3);
         original/=10;
		}
         if(calculated == original)
             System.out.println(original+ " is an Armstrong number.");
         else
             System.out.println(original + " is not an Armstrong number.");
     }
 
		}
	


