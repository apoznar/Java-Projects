public class Time {

    public static void main(String[] args) {
        //this method shows various data about set time
        int hour = 12;
        int minute = 37;
        int second = 20;
        System.out.print("Number of seconds since midnight: ");
        System.out.println(hour * 3600 + minute * 60 + second);
        //calculating seconds since midnight
        int hour2 = 24 - hour;
        int minute2 = 60 - minute;
        int second2 = 60 - second;
        System.out.print("Number of seconds remaining in a day: ");
        System.out.println(hour2 * 3600 + minute2 * 60 + second2);
        //calculating remaining seconds in a day
        double hour3 = 12.0;
        double minute3 = 37.0;
        double second3 = 20.0;
        double secondsInADay = 86400.0;
        double passedSeconds = hour3 * 3600 + minute3 * 60 + second3;
        double fraction = passedSeconds / secondsInADay;
        System.out.print("Fraction of the day that has passed: ");
        System.out.println(fraction + " %");
        //calculating fraction of the day that has passed
        int hour4 = 13;
        int minute4 = 13;
        int second4 = 45;
        int elapsedTimeInSeconds = (hour4 - hour) * 3600 + (minute4 - minute) * 60 + (second4 - second);
        System.out.print("Elapsed time since I started working: ");
        System.out.println(elapsedTimeInSeconds + " seconds.");
        //calculating seconds spent on this exercise
    }
}