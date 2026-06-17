package exersices.chapter_13;

interface NoiseMaker {
    String noise = "Making noise";

    String makeNoise(); // interface methods are public abstract by default

}

interface FoodEater {
    void eat(String food);
}

class Dog implements NoiseMaker, FoodEater {

    @Override
    public String makeNoise() {
        return "Waw";
    }

    @Override
    public void eat(String food) {
        IO.println("dogs appreciatively eat : " + food);
    }

}

public class Cats implements NoiseMaker, FoodEater {
    @Override
    public String makeNoise() {
        return "meow";
    }

    @Override
    public void eat(String food) {
        IO.println("meows appreciatively eat : " + food);
    }

    public static void main(String[] args) {
        NoiseMaker cat = new Dog();
        IO.println(cat.makeNoise());
        IO.println(cat.makeNoise());
    }
}

