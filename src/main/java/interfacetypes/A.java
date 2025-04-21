package interfacetypes;

@FunctionalInterface
public interface A {
    int add(int i, int j );

    public static void main(String[] args) {
        //lambda function
//        A obj = i ->  System.out.printf("in show: " +i); // if there is only one variable
        A obj = (i,j) -> i+j; //if there are multiple variables
        int result = obj.add(5,6);
        System.out.println(result);
    }
}
