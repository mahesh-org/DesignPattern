public class Soy extends AddOnDecorator {
    Beverage bg;

    public Soy(Beverage bg) {
        this.bg = bg;
    }

    @Override
    public String getDesc() {
        return "In Soy..";
    }

    @Override
    public int cost() {
        return this.bg.cost() + 3;
    }
}
