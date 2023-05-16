import java.util.Scanner;
// checking prime number
public class Function {
static void prime(int n)
    {  int c=0;
        if(n==1)
        {
            System.out.println("Number is 1 neither prime nor composite ");
            return;
        }
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
             { c++;
             }
            // else{
            //     c=c;
            // }
        }

        if(c>2)
      {  System.out.println(" Number is not prime");
     }
      else 
        {
        System.out.println(" Number is prime");
    }}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter a number to check prime: ");
        int num=sc.nextInt();
        prime(num);
        //        System.out.println(prime(num));
        sc.close();
    }
    
}
