public class Opattern {
    public static void main(String [] args)
    {
         int n=3;
         for(int i=0;i<n-1;i++)
         {
             for(int j=0;j<n;j++)
             {
              if((i==0 || i==n-2))
              {
                  if((j==0 || j==n-1))
                  {
                     System.out.print("*");
                  }
              }
              else
              {
                  if (j==0 || j==n-1)
                  {
                      System.out.print("*");
                  }
              }

             }
             System.out.println();
         }

        /*
            for(int i=0;i<=2;i++)
            {
                for(int j=0;j<=1;j++)
                {
                    if((i+j)%2==0)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
                for(int j=2;j<=3;j++)
                {
                    if((i+j)%2==0)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
            */
    }
}
