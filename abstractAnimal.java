abstract class abstractAnimal {

    // Убрал значения полей из абстрактного класса для возможности их 
    // заполнения необходимыми значениями в дочерних классах

    int legs;
    boolean woolish;

    // Перенес реализации методов из абстрактного класса в дочерние классы

    void makeNoise() {
        // System.out.println("Animal make some sound!");
    }

    void eatFood() {
        // System.out.println("Animal eat its food!");
    }

    void playWithOwner() {
        // System.out.println("Animal playing with its owner!");
    }

    // Добавил методы для работы с полями класса:

    void getLegs() {
        System.out.println("legs: " + this.legs);
    }

    void setLegs(int legs) {
        this.legs = legs;
    }

    void isWoolish() {
        System.out.println("woolish: " + this.woolish);
    }

    void setWoolish(boolean woolish) {
        this.woolish = woolish;
    }
}


    // Всвязи с переносом реализации методов в дочерние классы убрал отметку 
    // @Override из дочерних классов

class Cat extends abstractAnimal {
    // Заполнение полей класса передал в соответствующие методы

    // int legs = 4;
    // boolean woolish = true;

    // @Override
    void makeNoise() {
        System.out.println("Meow!");
    }

    // @Override
    void eatFood() {
        System.out.println("Cat eats its food!");
    }

    // @Override
    void playWithOwner() {
        System.out.println("Cat playing with its owner!");
    }

class Fish extends abstractAnimal {
    // При отсутствии у животного лап или шерсти можно оставить 
    // соответствующие поля незаполненными

    // int legs = 0;
    // boolean woolish = false;
    


    // @Override
    void makeNoise() {
        System.out.println("Fish can't make noise :(");
    }

    // @Override
    void eatFood() {
        System.out.println("Fish eats its food!");
    }

    // @Override
    void playWithOwner() {
        System.out.println("Fish playing with its owner!");
    }
}


public static void main(String[] args) {
    Cat Mursik = new Cat();

    Mursik.setLegs(4);
    Mursik.getLegs();
    Mursik.setWoolish(true);
    Mursik.isWoolish();
    Mursik.makeNoise();
    Mursik.eatFood();
    Mursik.playWithOwner();
}
{
    Fish Nemo = new Fish();

    Nemo.makeNoise();
    Nemo.eatFood();
    Nemo.playWithOwner();
    Nemo.getLegs();
    Nemo.isWoolish();
    }
}