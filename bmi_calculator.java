import java.util.Scanner;

public class bmi_calculator {
    /**Write a program that calculates and displays a person’s body mass index (BMI). The BMI is 
often used to determine whether a person with a sedentary lifestyle is overweight or underweight 
* for his or her height. A person’s BMI is calculated with the following formula:
BMI = Weight * 703 / Height^2
*
where weight is measured in pounds and height is measured in inches. The program should 
display a message indicating whether the person has optimal weight, is underweight, or is 
overweight. A sedentary person’s weight is considered optimal if his or her BMI is between 
18.5 and 25. If the BMI is less than 18.5, the person is considered underweight. If the BMI 
value is greater than 25, the person is considered overweight. **/

    public static void main(String[] args) {
        
        Scanner i = new Scanner(System.in);
        double Weight;
        double height;
        double bmi;
        
        System.out.println("enter your weight:  ");
        Weight = i.nextDouble();
        
        System.out.println("enter your height in inches (hint: in inches, example: "
                + "height 6'8= 80 \n");
        height = i.nextDouble();
        
        bmi = (Weight *703)/ Math.pow(height,2);
        
        System.out.println(bmi);
        if(bmi<18.5){
            System.out.println("According to the bmi formula, you are considered underweight");
        }
        else if(bmi<=25){
            System.out.println("your bmi is considered optimal");
        }
        else if(25<bmi){
            System.out.println("the person is considered overweight");
        }
        }
            
        }
        
        
        
