public class MainClass
{
    public static void main(String[] args) {
        
        PersonList arList = new PersonList(3);

        Person pilot1 = new Pilot("PilotName", "123qwe", "Hello");
        Person client = new Passenger("ClientName", "123qwe", 159);
        Person client2 = new Passenger("qwertz", "456qwe", 951);

        arList.add(pilot1);
        arList.add(client);
        arList.add(client2);
        arList.add(client);
        System.out.println(arList.printList());
        arList.remove(client);
        System.out.println(arList.printList());
        arList.clear();
        System.out.println(arList.printList());
    }
}
