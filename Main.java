import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car Car1 = new Car();
        Car Car2 = new Car("My Honda", "Accord 2019");
        Car FutureCar = new Car("BMW","M4 Competition Sport");
        Car Car3 = new Car(Car2);


        //printMe information
        Car1.printMe();
        Car2.printMe();
        Car3.printMe();
        FutureCar.printMe();

    }

}



/*
    Car want = new Car();
    Car luxury = new Car();
    Car dreamCar = new Car();
 */