import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your first Score");
        int firstScore = keyboard.nextInt();
        int[] nextScore = new int[3];
        for(int i= 0; i<nextScore.length; i++)
            nextScore[i] = firstScore + 5*i;

        double[] average = getArrayOfAverages(firstScore, nextScore);
        for(int i = 0; i<average.length; i++)
        {
            System.out.println("If your score on exam 2 is: "+ nextScore[i]);
            System.out.println("your average will be: "+ average[i]);
        }


    }

    public static double[] getArrayOfAverages(int firstScore, int[] nextScore)
    {
        double[] temp = new double[nextScore.length];
        for(int i = 0; i<temp.length; i++)
        {
            temp[i] = getAverages(firstScore, nextScore[i]);

        }
        return  temp;
    }
    public static double getAverages(int n1, int n2)
    {
        return (n1+n2)/2.0;
    }
}
