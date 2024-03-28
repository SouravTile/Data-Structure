import java.util.HashMap;
import java.util.Map;

public class SumEqualToGivenNum {
    public static void main(String[]args){
        int [] arr={2,4,3,5,7,8,9};
        int sum=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr[sum])
            {
                
                sum++;
            }
        }
        
        // int sum=7;
        // Map<Integer, Integer> map =new HashMap<>();
        // for(int i=0;i<arr.length;i++){
        //     int sum2=sum-arr[i];
        //     if(map.containsKey(sum2))
        //     {
        //         System.out.println("Pair found: "+ arr[i]+", "+sum2);
        //     }
        //     map.put(arr[i],i);
        // }
    }
}
