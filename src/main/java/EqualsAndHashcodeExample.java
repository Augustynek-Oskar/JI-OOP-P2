public class EqualsAndHashcodeExample {
    public static void main(String[] args) {
        Person person1 = new Person("Adam", "Nowak", 33);
        Person person2 = new Person("Adam", "Nowak", 33);
        Person person3 = person1;

        System.out.println(person1.equals(person2));

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());


    }
}
//1531448569