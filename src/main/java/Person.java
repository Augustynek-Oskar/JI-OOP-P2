public class Person {
    String name;
    String surname;
    int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Person)){
            return false;
        }
        Person one = (Person) obj;

        return name.equals(one.name) && surname.equals(one.surname) && Integer.compare(age, one.age) == 0;
    }
    public native int hashCode();

}
