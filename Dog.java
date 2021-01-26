public class Dog extends Animal
{ 

    public AnimalType animalType = AnimalType.DOG;

    protected Dog(String move, String sound, String gender, String name) 
    {
        super(move, sound, gender, name);
    }

    @Override
    protected void startDescription()
    {
        String output = String.format("Am doggo!");
        System.out.println(output);
    }    
}
