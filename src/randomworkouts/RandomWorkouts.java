package randomworkouts;

/**
 *
 * @author lewhi7273
 */
public class RandomWorkouts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create an array with all strength workouts
       String strength[] = {"Crunches", "Bicep Curl", "Pushups", "Bench Press", "Pulldowns", "Tricep Extentions", "Shoulder Press", "Goblet Squats","Back Squats"};
        //Create an array with all cardio workouts
        String cardio[] = {"Stair Climber", "Bike", "Eliptical", "Treadmill"};
        //Create 2d array to pick final workout (3 strength 1 cardio)
        String workout[][] ={strength, cardio};
        
        //Create array for the amount of time
        String time[] = {"10","15","20"};
        int randomtime = (int)(time.length*Math.random());        
        
        int pick2 = (int)(cardio.length*Math.random());
        System.out.println("The cardio you will begin with is: " + cardio[pick2] + " for " +time[randomtime] +" minutes");
        System.out.println("------------------------------------------------------------------");
        //pick 3 random strength workouts
        for(int i = 0; i<5; i++){
           
            int pick = (int)(strength.length*Math.random());
            System.out.print(" 3 set of 10 of: " + strength[pick] + "\n");
        }
               
        
    }
    
}
