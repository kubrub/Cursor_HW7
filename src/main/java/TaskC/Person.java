package TaskC;

import java.util.ArrayList;

public class Person {
    private int age;
    private String name;
    ArrayList<Account> accountsList= new ArrayList<>();
    public Person(int age, String name) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", accountsList=" + accountsList +
                '}';
    }
}
