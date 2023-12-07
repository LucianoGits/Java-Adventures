package TypeConverstions;

public class RunNumberSystems {

    public static void main(String [] args){
        System.out.println("Hello world!");
        NumberSystems numberSystems = new NumberSystems();
    

        System.out.println("-------------------Decimal conversions-----------------");
        System.out.println("Decimal to Octal: " + numberSystems.decimalToOctal(10));
        System.out.println("Decimal to Hexadecimal: " + numberSystems.decimalToHex(10));
        System.out.println("Decimal to Binary: " + numberSystems.decimalToBinary(10));

        System.out.println("-------------------Octal conversions-----------------");
        System.out.println("Octal to Decimal: " + numberSystems.octalToDecimal("3"));
        System.out.println("Octal to Hexadecimal: " + numberSystems.octalToHexadecimal("3"));
        System.out.println("Octal to Binary: " + numberSystems.octalToBinary("3"));

        System.out.println("-------------------Hexadecimal conversions-----------------");
        System.out.println("Hexadecimal to Decimal: " + numberSystems.hexadecimalToDecimal("A"));
        System.out.println("Hexadecimal to Octal: " + numberSystems.hexadecimalToOctal("A"));
        System.out.println("Hexadecimal to Binary: " + numberSystems.hexadecimalToBinary("A"));

        System.out.println("-------------------Binary conversions-----------------");
        System.out.println("Binary to Decimal: " + numberSystems.binaryToDecimal("10"));
        System.out.println("Binary to Hexadecimal: " + numberSystems.binaryToHexadecimal("10"));
        System.out.println("Binary to octal: " + numberSystems.binaryToOctal("10"));
    }
}
