public class Pattern2 {
    public static void main(String [] args)
    {
//         A
//        BBB
//       CCCCC
      
        //using 3 forloop
        int n=1;
        char ch='A';
        int times=3;
        for(int i=0;i<times;i++)
        {
            for(int s=i;s<times;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print(ch);
            }
            ch++;
            n+=2;
            System.out.println();
        }
  
        /*
        //using 2 forloop
         char ch='A';
         for(int i=0;i<3;i++)
         {
             for(int s=i;s<2;s++)
             {
                 System.out.print(" ");
             }
             for(int j=0;j<=i;j++)
             {
                 System.out.print(ch);
             }
             for(int k=0;k<i;k++)
             {
                 if(i!=0)
                     System.out.print(ch);

             }
             ch++;
             System.out.println();            
         }*/
    }
}
