public class Cat extends Animal
{ 

    public AnimalType animalType = AnimalType.CAT;

    protected Cat(String move, String sound, String gender, String name) 
    {
        super(move, sound, gender, name);
    }

    @Override
    protected void startDescription()
    {
        String output = String.format("Am catto!");
        System.out.println(output);
    }    

    @Override
    protected void endDescription()
    {
        String output = String.format("I'm a bit sassy\n");
        System.out.println(output);
    }
}
