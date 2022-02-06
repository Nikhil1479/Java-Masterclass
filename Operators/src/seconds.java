public class seconds {
    public static void main(String[] args)
    {
        int mySec = 7209, hours = 0, mins = 0;

        hours = mySec / 3600;  //    3663/3600 = 1
        mySec = mySec % 3600; //     3663 % 3600 = 63

        mins = mySec /60;    //      63 / 60 = 1
        mySec = mySec % 60; //       63 % 60 = 3

        System.out.println("Hours: "+hours);
        System.out.println("Minutes: "+mins);
        System.out.println("Seconds: "+mySec);
    }
}