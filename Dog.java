public class Dog extends Animal
{ 

    //Get enumerated animal type 
    public AnimalType animalType = AnimalType.DOG;

    //Constructor
    protected Dog(String move, String sound, String gender, String name) 
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
        String output = String.format("I'm very cute\n");
        return output;
    }

    //Getting the abstract method to get the animal type
    public AnimalType getAnimalType()
    {
        return animalType;
    }
}
