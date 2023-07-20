import java.util.Scanner;

public class FindFibonacci {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number=scanner.nextInt();
        System.out.println(fib(number));
    }
    public static int fib(int number)
    {
        if(number==0)
        {
            return 0;
        }
        if(number==1)
        {
            return 1;
        }
        return fib(number-1)+fib(number-2);
    }
}
