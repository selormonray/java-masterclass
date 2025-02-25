public class Main {
    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone("1234567890");

        Contact bob = Contact.createContact("Bob", "31415926");
        Contact alice = Contact.createContact("Alice", "16180339");
        Contact tom = Contact.createContact("Tom", "11235813");
        Contact jane = Contact.createContact("Jane", "23571113");

        myPhone.addNewContact(bob);
        myPhone.addNewContact(alice);
        myPhone.addNewContact(tom);
        myPhone.addNewContact(jane);

        myPhone.printContacts();

        Contact newAlice = Contact.createContact("Alice", "98765432");
        myPhone.updateContact(alice, newAlice);

        myPhone.printContacts();

        myPhone.removeContact(tom);

        myPhone.printContacts();

        Contact queried = myPhone.queryContact("Jane");
        if (queried != null) {
            System.out.println("Found contact: " + queried.getName() + " -> " + queried.getPhoneNumber());
        } else {
            System.out.println("Contact not found.");
        }
    }
}