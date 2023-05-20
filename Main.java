import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Welcome, Good luck learning Java!
        //Java is really simple don't get demotivated by the looks of it!

        //Primitive Data types
        char aCharacter = 'n';
        boolean TrueOrFalse = true;
        int aWholeNumber = 15;
        long aBiggerInt = 1010101010;
        float aDecimalNumber = 15.01f; //Need to add an f to the end of the float number
        Double aBiggerFloat = 1000005.0000000000000001; //Double the size of a float

        //Non-Prim data types
        String aWord = "Hiiiii!"; //Just holds a word (Just an array of letters)
        int intArray[] = {1,2,3,4,5}; //Can make an array of all data types
        //Classes r a bit too advanced now

        //Some string functions
        aWord.toLowerCase();
        aWord.toUpperCase();
        // A lot more functions available, If you want to check them type aWord(string) then a .(Fullstop)

        //System.out.println outputs text into the console like cout << for c++
        System.out.println("Hello world!");

        //To get input from a user, you need to import java.util library at the top of the page
        Scanner sc = new Scanner(System.in);    //System.in is standard input system
        System.out.print("Enter (Something)");  //prints a request for input
        aWord = sc.nextLine();  //Reads string

        //Logic statements
        if(aWholeNumber == 15){ //if statements
            //print it equals 2
            System.out.println("Equals 15");
        } else if (aWholeNumber != 15) { // if it doesn't equal 15
            //print it doesn't equal 15
            System.out.println("doesn't equal 15");
        }
        //For Loops
        for (int i = 0; i < 10; i++){ //{first is decleration of i; then the condition the loop stops; then each iterations update
            System.out.println(i);
        }

    }

    //Last thing we are going to learn are Methods/Functions
    public static void addFullStop(String s) { //Don't worry about the public static void part for now
    //The String named s will act as a placeholder for the string inputted through the method later

    //Adds a . to the string
    s = s + ".";

    //prints the string
    System.out.println(s);
    }
}

//Well Done you have reached the end of this small tutorial!!
/*
Now you can try and play around with what I have taught you!
Experiment and get comfortable with the basics of Java!
Try to implement what you learned for yourself, That is the core of coding!!
 */