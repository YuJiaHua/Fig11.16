import java.util.ArrayList;
import java.util.Scanner;

public class Fig11_16 { 
  public static void main(String[] args) {
	// New ArrayList to save input value	  
	ArrayList<Integer> list = new ArrayList<>();  
		  
    int number1 = (int)(Math.random() * 10);
    int number2 = (int)(Math.random() * 10);
    
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    System.out.print(
      "What is " + number1 + " * " + number2 + "? ");
    int answer = input.nextInt();
    
    // Save the input answer to list 
    list.add(answer);
    
    while (number1 * number2 != answer) {
    	
      System.out.print("Wrong answer. Try again. What is " 
        + number1 + " * " + number2 + "? ");
      
      answer = input.nextInt();
      
      //Check an answer whether is entered again in the array
      if(list.contains(answer)){
    	  System.out.println("You already entered " + answer);
      }
      //Save the input answers to list 
      list.add(answer);

    }
    System.out.println("You got it!");
  }
}
