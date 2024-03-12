package newcourse;

public class Encapsulation { //Encapsulation
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Encapsulation h = new Encapsulation();
        h.setName("Deepen");
        h.setAge(26);

        System.out.println("Name: " + h.getName() + " " + "Age: " + h.getAge());

    }
}
