import java.util.ArrayList;

// Применил абстрактный класс по аналогии с файлом abstractAnimal
abstract class abstractCloset {
    String door = "closed";
    ArrayList things = new ArrayList();

    void openDoor() {
        // if (this.door == "closed") {
        // this.door = "open";
        // System.out.println("Door opened!");
        // } else {
        //     System.out.println("Door already opened!");
        // }
    }

    void closeDoor() {
        // if (this.door == "open") {
        // this.door = "closed";
        // System.out.println("Door closed!");
        // } else {
        //     System.out.println("Door already closed!");
        // }
    }

    void showThings() {
        // if (this.door == "closed") {
        //     System.out.println("Can't see a thing! Open The door before!");
        // } else {
        // System.out.println("In this closet are: " + this.things);
        // }
    }

    void putThing(String arg) {
        // if (this.door == "closed") {
        //     System.out.println("Can't put a thing! Open the door before!");
        // } else {
        // this.things.add(arg);
        // System.out.println("Added to closet: " + arg);
        // }
    }

    void dropThing(String arg) {
        //     if (this.door == "closed") {
        //         System.out.println("Can't drop a thing! Open the door before!");
        //     } else {
        //     if (this.things.contains(arg)) {
        //     this.things.remove(arg);
        //     System.out.println("Dropped: " + arg);
        //     } else {
        //         System.out.println("Not found: " + arg);
        //     }
        // }
    }

    // Экземпляр класса bigCloset не создавался, пока не применил static:
    static class bigCloset extends abstractCloset {
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
        // Здесь была ошибка без static:
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
