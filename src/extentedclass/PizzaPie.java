package extentedclass;

public class PizzaPie {

    String Dough ;
    String Cheese ;
    String Toppings;
    String Sauce ;
    String Shape;
    char Size ;
    double Price ;
    String Type ;
    String Customized ;

    public PizzaPie(){}

    public PizzaPie(String MyDough, String  MyCheese, String MyToppings ) {

        this.Dough = MyDough;
        this.Cheese = MyCheese;







    }

    public void bake() {
        System.out.println("bake");
    }

    public void getConsumed() {
        System.out.println("eat");
    }

    public void sliced() {
        System.out.println("Pizza slice");
    }


}
