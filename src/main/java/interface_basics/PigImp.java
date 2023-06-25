package interface_basics;

interface Animal {
    public void AnimalSound();
    public void Sleep();
}
public class Pig implements Animal {
    public void AnimalSound() {
        System.out.println("The pig says: wee wee");
    }
    public void Sleep() {
        System.out.println("Zzz");
    }
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.AnimalSound();
        myPig.Sleep();
    }
}

