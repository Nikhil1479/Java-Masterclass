public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));

    }

    public static String getDurationString(int minutes, int seconds)
    {
        if(minutes >= 0 && (seconds >= 0 && seconds <= 59))
        {
            int hour = minutes / 60;
            minutes = minutes % 60;

            String hourString = hour + "h";
            if(hour < 10)
            {
                hourString = "0" + hourString;
            }

            String minuteString = minutes + "m";
            if(minutes < 10)
            {
                minuteString = "0" + minuteString;
            }

            String secondString = seconds + "s";
            if(seconds < 10)
            {
                secondString = "0" + secondString;
            }
            return hourString + " " + minuteString + " " + secondString;
        }
        return "Invalid value";
    }

    public static String getDurationString(int seconds)
    {
        if(seconds >= 0)
        {
            int myMinute, mySeconds;
            myMinute = seconds / 60;
            mySeconds = seconds % 60;

           return getDurationString(myMinute, mySeconds);
        }
        return "Invalid Value";
    }
}
