//This program shows nested loops to simulate a clock.

public class Nested_loop_clock {

    public static void main(String[] args) {
        
        for(int hours =1; hours <= 12; hours++){
            for(int minutes=0; minutes<=59; minutes++){
                for(int seconds =0; seconds <=59; seconds++){
                    System.out.printf("%02d:%2d:%2d\n", hours,minutes, seconds);
                }
            }
        }
        
    }
}
