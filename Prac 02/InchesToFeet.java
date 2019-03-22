public class InchesToFeet {
    public static void main(String[] arg){
        final int INCHESINFOOT = 12;
        int inchesToConvert = 86;

        int feet = inchesToConvert / INCHESINFOOT;
        int inches = inchesToConvert % INCHESINFOOT;

        System.out.println("There are " + feet + " feets and " + inches + " inches in " + inchesToConvert + " inches.");

    }
}
