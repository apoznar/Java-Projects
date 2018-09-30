public class Date {

    public static void main(String[] args) {
        //this method prints desired date in American and European format
        String day = "Tuesday";
        int date = 18;
        String month = "September";
        int year = 2018;
        //System.out.println(day);
        //System.out.println(date);
        //System.out.println(month);
        //System.out.println(year);
        System.out.println("American format: ");
        System.out.println(day + ", " + month + " " + date + ", " + year);
        System.out.println("European format: ");
        System.out.println(day + " " + date + " " + month + " " + year);
    }
}