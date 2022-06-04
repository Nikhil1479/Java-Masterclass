package WebTechExam;

import java.io.*;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {Scanner sc =
            new Scanner(System.in);
        System.out.println("Enter : ");
        String str =sc.nextLine();
        String s[] = str.split(" ");String ans =
                "";
        for (int i = s.length - 1; i >= 0; i--) {ans += s[i] + " ";
        }
        System.out.print("Output 1 : ");
        System.out.println(ans);
        ans = ""; String f =
                "";
        System.out.print("Output 1 : ");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
            f += str.charAt(i);
        }
        System.out.print("\n");
        String a[] = f.split(" ");ans = "";
        for (int i = a.length - 1; i >= 0; i--) {ans += a[i] + " ";
        }
        System.out.print("Output 1 : ");
        System.out.println(ans);
    }
}