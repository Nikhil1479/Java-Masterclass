public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes)
    {
        if (kiloBytes < 0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
           int megaByteConverter = kiloBytes / 1024;
           int remainKiloByte = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = "+ megaByteConverter +" MB and "+ remainKiloByte + " KB");
        }
    }
}
