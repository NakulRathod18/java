import java.util.Scanner;

public class sum
{
    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);
        int num_1,num_2,sum;
        System.out.println("Enter the number 1 ");
        num_1 = n.nextInt();
        System.out.println("Enter The number 2 ");
        num_2=n.nextInt();
        sum=num_1+num_2;
        System.out.println("The Sum Is "+sum);       
    }
}