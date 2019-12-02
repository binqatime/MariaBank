public class Person {
    private final String personName;
    private final String personLastName;
    private final int personAge;
    String personAddress;

    Person (String name, String lastName, int age) {
        this.personName = name;
        this.personLastName = lastName;
        this.personAge = age;
    }

    public String getPersonName() {
        return personName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public int getPersonAge() {
        return personAge;
    }


}
