import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        int odds = odds();
        int evens = evens();
        int twod = twod();
        int g500 = g500();
        int greatest = greatest();
        int least = least();
        int sum = sum();
        double mean = mean();
        int mode = mode();
        System.out.println(odds);
        System.out.println(evens);
        System.out.println(twod);
        System.out.println(g500);
        System.out.println(greatest); 
        System.out.println(least);
        System.out.println(sum);
        System.out.println(mean);
        System.out.println(mode);
        s.close();
    }

    public static int odds() throws FileNotFoundException{
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        return odds;
    }
    public static int evens() throws FileNotFoundException{
        s = new Scanner(f);
        int evens = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 == 0)
                evens++;
        }
        return evens; 
    }
    public static int twod() throws FileNotFoundException{
        s = new Scanner(f);
        int twod = 0;
        while (s.hasNext()) {
            int nextint = s.nextInt();
            String strint = "" + nextint;
            int x =  strint.length();
            if (x == 2){
                twod++;
            }
        }
        return twod;
    }

    public static int g500() throws FileNotFoundException{
        s = new Scanner(f);
        int g500 = 0;
        while (s.hasNext()) {
            int g500comp = s.nextInt();
            if (500 < g500comp){
                g500++;
            }
        }
        return g500;
    }

    public static int greatest() throws FileNotFoundException{
        s = new Scanner(f);
        int greatest1 = s.nextInt();
        while (s.hasNext()) {
            int greatestcomp = s.nextInt();
            if (greatest1 < greatestcomp){
                greatest1 = greatestcomp;
            }
        }
        return greatest1;
    }

    public static int least() throws FileNotFoundException{
        s = new Scanner(f);
        int least1 = s.nextInt();
        while (s.hasNext()) {
            int leastcomp = s.nextInt();
            if (least1 > leastcomp){
                least1 = leastcomp;
            }
        }
        return least1;
    }

    public static int sum() throws FileNotFoundException{
        s = new Scanner(f);
        int sum = 0;
        while (s.hasNext()) {
            int nextint = s.nextInt();
            sum += nextint;
        }
        return sum;
    }

    public static double mean() throws FileNotFoundException{
        s = new Scanner(f);
        double sum = 0.0;
        double numb= 0.0;
        while (s.hasNext()) {
            int nextInt = s.nextInt();
            sum += nextInt;
            numb++;
        }
        return (sum/numb);
    }

    public static int mode() throws FileNotFoundException{
        s = new Scanner(f);
        ArrayList<Integer> numList = new ArrayList<>();
        while (s.hasNext()) {
            numList.add(s.nextInt());
        }
        int len = numList.size();
        int maxFreq = 0;
        int maxNumb = 0;
        for (int i = 0; i < len; i++){
            int count = 0;
            for(int j = 0; j < len; j++){
                if (numList.get(i).equals(numList.get(j))){
                    count++;
                }
                if (count > maxFreq)
                {
                    maxFreq = count;
                    maxNumb = numList.get(i);
                }
            }
        }
        return maxNumb;
    }

}