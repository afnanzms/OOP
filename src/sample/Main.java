package sample;

import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        int a;
        Scanner nom = new Scanner (System.in);
        System.out.println ("Enter An integer for seconds : ");
        a = nom.nextInt();
        System.out.println (a + " seconds is " + a/60 + "minutes and " + a % 60 + "seconds");
    }
}


public class Main
{
    public static void main(String[] args)
    {
        int Hari;
        System.out.println("Jika hari ini adalah hari Senin,maka 1000 hari berikutnya adalah:");
        Hari = 1000%7;

        System.out.println("Hari berikutnya adalah hari : ");

        switch (Hari)
        {
            case 0:
                System.out.println("Senin");
                break;
            case 1:
                System.out.println("Selasa");
                break;
            case 2:
                System.out.println("Rabu");
                break;
            case 3:
                System.out.println("Kamis");
                break;
            case 4:
                System.out.println("jumat");
                break;
            case 5:
                System.out.println("Sabtu");
                break;
            case 6:
                System.out.println("Minggu");
        }
    }
}
