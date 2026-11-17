//Oleksandra Chebotar
//17.11.26
//Lab 8
public class TestPerson
{
    public static void main(String[] args)
    {
        Person[] people = new Person[2];

        people[0] = new Employee("Alice", 55000.0);
        people[1] = new Student("Bob", "Computer Science");

        for (Person person : people)
        {
            System.out.println(person.getName() + " - " + person.getDescription());
        }
    }
}
