package spiralNotes.codes;

abstract class Animal {
    public abstract  void animalSound();

    public void sleep() {
        System.out.println("Zzzz");
    }

}

class Pig extends Animal
{
    @Override
    public void animalSound() {

    }

    @Override
    public void sleep() {
        super.sleep();
    }
}

class MainMethod
{
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}
