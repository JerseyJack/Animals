import java.util.ArrayList; //Import array stuff

public class Application
{
    public static void main(String[] args)
    {
        createAnimalList();

        createDerivedAnimals();
    }

    private static void createAnimalList()
    {
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Dog("Running", "Bark", "Female", "Dog"));
        animals.add(new Pig("Waddling", "Oink", "Male", "Pig"));
        animals.add(new Cat("Prancing", "Meow", "Male", "Cat"));

        printCastToAnimals(animals);
    }

    private static void printAnimals(ArrayList animals)
    {
        for(int i = 0; i < animals.size(); i++)
        {
            System.out.println(animals.get(i));
        }
    }

    private static void printCastToAnimals(ArrayList animals)
    {
        for(int i = 0; i < animals.size(); i++)
        {
            Animal animal = (Animal) animals.get(i);

            System.out.println("I am from the " + animal.getClass());
            System.out.println("Of the " + animal.getClass().getSuperclass());
            System.out.println("I " + animal.getSound());
            System.out.println("I get around by " + animal.getMove());
            System.out.println("I'm " + animal.getGender() + "\n");
        }
    }

    private static void createDerivedAnimals()
    {
        Dog dogger = new Dog("Running", "Bark", "Female", "Dog");
        System.out.println(dogger.getDescription());

        Pig pigger = new Pig("Waddling", "Oink", "Male", "Pig");
        System.out.println(pigger.getDescription());

        Cat catter = new Cat("Prancing", "Meow", "Male", "Cat");
        System.out.println(catter.getDescription());
    }
}