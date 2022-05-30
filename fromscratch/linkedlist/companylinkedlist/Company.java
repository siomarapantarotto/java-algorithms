package fromscratch.linkedlist.companylinkedlist;

import java.util.Random;

/**
 * Implementation from scratch of a company linked list in Java.
 * Class Company
 * 
 * @author siomara.com.br
 * @since May, 2022
 */
public class Company {
    int id;
    String name;
    String ownerName;

    // Company constructor.
    Company(String companyName, String companyOwnerName) {
        this.id = generateRandomId();
        this.name = companyName;
        this.ownerName = companyOwnerName;
    }

    // Method to create a random value for company ID.
    static int generateRandomId() {
        Random random = new Random();
        return random.nextInt(1000000);
    }

    // Method to display company in a formatted way.
    @Override
    public String toString() {
        return "[" + id + ", " + name + ", " + ownerName + "]";
    }

}
