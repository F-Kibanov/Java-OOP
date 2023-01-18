public class Person {
    String mother;
    String father;
    String siblings;

    void showParents() {
        System.out.println("mother: " + this.mother + "; " + "father: " + this.father);
    }

    void showSiblings() {
        System.out.println(siblings);
    }


public static void main(String[] args) {
    Person Alex = new Person();
    Person Jane = new Person();
    Person John = new Person();
    Alex.mother = "Jane";
    Alex.father = "John";
    Jane.mother = "Natalie";
    Jane.father = "Quentin";
    John.mother = "Sylvia";
    John.father = "Fred";
    John.siblings = "Ornella, George";

    Alex.showParents();
    Jane.showParents();
    John.showSiblings();
    }
}

