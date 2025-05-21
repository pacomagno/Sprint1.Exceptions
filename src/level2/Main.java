package level2;

import level2.exceptions.InvalidInputException;
import level2.model.Input;


public class Main {
    public static void main(String[] args) {

        boolean test = Input.readBoolean("Do you want to continue?");
        System.out.println("Wonderfull, lets start the test");
        System.out.println();
        char letter = Input.readChar("Enter the initial of your name:");
        System.out.println("Awesome,The first letter used in naming stars refers to the designator for the brightest star in a constellation ");
        System.out.println();
        String planets = Input.readString("Choose a planet: ");
        System.out.println("Excellent choice, that's one of a million planets in the milky way: ");
        System.out.println();
        int satellites = Input.readInt("How many satellites are in the orbit of the earth: ");
        System.out.println("OHh! that many satellites, nice!");
        System.out.println();
        byte moon = Input.readByte("Tell me the number of the building you live in: ");
        System.out.println("Did you know the sun is 149.6 million kilometers from your building? ");
        System.out.println();
        float sandGrain = Input.readFloat("How small you think a grain of sand is, (use decimals)? ");
        System.out.println("Oh! That’s close, but it’s tricky to notice: ");
        System.out.println();
        double pencil = Input.readDouble("Do you know how long a pencil usually is?");
        System.out.println("That's Small, did you know the earth have a diameter of 12.756 km");
        System.out.println("Thanks for doing this simple test, have a nice day!");

    }


}




