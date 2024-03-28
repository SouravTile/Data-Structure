public class EvenCount { 
    public static void main(String[] args) {
        int n=50,count=0;
        double arr[]=new double[n];
        for(int i=0;i<arr.length;i++)
            arr[i]=i;

        for(int j=0;j<arr.length;j++)
        {    if(arr[j]%2==0)
                count++;
        }
        System.out.println(count);
    }
}
