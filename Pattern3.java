public class Pattern3 {
    public static void main(String [] args)
    {
    /*
    //     1
    //    231
    //   45612
    
        int loop=3;
        int n=1;
        for(int i=1;i<=loop;i++)
        {
            for(int s=4;s>i;s--)
                System.out.print(" ");
            for(int j=0;j<i;j++){
                System.out.print(n);
                n++;
            }
            for(int k=1;k<i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
        */
        /*
            //      A
            //     ABA
            //    ABCBA
         */
        /*
        char c='A';
        int loop=3;
        for(int i=1;i<=loop;i++)
        {
            for(int s=4;s>i;s--)
            {
                System.out.print(" ");
            }
            char ch='A';
            for(int j=0;j<i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            for(int k=i-1;k>=1;k--)
            {
                System.out.print(c);
                c++;
            }
            
            System.out.println();
        }*/

/*      1
        21
        321
//----------------
            1
            21
            321
        */
       for(int i=1;i<=3;i++)
       {
           for(int s=3;s>i;s--)
            System.out.print(" ");
           for(int j=i;j>=1;j--)
           {
               System.out.print(j);
           }
           System.out.println();
       }

    }
}
