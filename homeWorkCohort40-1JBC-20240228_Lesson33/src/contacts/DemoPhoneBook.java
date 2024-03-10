package contacts;

public class DemoPhoneBook {

    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();

        Contact contact1 = new Contact("Aleksandr", "+49 1721 72 17 21");
        Contact contact2 = new Contact("Aleksej", "+49 1231 23 12 31");
        Contact contact3 = new Contact("Jevgenij", "+49 3573 57 35 73");
        Contact contact4 = new Contact("Jekaterina", "+49 2582 58 25 85");
        Contact contact5 = new Contact("Olga", "+49 1233 57 78 96");
        Contact contact6 = new Contact("Alina", "+49 6544 56 32 12");

        contactManager.addContact(contact1);
        contactManager.addContact(contact2);
        contactManager.addContact(contact3);
        contactManager.addContact(contact4);
        contactManager.addContact(contact5);
        contactManager.addContact(contact6);

        contactManager.printContacts();
        System.out.println("-".repeat(55));

        Contact contact7 = new Contact("Marina", "+49 3693 69 36 93");
        contactManager.addContact(contact7);

        contactManager.printContacts();
        System.out.println("-".repeat(55));

        contactManager.removeContact(contact3);
        contactManager.printContacts();
        System.out.println("-".repeat(55));

        System.out.println(contactManager.getContactByName("Aleksandr"));
        System.out.println("-".repeat(55));

        System.out.println(contactManager.getContactByPhoneNumber("+49 1233 57 78 96"));
        System.out.println("-".repeat(55));

        contactManager.addContact(contact3);
        contactManager.printContacts();
        System.out.println("-".repeat(55));

        contactManager.addContact(contact3);
        System.out.println("=".repeat(55));
    }
}
