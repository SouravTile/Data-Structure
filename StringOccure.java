public class StringOccure {
    public static void main(String[] args) {
         String s ="akaashhh";
         int count=0;   
         int max = 0; 
        for(int i=0;i<s.length();i++)
        {
            count=0;
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    count++;
                }
            }
            if(count>max)
            {
                max=count;
            }
        }
        System.out.println(max);
    }   
    
    
}
