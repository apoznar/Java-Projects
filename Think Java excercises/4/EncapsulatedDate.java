/** 
 * This class prints set date in two formats, using parameters from other methods 
 **/
public class EncapsulatedDate {

    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println("American format: ");
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }
    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println("European format: ");
        System.out.println(day + " " + date + " " + month + " " + year);
    }
    
    public static void main(String[] args) {
        String day = "Tuesday";
        int date = 18;
        String month = "September";
        int year = 2018;
        printAmerican(day, date, month, year);
        printEuropean(day, date, month, year);
    }

}



       
