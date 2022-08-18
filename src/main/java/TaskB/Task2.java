package TaskB;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
public class Task2 {
    public static final Logger LOGGER = LogManager.getLogger(Task2.class);
    public static void main(String[] args) {

        Set<Animal> set = new HashSet<Animal>();
        Animal animal1 = new Animal(4, "Khomko", "Ternopil");
        Animal animal2 = new Animal(1, "Lemon", "Lviv");
        Animal animal3 = new Animal(5, "Kesha", "Kozova");
        Animal animal4 = new Animal(2, "Aza", "Derevach");
        Animal animal5 = new Animal(7, "Leo", "Lviv");
        Animal animal = new Animal(4, "Avrora", "Avdiivka");
        set.add(animal1);
        set.add(animal2);
        set.add(animal3);
        set.add(animal4);
        set.add(animal5);
        set.add(animal);
        LOGGER.info("\nSet before sorting - " + set);

        List<Animal> listAnimal = new ArrayList<>(set);
        Collections.sort(listAnimal);

        LOGGER.info("\nSet after sorting - " + listAnimal);
        Set<Animal> animalTreeSet = new TreeSet<>();
        animalTreeSet.add(animal);
        animalTreeSet.add(animal1);
        animalTreeSet.add(animal2);
        animalTreeSet.add(animal3);
        animalTreeSet.add(animal4);
        animalTreeSet.add(animal5);
        LOGGER.info("Tree set before sorting - "  + animalTreeSet);
        List<Animal> animalsTreeList = new ArrayList<>(animalTreeSet);
        Collections.sort(animalsTreeList);
        LOGGER.info("Tree set after sorting - " + animalsTreeList);
    }
}
