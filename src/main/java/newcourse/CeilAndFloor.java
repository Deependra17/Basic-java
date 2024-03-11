package newcourse;

public class CeilAndFloor {
    float num1 = 16.0f;
    float num2 = 10.5f;
    public void ceil() {
        System.out.println("Ceiling number is: "+Math.ceil(num1));
        System.out.println("Ceiling number is: "+Math.ceil(num2));
        float result = Math.max(num1,num2);
        System.out.println("Max num: "+result);
    }

    public void floor(){
        System.out.println("Flooring number is: "+Math.floor(num1));
        System.out.println("Flooring number is: "+Math.floor(num2));
        float result2 = Math.min(num1, num2);
        System.out.println("Min num: "+result2);
        System.out.println("Power: "+Math.pow(num1,num2));
    }

    public static void main(String[] args) {
        CeilAndFloor obj = new CeilAndFloor();
        obj.ceil();
        obj.floor();
        System.out.println("Square root of num1 is: "+Math.sqrt(obj.num1));
       int nums = (int) obj.num1;
        System.out.println(nums);
        String name = "Deepen";
        System.out.println(name.toUpperCase()); //case change
        System.out.println(name.toLowerCase());
       int num3 = 5;
       int value = Integer.parseInt(Integer.toString(num3));
        String stringValue = Integer.toString(value);
        System.out.println(stringValue);

    }
}
