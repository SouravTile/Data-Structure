import java.util.Arrays;

public class findAndShift {
    public static void main(String [] args)
    {
        char arr[]={'a','0','d','0','d','f','s','a','0','v','0','c'};
        // arr[a,d,d,f,s,a,v,c,0,0,0,0]
        int num=0;
        for(int i=0;i<arr.length;i++)  
        {
            if(arr[i]!='0') // all char first la ghetle
            {
                arr[num]=arr[i]; 
                num++; //sagle char aale ki tya index pasun pudhe sagle 0 karnya sadhi
            }
        }

        while (num <arr.length) //saglya char zalya nanter pudhe 0 put karel array cha last paryanta
        {
            arr[num]='0';
            num++;
        }
        String s=Arrays.toString(arr); //string madhe convert kela  
        System.out.println(s); 

    }
     
}
