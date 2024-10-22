import box.Box;
import box.WeightBox;
import catFamily.Cat;
import catFamily.Lion;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Lion lion = new Lion();

        cat.eat();
        lion.eat();

        Box box = new Box(15);
        WeightBox weightBox = new WeightBox(10,7);

        box.Show();
        System.out.println();
        weightBox.Show();
    }
}