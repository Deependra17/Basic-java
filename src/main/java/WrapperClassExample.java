public class WrapperClassExample {
    public static void main(String[] args) {
        int num = 5;
        char letter = 'A';
        //primitive to wrapper class
        Integer number = Integer.valueOf(num);
        Character letterObj = Character.valueOf(letter);

        //Using wrapper class method
        System.out.println("Integer value " + number);
        System.out.println("Character value " + letterObj);

        //convert wrapper object back to primitive
        int intPrimitive = number.intValue();
        char charPrimitive = letterObj.charValue();
        System.out.println("Primitive integer " + intPrimitive);
        System.out.println("Primitive character " + charPrimitive);

    }
}
