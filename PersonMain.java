public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person(72.0);
        Person p2 = new Person(72.0);
        boolean a = p1.equals(p2);
        System.out.println(a);
    }
}
