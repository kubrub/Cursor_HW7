package TaskC;

public class Account {
    String name, id;
    public Account(String id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
