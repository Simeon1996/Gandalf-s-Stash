import java.util.Scanner;

/**
 * Created by Simeon on 9/14/2015.
 */
public class GandalfsStash {
    private static Integer foodsOfGandalfCalculator(String food){
        Integer happinessPoints = 0;

        switch(food){
            case "cram": happinessPoints = 2;
                break;
            case "lembas": happinessPoints = 3;
                break;
            case "apple": happinessPoints = 1;
                break;
            case "melon": happinessPoints = 1;
                break;
            case "honeycake": happinessPoints = 5;
                break;
            case "mushrooms": happinessPoints = -10;
                break;
            default: happinessPoints = -1;
                break;
        }

        return happinessPoints;
    }
    private static String moodOfGandalfFinder(Integer happinessPoints){
        String gandalfMood = "";

        if(happinessPoints < -5){
            gandalfMood = "Angry";
        }else if (happinessPoints >= -5 && happinessPoints <= 0){
            gandalfMood = "Sad";
        }else if (happinessPoints >= 0 && happinessPoints <= 15){
            gandalfMood = "Happy";
        }else if (happinessPoints > 15){
            gandalfMood = "Special JavaScript mood";
        }

        return gandalfMood;
    }
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        String mood = "";

        Integer happinessPoints = reader.nextInt();

        reader.nextLine();

        String[] input = reader.nextLine().toLowerCase().replace("_","").split("\\W+");

        for(Integer i = 0; i < input.length;i++){
            String currentWord = input[i].replace("_","");

            happinessPoints += foodsOfGandalfCalculator(currentWord);
        }

        System.out.println(happinessPoints);
        System.out.println(moodOfGandalfFinder(happinessPoints));

    }
}
