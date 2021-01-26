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
        String output = String.format("Am doggo!");
        System.out.println(output);
    }    
}
