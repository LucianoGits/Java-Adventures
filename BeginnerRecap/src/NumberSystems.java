public class NumberSystems {
    //4 main types of number systems
    //Decimal which is base 10 (0-9), normal day-to-day numbers.
    //Binary which is base 2 (0,1), machine level number.
    //Octal which is base 8 (0-7), In Java, you can represent octal numbers by prefixing them with a leading zero.
    //Hexadecimal which is base 10 (0...9,A...F), Hexadecimal is often used in programming because it provides a concise way to represent binary values.Each digit in a hexadecimal number represents four bits (half a byte)

    //From Decimal Conversions
    public String decimalToOctal (int decimalNum){
        return Integer.toOctalString(decimalNum);
    }
    public String decimalToHex (int decimalNum){
        return Integer.toHexString(decimalNum).toUpperCase();
    }

    public String decimalToBinary (int decimalNum){
        return Integer.toBinaryString(decimalNum);
    }

    //From Octal Conversions
    public int octalToDecimal (String octalNum){
        return Integer.parseInt(octalNum,8);
    }
    public String octalToHexadecimal (String octalNum){
        int decimalNum = Integer.parseInt(octalNum,8);
        return decimalToHex(decimalNum);
    }
    public String octalToBinary (String octalNum){
        int decimalNum = Integer.parseInt(octalNum,8);
        return decimalToBinary(decimalNum);
    }

    //From hexadecimal conversion
    public int hexadecimalToDecimal (String hexNum){
        return Integer.parseInt(hexNum,16);
    }
    public String hexadecimalToOctal (String hexNum){
        int decimalNum = Integer.parseInt(hexNum,16);
        return decimalToOctal(decimalNum);
    }

    public String hexadecimalToBinary(String hexNum){
        int decimalNum = Integer.parseInt(hexNum,16);
        return decimalToBinary(decimalNum);
    }

    //From Binary Conversions
    public int binaryToDecimal(String binNum){
        return Integer.parseInt(binNum, 2);
    }

    public String binaryToOctal(String binNum){
        int decimalNum = Integer.parseInt(binNum, 2);

        return decimalToOctal(decimalNum);
    }

    public String binaryToHexadecimal(String binNum){
        int decimalNumber = Integer.parseInt(binNum, 2);

        return decimalToHex(decimalNumber);
    }



}
