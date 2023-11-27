import java.util.Scanner;


public class food_item_calculator {
    /**Write a program that asks the user to enter the number of calories and fat grams in a food 
item. The program should display the percentage of the calories that come from fat. One 
gram of fat has 9 calories; therefore:
* 
Calories from fat = Fat grams * 9
* 
The percentage of calories from fat can be calculated as follows:
* 
Calories from fat/Total calories
* 
If the calories from fat are less than 30 percent of the total calories of the food, it should 
also display a message indicating the food is low in fat.**/

    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        float calories;
        float fat_grams;
        
        System.out.println("enter the number of calories in your food item: ");
        calories = a.nextFloat();
        System.out.println("enter the amount of fat grams in your food item: ");
        fat_grams = a.nextFloat();
        float calories_from_fat = fat_grams * 9;
        float p_of_calories = calories_from_fat / calories;
        System.out.println("Based on your input, the calories from fat is: " +
                calories_from_fat);
        System.out.println(p_of_calories);
        
        if(p_of_calories<.3){
            System.out.println("food is low in fat");
        }
        }
            
            
        }
        
        
        
        
     
 

