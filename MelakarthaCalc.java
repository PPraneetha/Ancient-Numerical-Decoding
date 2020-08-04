
import java.util.Arrays;
import java.util.Scanner; 

public class MelakarthaCalc {
	
	public static int getFirstIndex (String [] [] alphabets, String F) {
		int k =0;
		for (int i = 0; i < alphabets.length; i++) {
			for(int j =0; j < alphabets[i].length; j++ ) {
				if(F.contentEquals(alphabets[i][j])) {
					k = j; 
					break;
				}
			}
		}
		return k; 
	}
	
	public static int getSecondIndex (String [] [] alphabets, String S) {
		int k =0;
		for (int i = 0; i < alphabets.length; i++) {
			for(int j =0; j < alphabets[i].length; j++ ) {
				if(S.contentEquals(alphabets[i][j])) {
					k = j; 
					break;
				}
			}
		}
		return k; 
	}
	
	public static int concat (int firstNum, int secondNum) {
		
		String s1 = Integer.toString(firstNum);
		String s2 = Integer.toString(secondNum);
		
		String s = s2.concat(s1);
		int Index = Integer.parseInt(s);
		return Index; 
	}
	
	public static String swaraSthanam1 (int finalIndex) {
		
		String rG = "";
		int x2 = finalIndex -1;
		if (finalIndex > 36)
			x2 = finalIndex - 36 -1;
		
		int x3 = x2 / 6; 
		
		if (x3 == 0)
			rG = "R1 G1";
		if (x3 == 1)
			rG = "R1 G2";
		if (x3 == 2)	
			rG = "R1 G3";
		if (x3 == 3)	
			rG = "R2 G2";
		if (x3 == 4)
			rG = "R2 G3";
		if (x3 == 5)
			rG = "R3 G3";
		return rG;
		
	}
	
	public static String swaraSthanam2 (int finalIndex) {
		String m = " ";
		if (finalIndex <= 36)
			m = "M1";
		if (finalIndex > 36)
			m = "M2";
		
		return m; 
	}
	
	public static String swaraSthanam3 (int finalIndex) {
		
		String dN = " ";
		int x = finalIndex -1;
		int x2 = x % 6; 
		
		if (x2 == 0)
			dN = "D1 N1";
		if (x2 == 1)
			dN = "D1 N2";
		if (x2 == 2)	
			dN = "D1 N3";
		if (x2 == 3)	
			dN = "D2 N2";
		if (x2 == 4)
			dN = "D2 N3";
		if (x2 == 5)
			dN = "D3 N3";
		return dN;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		System.out.println("Welcome to the Katapayadi Wizard! Enter the 1st syllable of the raga of your choice: ");
		
		String F = ip.nextLine();
		System.out.println("Great! Now enter the 2nd syllable of the raga of your choice: ");
		
		String S = ip.nextLine();
		//int firstIndex; 
		
		String [] [] alphabets = {{"nya", "ka", "kha", "ga", "gha", "nga", "cha", "ccha", "ja", "jha"}, 
								  {"na", "ta", "tah","da", "dah", "nna", "tha", "ttha", "dha", "ddha"},
								  {"null","pa", "pha","ba","bha","ma", "null", "null", "null", "null", },
								  {"null","ya", "ra", "la", "va", "se", "sha", "sa", "ha","null"}};
		
		int firstNum = getFirstIndex(alphabets, F);
		int secondNum = getSecondIndex(alphabets, S); 
		int finalIndex = concat(firstNum, secondNum);
		
		String swaras1= swaraSthanam1(finalIndex);
		//String finalanswer = The [index]th melakartha: aro [swaras1] and ava [swaras2].
		System.out.println(firstNum);
		System.out.println(secondNum);
		
		System.out.println(finalIndex);
		
		System.out.println(swaras1);
		
	}
}
