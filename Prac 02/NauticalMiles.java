public class NauticalMiles {
    public static void main(String[] args){
        final double KMINNAUTICALMILE = 1.852;
        final double MILESINNAUTICALMILE = 1.150779;
        double nauticalMiles = 10.0;
        double kilometers = KMINNAUTICALMILE * nauticalMiles;
        double miles = MILESINNAUTICALMILE * nauticalMiles;

        System.out.println("There are " + kilometers + " kilometers in " + nauticalMiles + " nautical miles.");
        System.out.println("There are " + miles + " miles in " + nauticalMiles + " nautical miles.");
    }
}
