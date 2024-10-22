package catFamily;

public class CatFamily {
    protected int legs;
    protected int eyes;
    protected boolean canEatPerson;

    public CatFamily(int legs, int eyes, boolean canEatPerson){
        this.legs = legs;
        this.eyes = eyes;
        this.canEatPerson = canEatPerson;
    }

    public void eat() {
        System.out.print("Кушаю ");
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setCanEatPerson(boolean canEatPerson) {
        this.canEatPerson = canEatPerson;
    }
}
