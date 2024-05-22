import java.util.Scanner;
public class OccurenceInString{
	public static int Occurence(String s, String s1) {
		int count = 0;
		int n = s.length();
		int m = s1.length();
		String s2 = s.toLowerCase();
        String s3 = s1.toLowerCase();
		for(int i = 0; i<=n-m; i++) { // last cha 3 value sadhi nhi chalvaycha mhanun ghetla 
			int j;
			for(j = 0; j<m; j++) { // 0 to 3 paryanta chalel
				if(s2.charAt(i+j) != s3.charAt(j)) //i pasun next 2 check karel and if found then last la j==3 asla pahi j then false yeil
					break; // if char not matched then break the loop 
			}
			if(j == m) { //j==3 and m==3 asel tr count increase karaycha 
				count++;
				j = 0;// next checking sadhi zero kela
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a String");
		String s=sc.next();
		System.out.println("what to find : ");
		String s1=sc.next();
		System.out.println(Occurence(s, s1));
	}
}
