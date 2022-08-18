package TaskB;

public class Animal implements Comparable<Animal>{
    private int age;
    private String name;
    private String town;

    public Animal(int age, String name, String town) {
        this.age = age;
        this.name = name;
        this.town = town;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", town='" + town + '\'' +
                '}';
    }

    @Override
    public int compareTo(Animal animal) {
        return this.name.compareTo(animal.name);
    }
}