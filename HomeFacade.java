public class HomeFacade {

    private HomeService light;
    private HomeService tv;
    private HomeService airConditioning;

    public HomeFacade(){
        
        this.light = new Light();
        this.tv = new Tv();
        this.airConditioning = new AirConditioning();
    }

    public void turnOnAll(){

        light.turnOn();
        tv.turnOn();
        airConditioning.turnOn();
    }

    public void turnOffAll() {

        light.turnOff();
        tv.turnOff();
        airConditioning.turnOff();
    }
}
