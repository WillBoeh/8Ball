package Magic8Ball;

import java.util.Scanner;

public class Ball {
    public static void main(String[] args){
        Scanner questionInput = new Scanner(System.in);
    System.out.println("What is your question?");
    questionInput.nextLine();
    int luckyNumber = (int)(Math.random()* 10);
    if(luckyNumber == 1){
        System.out.println("Absolutely!");
    }
    else if (luckyNumber == 2){
        System.out.println("Never!");
    }
    else if (luckyNumber == 3){
        System.out.println("The odds are decent.");
    }
    else if (luckyNumber == 4){
        System.out.println("The odds don't look good.");
    }
    else if (luckyNumber == 5){
        System.out.println("Maybe...");
    }
    else if (luckyNumber == 6){
        System.out.println("I'm not sure, try again...");
    }
    else if (luckyNumber == 7){
        System.out.println("Yes!");
    }
    else if (luckyNumber == 8){
        System.out.println("No!");
    }
    else if (luckyNumber == 9){
        System.out.println("Hmmmm...");
    }
    else{
        System.out.println("Ask me something else!");
    }
    }
}
