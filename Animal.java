public abstract class Animal 
{
    protected String move, sound, gender, name;

    //Constructor
    protected Animal(String move, String sound, String gender, String name)
    {
        this.move = move;
        this.sound = sound;
        this.gender = gender;
        this.name = name;
    }

    //Setting up methods to initialise as hooks for the derived classes to override
    protected String startDescription()
    {
        String output = String.format("This method is not yet overidden.");
        return output;
    }

    protected String endDescription()
    {
        String output = String.format("This method is not yet overidden.");
        return output;
    }

    //Master method to output animal description
    protected String getDescription()
    {
        String description = String.format(startDescription() + "\nThis animal gets around by: %s \nAnimal sound: %s \nIts gender is: %s \nThe animal is: %s" + endDescription(), move, sound, gender, name);
        return description;
    }

    public String getMove()
    {
        return move;
    }

    public String getSound()
    {
        return sound;
    }

    public String getGender()
    {
        return gender;
    }

    public String getName()
    {
        return name;
    }

    //Setting up the abstract class to force derived classes to use it
    public abstract AnimalType getAnimalType();

}
    

