abstract class Animal {
    int legs = 4;
    boolean woolish = true;

    void makeNoise() {
        System.out.println("Animal make some sound!");
    }

    void eatFood() {
        System.out.println("Animal eat its food!");
    }

    void playWithOwner() {
        System.out.println("Animal playing with its owner!");
    }
}

class Cat extends Animal {
    @Override
    void makeNoise() {
        System.out.println("Meow!");
    }

    @Override
    void eatFood() {
        System.out.println("Cat eats its food!");
    }

    @Override
    void playWithOwner() {
        System.out.println("Cat playing with its owner!");
    }

class Fish extends Animal {
    int legs = 0;
    boolean woolish = false;
    
    @Override
    void makeNoise() {
        System.out.println("Fish can't make noise :(");
    }

    @Override
    void eatFood() {
        System.out.println("Fish eats its food!");
    }

    @Override
    void playWithOwner() {
        System.out.println("Fish playing with its owner!");
    }
}


public static void main(String[] args) {
    Cat Mursik = new Cat();

    Mursik.makeNoise();
    Mursik.eatFood();
    Mursik.playWithOwner();
    System.out.println(Mursik.legs);
    System.out.println(Mursik.woolish);
}

{
    Fish Nemo = new Fish();

    Nemo.makeNoise();
    Nemo.eatFood();
    Nemo.playWithOwner();
    System.out.println(Nemo.legs);
    System.out.println(Nemo.woolish);
    }
}
