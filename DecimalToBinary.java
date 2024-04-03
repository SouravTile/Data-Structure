public class DecimalToBinary {
    public static void main(String[] args) 
    {
        int decimal = 10; // replace with your decimal number
        String binary = "";

        while (decimal > 0) { 
            binary = (decimal % 2) + binary;
            System.out.println("number="+binary);
            decimal = decimal / 2;
        }
        System.out.println("The binary representation is: " + binary);
        
    }
}
