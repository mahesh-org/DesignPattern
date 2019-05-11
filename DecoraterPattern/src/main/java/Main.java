/**
 * Refer screen shot in the resource folder
 *  Espresso extends Beverage
 *  Caramel and Soy extends AddOnDecorator and construction with Beverage initialization
 *
 *  Check out for Caramel, soy and all flyover option in the o/p
 */
public class Main {
    public static void main(String[] args) {
        Beverage caramelFlyover = new Caramel(new Espresso());
        System.out.printf("caramelFlyover cost:" + caramelFlyover.cost());

        Beverage soyFlyover = new Soy(new Espresso());
        System.out.printf("\nsoyFlyover cost:" + soyFlyover.cost());

        Beverage espressoAll = new Caramel(new Soy(new Espresso()));
        System.out.println("\nespressoAll flyover cost:" + espressoAll.cost());
    }
}
