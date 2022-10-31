import java.util.Scanner;

public class EmailValidation {
	public static void main(String[] args) {
	String strArray[] = new String[10]; //Declaring a string array 
	strArray[0] = "simon.hasler@gmx.com";
	strArray[1] = "leonie.klein@gmx.com";
	strArray[2] = "lea.hoch@gmx.com";
	strArray[3] = "max.neumann@gmx.com";
	strArray[4] = "henrik.fiesler@gmx.com";
	strArray[5] = "laura.kramm@gmx.com";
	strArray[6] = "sabine.neuwirth@gmx.com";
	strArray[7] = "yes.new@gmail.com";
	strArray[8] = "nevertoolate@yahoo.com";
	strArray[9] = "ram.hello@gmail.com";
	boolean contains = false;
	System.out.println("Enter the email to search:"); 
	Scanner sc = new Scanner(System.in);//taking input from user to search in the given string array
	String searchStr = sc.nextLine();
	for(int i=0; i<strArray.length; i++) { //loop for iterating in array
		
		if(searchStr.equals(strArray[i])) { //comparing user input with string 
			contains = true;
			break;
		}
		
	}
	if(contains){
		 System.out.println("Valid Email Id ");
		 }else{
		 System.out.println("Invalid Email Id ");
		 }
		 
}
}