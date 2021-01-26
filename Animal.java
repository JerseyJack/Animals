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

    protected void startDescription()
    {
        String output = String.format("This method is not yet overidden.");
        System.out.println(output);
    }

    protected void endDescription()
    {

    }

    protected void getDescription()
    {
        startDescription();
        String description = String.format("This animal gets around by: {0} /nAnimal sound: {1} /nIts gender is: {2} /nThe animal is: {3}", move, sound, gender, name);
        System.out.println(description);
        endDescription();
    }


}
    

