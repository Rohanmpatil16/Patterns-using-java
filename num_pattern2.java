public class num_pattern2 {
    public static void main(String[] args) {
        int i, j;
        int a=0,b=1,c;
        System.out.println("Fibonacci Series Pattern:");
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                
                c=a+b;
                System.out.print( a+ "\t");
                a=b;
                b=c;
                
                
            }
            System.out.println("");
        }
    }
}                
                
