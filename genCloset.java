import java.util.ArrayList;

abstract class genCloset<T> {
    String door = "closed";
    ArrayList things = new ArrayList();

    void openDoor() {}

    void closeDoor() {}

    void showThings() {}

    void putThing(String arg) {}

    void dropThing(String arg) {}

    static class bigCloset<T> extends genCloset<T> {
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
    }


    public static void main(String[] args) {
        bigCloset myBigCloset = new bigCloset();

        myBigCloset.openDoor();
        myBigCloset.openDoor();
        myBigCloset.putThing("scarf");
        myBigCloset.putThing("shirt");
        myBigCloset.showThings();
        myBigCloset.dropThing("scarf");
        myBigCloset.showThings();
        myBigCloset.dropThing("hoodie");
        myBigCloset.closeDoor();
        }
}