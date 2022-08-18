package TaskC;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TaskC {
    public static final Logger LOGGER = LogManager.getLogger(TaskC.class);

    public static void main(String[] args) {
        Person rostyk = new Person(14,"Rostyk");
        Person sasha = new Person(19,"Sasha");
        Person maks = new Person(35, "Maks");
        Person nastia = new Person(23, "Nastia");

        rostyk.accountsList.add(new Account("TelegramId", "Facebook"));
        sasha.accountsList.add(new Account("YoutubeId", "Youtube"));
        sasha.accountsList.add(new Account("FacebookId", "Facebook"));
        sasha.accountsList.add(new Account("ViberId", "Viber"));
        maks.accountsList.add(new Account("TelegramId", "Telegram"));
        maks.accountsList.add(new Account("GoogleId", "Google"));
        nastia.accountsList.add(new Account("ViberId", "Viber"));
        nastia.accountsList.add(new Account("TelegramId", "Telegram"));
        nastia.accountsList.add(new Account("FacebookId", "Facebook"));
        nastia.accountsList.add(new Account("GoogleId", "Google"));

        Map<Person, ArrayList<Account>> personAccountsMap = new HashMap<>();
        personAccountsMap.put(rostyk, rostyk.accountsList);
        personAccountsMap.put(sasha, sasha.accountsList);
        personAccountsMap.put(maks, maks.accountsList);

        Services services = new Services();


        services.addAccountToTheList(personAccountsMap, sasha, new Account("TelegramId", "Telegram"));
        LOGGER.info("\nAdded account 'telegram' for sasha: " + personAccountsMap);

        services.deleteAccountForPerson(personAccountsMap, nastia, "Telegram");
        LOGGER.info("\nDeleted Telegram for nastia from personAccountsMap: " + personAccountsMap);

        services.deletePerson(personAccountsMap, maks);
        LOGGER.info("\nDeleted Person 'maks' from personAccountsMap: " + personAccountsMap);

        LOGGER.info("\nShow all Map with Persons and their Accounts: ");
        services.showAllMap(personAccountsMap);

        LOGGER.info("\nAll  available accounts by person rostyk: ");
        services.showAllAccountsForPerson(personAccountsMap, rostyk);
    }
}