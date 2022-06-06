public class ContactsManager {
    // Fields:
    Contact [] myFriends;
    int friendsCount;

    // Constructor:
    ContactsManager(){
        friendsCount = 0;
        myFriends = new Contact[500];
    }

    // Methods:
    void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    Contact searchContact(String searchName){
        for(int i=0; i<friendsCount; i++){
            if(myFriends[i].name.equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }

    public static void main(String [] args){
        // Create the ContactsManager object
        ContactsManager myContactsManager = new ContactsManager();
        // Create a new Contact object for James
        Contact friendJames = new Contact();
        // Set the fields
        friendJames.name = "James";
        friendJames.phoneNumber = "0012223333";
        // Add James Contact to the ContactsManager
        myContactsManager.addContact(friendJames);
        // Create a new Contact object for Cezanne
        Contact friendCezanne = new Contact();
        // Set the fields
        friendCezanne.name = "Cezanne";
        friendCezanne.phoneNumber = "987654321";
        // Add Cezanne Contact to the ContactsManager
        myContactsManager.addContact(friendCezanne);
        // Create a new Contact object for Jessica
        Contact friendJessica = new Contact();
        // Set the fields
        friendJessica.name = "Jessica";
        friendJessica.phoneNumber = "5554440001";
        // Add Jessica Contact to the ContactsManager
        myContactsManager.addContact(friendJessica);

        // Now let's try to search of a contact and display their phone number
        Contact result = myContactsManager.searchContact("Jessica");
        System.out.println(result.phoneNumber);
        Contact result2 = myContactsManager.searchContact("Cezanne");
        System.out.println(result2.phoneNumber);
    }
}