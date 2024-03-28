public class unique {
    
    public static void main(String[] args) {
        
        int arr[]= {0,0,1,1,2,2,3,3,4,4};

        int arr1[]=new int [20];

        int index=0;

        for(int i=0; i<arr.length; i++)
        {
            int flag =0;
 
            for(int j =0; j<i; j++)
            {
                if(arr[i] == arr[j])
                {
                 flag =1;
                  break;
                }
            }
                 if(flag==0)
                {
                  arr1[index]= arr[i];
                  index++;
                }  
        }
        
        for(int i=0 ;i<index; i++)
            System.out.println(arr1[i]+" ");
        
    }
}
