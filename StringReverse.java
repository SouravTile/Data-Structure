public class StringReverse {
    // public static void main(String[] args) {
    //     String s="Sourav";
    //     String reverse="";
    //     for(int i=s.length()-1;i>=0;i--)
    //         reverse+=s.charAt(i);
    //     System.out.println(reverse);
    // }    
    public static void main(String[] args) {
        String s="sourav";
        StringBuilder sb= new StringBuilder(s);
        String rev=sb.reverse().toString();
        System.out.println(rev);
    }
}
