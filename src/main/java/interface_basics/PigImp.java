package interface_basics;

interface Animal {
    public void AnimalSound();
    public void Sleep();
}
class Pig implements Animal {
    public void AnimalSound() {
        System.out.println("The pig says: wee wee");
    }
    public void Sleep() {
        System.out.println("Zzz");
    }
}

class Dog implements Animal {
    public void AnimalSound() {
        System.out.println("The dog says: bow wow");
    }
    public void Sleep() {
        System.out.println("Zzz");
    }
}

public class PigImp {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.AnimalSound();
        myPig.Sleep();
        Dog myDog = new Dog();
        myDog.AnimalSound();
        myDog.Sleep();
    }
}
