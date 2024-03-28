import java.util.Scanner;
public class ArrayOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr=new int[5];
        for(int i=0;i<5;i++)
        {            
            System.out.println("Enter num "+i);
            arr[i]=sc.nextInt();
        }
        System.out.println("which number to find");
        int check=sc.nextInt();        
        int flag=1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==check){
                flag=0;
                System.out.println(check+" present at index "+i);
            }
        }
        if(flag==1)
        System.out.println("not there");  
    }
}