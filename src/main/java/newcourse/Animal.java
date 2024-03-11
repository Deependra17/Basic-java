package newcourse;

public class Animal {
    //Instance variables
    String animalName;
    String sound;

    public void makeSound(String name, String sound) {
        this.animalName = name;
        this.sound= sound;
//        String name; //Local variable
        System.out.println("Dog Name: " + this.animalName);
        System.out.println("Dog Sound: " + this.sound);
    }

}

