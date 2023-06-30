package csh.dev;

import csh.enumeration.Continent;
import csh.enumeration.Days;

/**
 * @author cshdev110
 * @description Example Enum
 */
public final class App {

    /**
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Value 1: " + Days.MONDAY);
        System.out.println("Value 2: " + Days.TUESDAY);
        System.out.println();

        System.out.println("Country no. 4: " + Continent.AMERICA);
        System.out.println("Number of countries: " + Continent.AMERICA.getCountries());
        System.out.println();
        
        System.out.println("Country no. 1: " + Continent.AFRICA);
        System.out.println("Number of countries: " + Continent.AFRICA.getCountries());
        System.out.println();

        indicateDay(Days.SUNDAY);

        for (Continent conti : Continent.values()) {
            System.out.println("Continent " + conti + " has " + conti.getCountries() + " countries.");
        }
    }

    private static void indicateDay(Days days) {
        switch (days) {
            case MONDAY:
                System.out.println("Monday");
                break;
            case TUESDAY:
                System.out.println("Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday");
                break;
            case THURSDAY:
                System.out.println("Thursday");
                break;
            case FRIDAY:
                System.out.println("Friday");
                break;
            case SATURADAY:
                System.out.println("Saturday");
                break;
            case SUNDAY:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
