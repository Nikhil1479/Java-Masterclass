public class MinutesToYearsDays {

    public static void printYearsandDays(long minutes)
    {
        if(minutes < 0)
        {
            System.out.println("Invalid Value");
        }
        else {
            long years = minutes / 525600;             // 1 Year = 525600 Minutes (Converting minutes to years)
            long remainingMinutes = minutes % 525600; // It will Calculate Remaining Minutes
            long days = remainingMinutes / 1440;     // Converting the remaining minutes to days

            System.out.println(minutes + " min" + " = " + years + " y and " + days + " d");
        }
    }
}