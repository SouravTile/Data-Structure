public class fibonacci 
{
    /*
    public static void main(String [] args)
    {
        int n1 = 0;
        int n2 = 1; 
        int n3;
        int count = 10;
        System.out.print(n1 + " " + n2); // Printing 0 and 1
        for (int i = 2; i < count; i++) 
        { // Loop starts from 2 because 0 and 1 are already printed
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
    */
    
    //using recursion
    static int num1=0,num2=1,num3=0;
    static public void fib(int count)
    {
            if(count>0)
            {
                num3=num1+num2;
                num1=num2;
                num2=num3;
                System.out.print(","+num3);
                fib(count-1);
            }
    }

    public static void main(String[] args) 
    {
        int count=10;
        System.out.print(num1+","+num2);
        fib(count-2);
    }

}
