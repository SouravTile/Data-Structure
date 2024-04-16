import java.util.Scanner;
public class ArrayBubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr=new int[5];
        for(int i=0;i<5;i++)
        {            
            System.out.println("Enter num ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length-1;j++)
            {    
                if(arr[i]>arr[j])
                {
                    int num=0; 
                    num=arr[i];
                    arr[i]=arr[j];
                    arr[j]=num;
                    
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {            
            System.out.println(arr[i]);
        }
    }
}
