import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Paint Buckets Required");
        double width, height, areaPerBucket, ExtraBuckets;
        int choice;
        while(true)
        {
            System.out.println("""
                    Enter Your Choice
                    1. Width, Height, Area Per Bucket, Extra Paint Bucket\s
                    2. Width, Height, Area Per Bucket
                    3. Area, Area Per Bucket
                    4. Exit
                    """);
            choice = sc.nextInt();
            switch (choice)
            {
                case 1:

                    System.out.println("Enter Width: ");
                    width = sc.nextDouble();
                    System.out.println("Enter Height: ");
                    height = sc.nextDouble();
                    System.out.println("Enter Area Per Bucket: ");
                    areaPerBucket = sc.nextDouble();
                    System.out.println("Enter Extra Paint Buckets: ");
                    ExtraBuckets = sc.nextDouble();
                    System.out.println("Total Buckets Required: "+ getBucketCount(width, height, areaPerBucket, ExtraBuckets)+ "\n");
                    break;

                case 2:
                    System.out.println("Enter Width: ");
                    width = sc.nextDouble();
                    System.out.println("Enter Height: ");
                    height = sc.nextDouble();
                    System.out.println("Enter Area Per Bucket: ");
                    areaPerBucket = sc.nextDouble();
                    System.out.println("Total Buckets Required: "+ getBucketCount(width, height, areaPerBucket)+ "\n");
                    break;

                case 3:
                    double area;
                    System.out.println("Enter Area Of Wall: ");
                    area = sc.nextDouble();
                    System.out.println("Enter Area Per Bucket: ");
                    areaPerBucket = sc.nextDouble();
                    System.out.println("Total Buckets Required: "+ getBucketCount(area, areaPerBucket)+ "\n");
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!"+ "\n");
            }
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, double extraBuckets)
    {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets <= 0)
        {
            return -1;
        }
        double BucketsReq;
        double areaOfWall;

        areaOfWall = width * height;
        BucketsReq = Math.ceil((areaOfWall / areaPerBucket) - extraBuckets);

        return (int)BucketsReq;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket)
    {
        if(width < 0 || height < 0 || areaPerBucket <= 0)
        {
            return -1;
        }
        double BucketsReq;
        double areaOfWall;

        areaOfWall = width * height;
        BucketsReq = Math.ceil((areaOfWall / areaPerBucket));

        return (int)BucketsReq;
    }

    public static int getBucketCount(double area, double areaPerBucket)
    {
        if(area <= 0 || areaPerBucket <= 0)
        {
            return -1;
        }
        double BucketsReq;
        BucketsReq = Math.ceil((area/ areaPerBucket));

        return (int)BucketsReq;
    }
}