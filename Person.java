//Oleksandra Chebotar
//17.11.26
//Lab 8
public abstract class Person
{
    private String name;

    public Person(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public abstract String getDescription();
}
