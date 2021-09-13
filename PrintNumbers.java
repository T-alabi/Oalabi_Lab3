package oalabi_Lab3;

public class PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(returnPrintNumbers(13));
		System.out.println(returnPrintNumbers(10));
	}

	public static String returnPrintNumbers(int n) {
		int numCount = 0;
		String printNumbers = "";
		
		for (int i = 1; i <=n; i++) {
			
			numCount++;
			if ((numCount-1) % 5 == 0) {
//				numCount = 0;
				printNumbers+= "\n";
			}
			
			printNumbers +=" " + i;
		}
		
		return printNumbers;
	}
}
