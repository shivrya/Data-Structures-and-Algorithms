package Data_Structures_Algorithms.Bit_Manipulation;

public class BinaryToDecimal {

    public static void main(String[] args) {
        int binary = 100;
        int decimal = BinaryToDecimal(binary);
        System.out.println(decimal);
    }

    public static int BinaryToDecimal(int binary){

        int decimal = 0;
        int power = 0;
        while(binary>0){
            int digit = binary % 10;
            decimal += digit * Math.pow(2, power);
            power++;
            binary = binary / 10;
        }
        return decimal;
    }

}
