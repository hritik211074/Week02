package Day05_OOPS_Inheritance.Assisted_Problem;
// Here a animal class
class Animal {
    String name;
    int age;
    public void makeSound(){
        System.out.println("Animal is sounding");
    }
}
// Here a dog class which extend animal class
class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog is sounding");
    }
}
// Here a Cat class extends animal class
class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Cat is sounding");
    }
}
// Here a bird class extends anmal class
class Bird extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Bird is sounding");
    }
}

// It's a main class
public class InheritanceHierachical{
    public static void main(String[] args) {
        // Creating the object of animal class
        Animal animal=new Animal();

        // Creating the object of Dog
        Dog rock=new Dog();

        // Creating the object of Cat
        Cat iyana=new Cat();

        // Creating the object of Bird
        Bird sparrow=new Bird();

        // Calling the makesound function of animal
        animal.makeSound();

        // Calling the makesound function of Dog
        rock.makeSound();

        // Calling the makesound function of cat
        iyana.makeSound();

        // Calling the makesound function of Bird
        sparrow.makeSound();

        //
    }
}

