
class DataTypes {

    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        System.out.println("# Welcome to java basics #");
        System.out.println("---------------------------------------------");
        // ==========  Primitive data types ========== 
        System.out.println("=====  Primitive data types =====");

        // 1) Byte:
        // Size: 1 byte (8 bits)
        // Range: -128 to 2^7(128)
        // Default value: 0
        byte byteVal = 127;
        System.out.println("byteVal " + byteVal);

        // 2) short
        // Size: 2 bytes
        // Range: -32,768 to 32,767
        // Default: 0
        short shortVal = 32767;
        System.err.println("shortVal:" + shortVal);

        // 3) int
        // Size: 4 bytes
        // Range: -2^31 to 2^31-1
        // Default: 0
        int intVal = 2147483647;
        System.err.println("intVal:" + intVal);

        // 4) Float
        // Size: 4 bytes
        // Stores decimal values
        // Must end with f
        float floatVal = 213.8f;
        System.err.println("floatVal:" + floatVal);

        // 5) Double
        // Size: 8 bytes
        // Higher precision decimal numbers
        double doubleVal = 213.8f;
        System.err.println("doubleVal:" + doubleVal);

        // 6) Char
        // Size: 2 bytes
        // Stores single character
        char charVal = '@';
        System.err.println("charVal:" + charVal);

        // 7) Boolean
        // Size: JVM dependent
        // Values: true or false
        boolean booleanVal = true;
        System.err.println("booleanVal:" + booleanVal);
    }
}
