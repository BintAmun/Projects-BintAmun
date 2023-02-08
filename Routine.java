import java.util.Scanner;

/**
 * Routine
 */
public class Routine {

    public static void main(String[] args) {
        System.out.println("G'day! This program will determine whether you get to have any enjoyment in your downtime.");
        System.out.println("Your level of fun during the tiny bit of recreational time you have in your day will be proportional to how productive you were each day.");
        System.out.println("I will now determine your fate! I hope you are ready to experience the consequences of your actions!");
        System.out.println("We will use whole numbers only, so do not attempt to fraction with me.");
        System.out.println("Remember: you did this to yourself.");

        Scanner scan = new Scanner(System.in);
        int hoursRemaining = 24;
    
        System.out.println("How many hours of sleep do you require?");
        int sleep = scan.nextInt();

        hoursRemaining -= sleep;

        System.out.println("How many hours of actual mandatory, paid work did you do today?");
        int work = scan.nextInt();

        hoursRemaining -= work;

        System.out.println("Please be honest now. With yourself and me. How many of those hours were spent dicking around?");
        int dicking = scan.nextInt();

        hoursRemaining += dicking;

        System.out.println("Now, I will attempt to cut you more slack than you deserve. Please approximate the number of hours spent doing chores.");
        System.out.println("By chores, I mean: cleaning the house, working on it or the exterior, servicing your car, walking the dog, and the like.");
        int chores = scan.nextInt();

        hoursRemaining -= chores;

        System.out.println("I will now take 1 hour from this ridiculous estimate, as you clearly exaggerated.");

        hoursRemaining += 1;

        


    }
}