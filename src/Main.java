
public class Main {
    public static void main(String[] args) {

        Phone iphone = new Iphone();
        iphone.addContact(1,"0759018007", "Viorel", "Fulgeanu");
        iphone.addContact(1,"0759018004", "Paty", "Fulgeanu");
        iphone.setColor("red");
        iphone.setModel("12");

        System.out.println("IMEI Iphone 12 " + iphone.getImei());

        System.out.println(iphone.getAllContacts());

        System.out.println(iphone.getBatteryLife());

        System.out.println(iphone.makeCall("0759018007"));
        System.out.println(iphone.makeCall("0759018004"));
        System.out.println(iphone.makeCall("0759018006"));
        System.out.println(iphone.makeCall("0759018001"));

        iphone.sendMessage("Salut", "0759018007");
        iphone.sendMessage("Ola" , "0759018007");
        iphone.sendMessage("Hello", "0759018004");

        System.out.println( iphone.getMessages());
        System.out.println(iphone.getBatteryLife());
        System.out.println(iphone.getCallHistory());

    }
}
