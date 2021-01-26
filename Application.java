public class Application
{
    public static void main(String[] args)
    {
        Dog dogger = new Dog("Run", "Bark", "Female", "Dog");
        dogger.getDescription();


        Pig pigger = new Pig("Waddle", "Oink", "Male", "Pig");
        pigger.getDescription(); 
    }
}