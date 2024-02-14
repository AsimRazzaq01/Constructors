public class Car {

    private String carMake ;
    private String carModel ;

    //Default Constructor
    public Car(){
        this.carMake = "Honda" ;
        this.carModel = "Accord" ;
    }

    //Parametric Constructor
    public Car(String carMake, String carModel){
        this.carMake = carMake ;
        this.carModel = carModel ;
    }

    // Copy Constructor
    public Car(Car C){
        this.carMake = C.carMake ;
        this.carModel = C.carModel ;
    }

    public void setCarMake(String _carMake){
        this.carMake = _carMake ;
    }

    public String getCarMake(){
        return this.carMake;
    }

    //printMe Method
    public void printMe() {
        System.out.println("Car Info: ");
        System.out.println("Brand: " + carMake);
        System.out.println("Model: " + carModel);
        System.out.println();
    }

}
