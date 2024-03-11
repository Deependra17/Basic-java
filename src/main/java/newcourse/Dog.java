package newcourse;

public class Dog extends Animal {
    @Override
    public void makeSound(String name, String sound) {
        super.animalName= name;
        super.sound =sound;
        System.out.println("Dog Name: " + name);
        System.out.println("Dog sound " + sound);
    }
}
