public abstract class Animal 
{
    protected String move, sound, gender, name;

    protected Animal(String move, String sound, String gender, String name)
    {
        this.move = move;
        this.sound = sound;
        this.gender = gender;
        this.name = name;
    }

    //Using 
    protected void startDescription()
    {
        String output = String.format("This method is not yet overidden.");
        System.out.println(output);
    }

    protected void endDescription()
    {

    }

    //Master method to output animal description
    protected void getDescription()
    {
        startDescription();
        String description = String.format("This animal gets around by: %s \nAnimal sound: %s \nIts gender is: %s \nThe animal is: %s", move, sound, gender, name);
        System.out.println(description);
        endDescription();
    }

}
    

