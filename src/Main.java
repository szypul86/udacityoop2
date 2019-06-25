
class Main {
    public static void main(String [] args){
        // Create the ContactsManager object
        ContactsManager myContactsManager = new ContactsManager();

        Contact zbychu = new Contact();
        zbychu.name = "Zbychu";
        zbychu.phoneNumber = "666666666";

        myContactsManager.addContact(zbychu);

        Contact eryk = new Contact();
        eryk.name = "Eryk";
        eryk.email="ad@dwf";

        myContactsManager.addContact(eryk);

        System.out.println(myContactsManager.searchContact("Zbychu").phoneNumber);
    }
}
