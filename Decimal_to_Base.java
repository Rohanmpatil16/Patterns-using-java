import java.util.*;
public class Decimal_to_Base {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        {
            System.out.println("enter the num=");
            int n=sc.nextInt();
            System.out.println("enter the base num=");

            int base=sc.nextInt();
            int r=getValueinBase(n, base);
                        System.out.println("Answer of base value is="+r);

           


        }
    }
    public static int getValueinBase(int n,int base)
    {
        int reverse_num=0;
        int power=1;

        while(n>0)
        {
            int dig=n%base;
            n=n/base;

            reverse_num+=dig*power;
            power=power*10;
         }
         return reverse_num;
    }
    
}
