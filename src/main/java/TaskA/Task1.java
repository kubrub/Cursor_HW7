package TaskA;

import com.sun.tools.javac.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Task1 {
    public static final Logger LOGGER = LogManager.getLogger(Task1.class);
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> lists = new ArrayList<>();
        LOGGER.info("Enter words until you enter the word - break");
        LOGGER.info("Enter word:");
        String name = in.nextLine();
        while (!Objects.equals(name, "break")){
            lists.add(name);
            LOGGER.info("Enter word:");
            name = in.nextLine();
        }

        LOGGER.info("\n~~~~~~Task 1~~~~~~");
        for(String list : lists){
            LOGGER.info(list);
        }

        LOGGER.info("\n~~~~~~Task 2~~~~~~");
        for (String element : lists){
            if (element.startsWith("s")){
                LOGGER.info(element);
            }
        }

        LOGGER.info("\n~~~~~~Task 3~~~~~~");
        for (String element : lists) {
            if(element.length()>5) {
                LOGGER.info(element);
            }
        }
    }
}
