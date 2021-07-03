package PhoneApp;

import java.util.*;

public class Phone implements PhoneI {

    public Phone() {
        this.imei = UUID.randomUUID();
        this.contact = new ArrayList<>();
        this.messages = new HashMap<>();
        this.callHistory = new ArrayList<>();
    }

    private String model;
    private String color;
    private Integer batteryLife;
    private List<Contact> contact;
    private Map<String, List<String>> messages;
    private List<String> callHistory;
    private UUID imei;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public UUID getImei() {
        return imei;
    }

    public Integer getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(Integer batteryLife) {
        this.batteryLife = batteryLife;
    }

    public List<Contact> getContact() {
        return contact;
    }

    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }

    public Map<String, List<String>> getMessages() {
        return messages;
    }

    public List<String> getCallHistory() {
        return callHistory;
    }

    @Override
    public String sendMessage(String message, String phoneNumber) {

        List<String> messageList = new ArrayList<>();

        if (messages.get(phoneNumber) != null) {
            messageList = messages.get(phoneNumber);
        }

        if (message.length() > 500){
            System.out.println("Mesajul a depasit 500 de caractere.");
        } else
        {
            messageList.add(message);
            if (batteryLife < 1){
                System.out.println("Telefonul nu are destula baterie");
            }
            else
            {
                this.setBatteryLife(--batteryLife);
            }
            messages.put(phoneNumber, messageList);
        }

       return message;
    }

    @Override
    public String makeCall(String phoneNumber) {
        if(batteryLife > 1){
            this.batteryLife = batteryLife -2;
            callHistory.add(phoneNumber);
            return "calling...".concat(phoneNumber);
        }

        return "Telefonul nu are destula baterie";

    }

    @Override
    public void addContact(Integer id, String phoneNumber, String firstName, String lastName) {
        this.contact.add(new Contact(1,firstName, lastName, phoneNumber));
    }

    @Override
    public List<Contact> getAllContacts() {
        return contact;
    }
}
