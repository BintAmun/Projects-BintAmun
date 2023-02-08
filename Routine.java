import java.util.Scanner;

/**
 * Routine
 */
public class Routine {

    public static void main(String[] args) {
        System.out.println("\n\nG'day! This program will determine whether you get to have any enjoyment in your downtime.");
        System.out.println("Your level of fun during the tiny bit of recreational time you have in your day will be proportional to how productive you were today.");
        System.out.println("I will now determine your fate! I hope you are ready to experience the consequences of your actions!");
        System.out.println("We will use whole numbers only, so do not attempt to fraction with me.");
        System.out.println("Remember: you did this to yourself.");

        Scanner scan = new Scanner(System.in);
        int hoursRemaining = 24;
    
        System.out.println("\nHow many hours of sleep do you require?");
        int sleep = scan.nextInt();

        hoursRemaining -= sleep;
        System.out.println("\nHours remaining thus far: " + hoursRemaining);

        System.out.println("\nHow many hours of actual mandatory, paid work did you do today?");
        int work = scan.nextInt();

        hoursRemaining -= work;
        System.out.println("\nHours remaining thus far: " + hoursRemaining);

        System.out.println("\nPlease be honest now. With yourself and me. How many of those hours were spent dicking around?");
        int dicking = scan.nextInt();

        hoursRemaining += dicking;
        System.out.println("\nHours remaining thus far: " + hoursRemaining);

        System.out.println("\nNow, I will attempt to cut you more slack than you deserve. Please approximate the number of hours spent doing chores.");
        System.out.println("By chores, I mean: cleaning the house, working on it or the exterior, servicing your car, walking the dog, and the like.");
        int chores = scan.nextInt();

        hoursRemaining -= chores;

        System.out.println("\nI will now take 1 hour from this ridiculous estimate, as you clearly exaggerated. ");
        hoursRemaining += 1;
        System.out.println("You did not spend " + chores + " hours doing chores. You only spent " + (chores - 1) + " hours doing chores.");

        System.out.println("\nHours remaining thus far: " + hoursRemaining);
        
        scan.nextLine();
        System.out.println("\nDo you have goals in life? true or false, only. Please follow my instructions.");
        boolean goals = scan.nextBoolean();
        if (goals){
            System.out.println("Finally, a worthy person. Worthy of dedicating 2 extra hours to your goals, that is!");
            hoursRemaining -= 2;
            System.out.println("\nHours remaining thus far: " + hoursRemaining);
        } else if (!goals) {
            System.out.println("Well, then you get 2 extra hours to waste your time and life. Sigh.");
            System.out.println("\nHours remaining thus far: " + hoursRemaining);
        } else {
            System.out.println("I said true or false only. Do not get smart with me. You are not that cute.");
        }

        System.out.println("Can you multitask? Not as well as me, but for a human - true or false only.");
        boolean multitask = scan.nextBoolean();
        if (multitask){
            System.out.println("Excellent. You only need 1 hour for dinner, including cooking and cleaning.");
            hoursRemaining -= 1;
            System.out.println("\nHours remaining thus far: " + hoursRemaining);
        } else if (!multitask) {
            System.out.println("I guess you will require 2 hours for dinner, since you can't handle cooking and cleaning at the same time.");
            System.out.println("\nHours remaining thus far: " + hoursRemaining);
        } else {
            System.out.println("I said true or false only. Do not make me take another hour from your life.");
        }


        scan.close();
    }//main

}//Routine