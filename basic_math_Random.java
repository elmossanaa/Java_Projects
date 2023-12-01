import java.util.Scanner;
import java.util.Random; //this is needed for random class

public class basic_math_Random {

    public static void main(String[] args) {
        int n1, n2, sum, human_answer;
        
        
        Scanner math = new Scanner(System.in);
        
        //Random class object
        Random rNum = new Random();
        
        n1 = rNum.nextInt(100);
        n2 = rNum.nextInt(100);
        
        System.out.println("What is the answer to thefollowing problem?");
        System.out.print(n1 + " + " + n2 + " = ? ");
        
        // Calculate the answer.
       sum = n1 + n2;
     
    // Get the user's answer.
    human_answer = math.nextInt();
    
    // Display the user's results.
 if (human_answer == sum){
  System.out.println("Correct!");
 }
   else {
  System.out.println("Sorry, wrong answer. The correct answer is " +sum);
 }
    }
}
