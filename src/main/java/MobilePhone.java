import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<Contact>();
    }

    private int findContact(String name) {
        int position = 0;
        for (Contact c : myContacts) {
            if (c.getName().equals(name))
                return position;
            position++;
        }
        return -1;
    }

    private int findContact(Contact contact) {
        return findContact(contact.getName());
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) >= 0)
            return false;
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (removeContact(oldContact)) {
            myContacts.add(newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) < 0)
            return false;
        myContacts.remove(findContact(contact));
        return true;
    }

    public Contact queryContact(String name) {
        try {
            return myContacts.get(findContact(name));
        }
        catch (Exception e) {
            return null;
        }
    }

    public void printContacts() {
        System.out.println("Contact List:");
        int i = 0;
        for (Contact c : myContacts) {
            i++;
            System.out.format("%d. %s -> %s%n",i,c.getName(),c.getPhoneNumber());
        }
    }
}
