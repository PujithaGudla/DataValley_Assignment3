/* What is abstraction in java, how many ways can we implement abstraction, write proper java program and how to implement abstraction.*/
// Abstract class
abstract class Animal 
{
    abstract void makeSound();
}

// Interface
interface Shape
{
    void draw();
}

// Concrete class implementing abstract class
class Dog extends Animal 
{
    void makeSound() 
    {
        System.out.println("Dog barks");
    }
}

// Concrete class implementing interface
class Circle implements Shape 
{
    public void draw() 
    {
        System.out.println("Drawing a Circle");
    }
}

public class Abstraction
{
    public static void main(String[] args) 
    {
        // Using abstract class
        Animal dog = new Dog();
        dog.makeSound();

        // Using interface
        Shape circle = new Circle();
        circle.draw();
    }
}
