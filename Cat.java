public class Cat extends Animal
{ 

    //Get enumerated animal type
    private AnimalType animalType = AnimalType.CAT;

    //Constructor
    protected Cat(String move, String sound, String gender, String name) 
    {
        super(move, sound, gender, name);
    }

    //@Override the hook methods to update for this animal type
    @Override
    protected String startDescription()
    {
        String output = String.format(String.valueOf("I am a " + getAnimalType()));
        return output;
    }    

    @Override
    protected String endDescription()
    {
        String output = String.format("I'm a bit sassy\n");
        return output;
    }

    //Getting the abstract method to get the animal type
    public AnimalType getAnimalType()
    {
        return animalType;
    }
}
