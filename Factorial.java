import java.util.Scanner;

public class Factorial {
    //Factorial recursion
     static int rec(int n){
        if(n==1)
        {
            return 1;
        }
        else
        {
            return (n*rec(n-1));
        }
       // return n;
     }
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int b=rec(num);
        System.out.println(b);
        sc.close();
    }
}
