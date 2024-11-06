import java.util.Scanner;;
public class gradeAnalyzer {
    public static void main(String[] args) {
        int[] numbers = getInputAsArray();
        readGrades(numbers);
 }
    public static int[] getInputAsArray()
    {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int amount= in.nextInt();
        int[] numbers= new int[amount];
        System.out.print("Enter elements: ");
        for(int i=0;i<numbers.length;i++)
        {
        numbers[i]=in.nextInt();
        }
        in.close();
        return numbers;
    }   
    public static void readGrades(int[] random)
    {
        int sum=0;
        int max=0;
        int min=100;
        for(int number:random)
        {
            sum+= number;
            if(number>max)
            {
                max = number;
            }
            if(number <min)
            {
                min= number;
            }
        }
        double mean= (double) sum / random.length;
        System.out.println("Mean: " + mean);
        System.out.println("Min: "+ min);
        System.out.println("Max: "+ max);
    }
}