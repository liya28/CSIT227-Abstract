abstract class Animal
{
    private String name;
    
    public Animal(String name)
    {
        this.name = name;
    }
    
    public abstract void makeSound();
    
    String getName()
    {
        return name;
    }
}

class Dog extends Animal
{
    public Dog(String name)
    {
        super(name);
    }
    
    public void makeSound()
    {
        System.out.println("Woof! My name is " + getName());
    }
}
