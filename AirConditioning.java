public class AirConditioning implements HomeService{

    @Override
    public void turnOn(){

        System.out.println("Aircondition is on...");
    }

    @Override
    public void turnOff(){
        
        System.out.println("Aircondition is off");
    }
}
