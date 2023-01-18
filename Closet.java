import java.util.ArrayList;

public class Closet {
    String door = "closed";
    ArrayList things = new ArrayList();

    void openDoor() {
        if (this.door == "closed") {
        this.door = "open";
        System.out.println("Door opened!");
        } else {
            System.out.println("Door already opened!");
        }
    }

    void closeDoor() {
        if (this.door == "open") {
        this.door = "closed";
        System.out.println("Door closed!");
        } else {
            System.out.println("Door already closed!");
        }
    }

    void showThings() {
        if (this.door == "closed") {
            System.out.println("Can't see a thing! Open The door before!");
        } else {
        System.out.println("In this closet are: " + this.things);
        }
    }

    void putThing(String arg) {
        if (this.door == "closed") {
            System.out.println("Can't put a thing! Open the door before!");
        } else {
        this.things.add(arg);
        System.out.println("Added to closet: " + arg);
        }
    }

    void dropThing(String arg) {
        if (this.door == "closed") {
            System.out.println("Can't drop a thing! Open the door before!");
        } else {
        if (this.things.contains(arg)) {
        this.things.remove(arg);
        System.out.println("Dropped: " + arg);
        } else {
            System.out.println("Not found: " + arg);
        }
    }
    }


    public static void main(String[] args) {
        Closet myCloset = new Closet();
        myCloset.openDoor();
        myCloset.openDoor();
        myCloset.putThing("scarf");
        myCloset.putThing("shirt");
        myCloset.showThings();
        myCloset.dropThing("scarf");
        myCloset.showThings();
        myCloset.dropThing("hoodie");
        myCloset.closeDoor();
    }
}
