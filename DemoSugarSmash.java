import java.util.*;
public class DemoSugarSmash
{
    public static void main(String[] args)
    {
        SugarSmashPlayer ssPlayer = new SugarSmashPlayer();
        ssPlayer.setIdNumber(1111);
        ssPlayer.setName("Alex");
        System.out.println("\nAt start");
        display(ssPlayer);
        ssPlayer.setScores(200, 0);
        System.out.println("\nAfter setting first score");
        display(ssPlayer);
        System.out.println("Trying to set fifth score too soon");
        ssPlayer.setScores(30, 4);
        System.out.println("\nAfter setting second score");
        ssPlayer.setScores(30, 1);
        display(ssPlayer);
        System.out.println("\nTrying to set third score when second is too low");
        ssPlayer.setScores(100, 2);
        display(ssPlayer);
        System.out.println("\nAfter setting second, third, fourth, and fifth scores");
        ssPlayer.setScores(100, 1);
        ssPlayer.setScores(300, 2);
        ssPlayer.setScores(400, 3);
        ssPlayer.setScores(10, 4);
        display(ssPlayer);
        System.out.println("\nTrying to set eleventh score");
        ssPlayer.setScores(100, 10);
//-------------------------------------------------------
        PremiumSugarSmashPlayer pssPlayer = new PremiumSugarSmashPlayer();
        pssPlayer.setIdNumber(2222);
        pssPlayer.setName("Cory");
        System.out.println("\nAt start");
        display(pssPlayer);
        pssPlayer.setScores(200, 0);
        System.out.println("\nAfter setting first score");
        display(pssPlayer);
        System.out.println("Trying to set fifth score too soon");
        pssPlayer.setScores(30, 4);
        System.out.println("\nAfter setting second score");
        pssPlayer.setScores(30, 1);
        display(pssPlayer);
        System.out.println("\nTrying to set third score when second is too low");
        pssPlayer.setScores(100, 2);
        display(pssPlayer);
        System.out.println("\nAfter setting second through tenth scores");
        for(int x = 1; x < 10; ++x)
            pssPlayer.setScores(130, x);
        display(pssPlayer);
        System.out.println("\nTrying to set eleventh score");
        pssPlayer.setScores(100, 10);
        display(pssPlayer);
        System.out.println("\nTrying to set 51st score");
        pssPlayer.setScores(100, 50);
        display(pssPlayer);
    }
    public static void display(SugarSmashPlayer p)
    {
        System.out.println("   ID #" + p.getIdNumber() + "  Name: " +
                p.getName());
        for(int x = 0; x < p.getLEVELS(); ++x)
            System.out.print("   " + p.getScore(x));
        System.out.println();
    }
}