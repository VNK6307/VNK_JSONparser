package maven.jsonparser;

public class Employee {
    public long id;
    public String firstName;
    public String lastName;
    public String country;
    public int age;

    public Employee() {
    }

    public Employee(long id, String firstName, String lastName, String country, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "id = " + id +
                ", firstName = " + firstName +
                ", lastName = " + lastName +
                ", country = " + country +
                ", age = " + age +
                "}" + "";
    }
}
