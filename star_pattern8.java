public class star_pattern8 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*\t");
            }
            for(int k=5;k>=i;k--)
            {
                System.out.print("*\t");
            }
            System.out.println("");
        }
    }
    
}
