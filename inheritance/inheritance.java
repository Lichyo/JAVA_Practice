package inheritance;

class Animal
{
    protected String name;
    public Animal (String name) 
    {
        this.name = name;
    }

    public void eat()
    {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal
{
    Dog(String name)
    {
        super(name);
    }

    public void bark()
    {
        System.out.println(name + "barking");
    }
}

public class inheritance
{
    public static void main(String [] args)
    {
        Animal animal = new Animal(" HAHA ");
        animal.eat();
        Dog dog = new Dog(" HEHE ");
        dog.bark();
    }
}