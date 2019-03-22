public class QuartsToGallons {
    public static void main(String[] args){
        final int QUARTSINGALLON = 4;
        int numQuartsNeeded = 18;
        int quarts = numQuartsNeeded % QUARTSINGALLON;
        int gallons = numQuartsNeeded / QUARTSINGALLON;

        System.out.println("A job that needs " + numQuartsNeeded + " quarts required " + gallons + " gallons plus " +
                quarts + " quarts.");
    }
}
