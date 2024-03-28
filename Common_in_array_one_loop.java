public class Common_in_array_one_loop {
    public static void main(String [] args){

        int[] arr1 = {2,3,5,8,9,7};
        int[] arr2 = {2,5,9,6,7};
        findcommon(arr1, arr2);
    }
    public static void findcommon(int [] arr1,int arr2[]){
        int i=0, j=0;
        while(i != arr1.length && j != arr2.length)
        {
            if(arr1[i] == arr2[j])
            {
                System.out.print(arr1[i]+ " ");
                i++;
                j++;
            }else{
                if(arr1[i]>arr2[j])
                    j++;
                else
                    i++;
            }

        }

    }
    
} 
