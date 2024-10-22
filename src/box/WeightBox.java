package box;

public class WeightBox extends Box {
    private double weight;

    public WeightBox(double size, double weight) {
        super(size);
        this.weight = weight;
    }

    public WeightBox(double height, double width, double length, double weight) {
        super(height, width, length);
        this.weight = weight;
    }

    @Override
    public void Show() {
        super.Show();
        System.out.print(" Вес: "+this.weight);
    }
}
