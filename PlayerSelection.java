import java.util.Scanner;
// This is the class player selection
public class PlayerSelection{
    //This is where the code will begine executing
    public static void main(String[] args) {
        // Declaring variables
        Scanner scanner=new Scanner(System.in);
        String name;
        int age;
        double height;
        double weight;
        String position;
        int  jerseyNumber;
        String eligibility;
        String lineupDecision;
        String finalDecision;
        String category;
        int meter=100;
        double pounds=0.45359237;
        // Collecting use input
        System.out.print("Enter player name: ");
        name= scanner.nextLine();
        System.out.print("Enter player age: ");
        age=scanner.nextInt();
        System.out.print("Enter player height in metres: ");
        height=scanner.nextDouble();
        System.out.print("Enter player wieght in lbs: ");
        weight=scanner.nextDouble();
        System.out.print("Enter player jersey number: ");
        jerseyNumber=scanner.nextInt();
        //Coversions for wieght and height
        int weightInKg=(int)(weight*pounds);
        int heightInCm=(int)(height*meter);
        //
        if (age>=18 && age<20){
            category="Risng Star";
        }
        else if (age>=20 && age<=30){
            category="Prime Player";
        }
        else if (age>30){
            category="Veteran";
        }
        else{
            category="N/A";
        }
        if ((age>=18 && age<35) && (weightInKg<90)){
            eligibility="Eligible";
        }
        else{
            eligibility="Not Eligible";
        }
        position=switch(jerseyNumber){
            case 1 -> "Goalkeeper";
            case 2, 5 -> "Defender";
            case 7, 11 -> "Winger";
            case 6, 8 -> "Midfielder";
            case 9 -> "Striker";
            case 10 -> "Playmaker";
            default -> "Player position not known";
        };
        if ((category=="Prime Player") && (weightInKg<80)){
        lineupDecision="Starter";
        }
        else{
            lineupDecision="Bench";
        }
        if (lineupDecision=="Starter"){
            finalDecision="Play";
        }
        else{
            finalDecision="Rest";
        }
        switch(eligibility){
            case "Eligible":
            System.out.println("Player: " + name);
            System.out.println("Age: " +age+"["+category+"]");
            System.out.println("Height: "+heightInCm+" cm");
            System.out.println("Weight: "+ weightInKg+" kg");
            System.out.println("Jersey:" + jerseyNumber);
            System.out.println("Position:" +position);
            System.out.println("Eligibility:" + eligibility);
            System.out.println("Lineup Decision: "+ lineupDecision);
            System.out.print("Final Decision(Play/Rest): "+finalDecision);
            break;
            case "Not Eligible": System.out.println("Player: " + name);
            System.out.println("Age: " +age+"["+category+"]");
            System.out.println("Height: "+heightInCm+" cm");
            System.out.println("Weight: "+ weightInKg+" kg");
            System.out.println("Jersey:" + jerseyNumber);
            System.out.println("Position:" +position);
            System.out.println("Eligibility:" + eligibility+" player is too old or heavy");
            break;
        }
        }
        

        

        

    }

