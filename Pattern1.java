public class Pattern1 {
    public static void main(String []args)
    {
        //   1
        //  121
        // 12121

        int n=1;
        for(int i=0;i<3;i++)
        {
            for(int s=i;s<=2;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                if(j%2==0)
                    System.out.print("2");
                else
                    System.out.print("1");
            }
            n=n+2;
            System.out.println();
        }

/*
        //1 1
        // 2   
        //3 3
             for(int i=1;i<=3;i++) {
                 for(int j=1;j<=3;j++) {
                    if(i%2!=0 && j%2!=0)
                     System.out.print(i+" ");    
                     if(i%2==0 && j%2==0)
                         System.out.print(" "+i); 
                 }
                 System.out.println();

        }
        */
    }
}

