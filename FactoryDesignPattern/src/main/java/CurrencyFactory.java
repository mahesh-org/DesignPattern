// Factroy Class code


/*
one of the core design pattern which is used heavily not only in JDK but also in various Open Source framework such as Spring, Struts and Apache along with decorator design pattern in Java.

Good example ":
1) JDBC , application no need to know what database it wil be used.
2) In java, enables the subclasses to provide extended version of an object (Ex: Currency Factory)

When to use Factory design pattern in Java

1) Static Factory methods are common in frameworks where library code needs to create objects of types which may be sub classed by applications using the framework.
2) Some or all concrete products can be created in multiple ways, or we want to leave open the option that in the future there may be new ways to create the concrete product.
3) Factory method is used when Products don't need to know how they are created.
4) We  can use factory pattern where we have to create an object of any one of sub-classes depending on the data provided


Advantages:
- Its loose coupling
- Easy to debug
- consistency in Code since every time object is created using Factory rather than using different constructor at different client side.

Summary:
try to use Factory pattern whenever you see an opportunity to encapsulate object creation code and see chance of creating different object in near future.

 */
class CurrencyFactory {

    public static Currency createCurrency (String country) {
        if (country. equalsIgnoreCase ("India")){
            return new Rupee();
        }else if(country. equalsIgnoreCase ("Europe")){
            return new Euro();
        }else if(country. equalsIgnoreCase ("US")){
            return new USDollar();
        }
        throw new IllegalArgumentException("No such currency");
    }
}

