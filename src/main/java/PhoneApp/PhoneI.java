package PhoneApp;

import java.util.List;

public interface PhoneI {

    public String sendMessage(String message, String phoneNumber);
    public String makeCall(String phoneNumber);
    public void addContact(Integer id, String phoneNumber, String firstName, String lastName);
    public List<Contact>  getAllContacts();
}
