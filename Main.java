import java.util.Scanner;
/**
 *Calculates the sum of the odd numbers upto the entered number
 * @author Jackson
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Scanner for input
    Scanner input = new Scanner(System.in);

    //get the interger from the user
    System.out.println("Please enter the maximum number to sum to:");
    int num = input.nextInt();

    //declare and initialize sum variable
    int sum = 0;

    //for loop to count to the inputted number
    for(int count = 0; count <= num; count++){
      //if statement to check if counted number is odd or not
      if(count % 2 == 1){
        //storing the odd number into a another variable for later use
        sum = sum + count;
      }
    }
    //telling the user their answer
    System.out.println("The sum of the odd numbers is " + sum);
}
}
