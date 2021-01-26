public class Application
{
    public static void main(String[] args)
    {
        Dog dogger = new Dog("Running", "Bark", "Female", "Dog");
        dogger.getDescription();


        Pig pigger = new Pig("Waddling", "Oink", "Male", "Pig");
        pigger.getDescription(); 

        Cat catter = new Cat("Prancing", "Meow", "Male", "Cat");
        catter.getDescription();
    }
}