public class Pig extends Animal
{

    public AnimalType animalType = AnimalType.PIG;

    protected Pig(String move, String sound, String gender, String name) 
    {
        super(move, sound, gender, name);
    }

    //@Override just specifies to the compiler 
    @Override
    protected void startDescription()
    {
        String output = String.format("Am piggo!");
        System.out.println(output);
    }

    @Override
    protected void endDescription()
    {
        String output = String.format("I'm rather fat\n");
        System.out.println(output);
    }
}
