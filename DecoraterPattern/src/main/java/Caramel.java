public class Caramel extends AddOnDecorator {
    Beverage br;

    public Caramel(Beverage bg) {
        this.br = bg;
    }

    @Override
    public String getDesc() {
        return "In AddOnDecorator..";
    }

    @Override
    public int cost() {
        return this.br.cost() + 2;
    }

    public static class Main {
        public static void main(String[] args) {
            Beverage caramelFlavor = new Caramel(new Espresso());
            System.out.printf("Cost:" + caramelFlavor.cost());

            Beverage onlyEspresso = new Espresso();
            System.out.printf("");
        }
    }
}
