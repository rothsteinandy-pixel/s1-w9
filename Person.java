public class Person {
    private double height;
    public  Person(double h){
    height = h;
    }

    public boolean equals(Person other){
        return this.height == other.height;

    }
}
