package collections;

public class Person{
    private String FirstName, LastName;
    private int age;
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    /*public int compareTo(Object anotherPerson) throws ClassCastException {if (!(anotherPerson instanceof Person))
        throw new ClassCastException("A person object expected");
        int anotherPersonAge;
        anotherPersonAge = Person(anotherPerson).getAge();
        return this.age - anotherPersonAge;*/
    }
