import java.util.Scanner;

class Bill {
  public static void main(String[] args) {
    Scanner kin = new Scanner(System.in);
    System.out.println("Welcome to the Change Generator");
		System.out.println("Please Enter Amount of Bill");
		String Bill = kin.nextLine();
		System.out.println("Bill  " +  Bill);
		
		System.out.println("Please enter the amount will pay");
		String Pay = kin.nextLine();
		System.out.println("You payed  " + Pay);
		
		int Change = Pay / Bill
		System.out.println( Change )
		
    
  }
}