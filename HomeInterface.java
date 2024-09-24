public class HomeInterface {

    private HomeService light;
    private HomeService tv;
    private HomeService airConditioning;

    public HomeInterface(HomeService light, HomeService tv, HomeService airConditioning){
        
        this.light = light;
        this.tv = tv;
        this.airConditioning = airConditioning;
    }

    public void turnOnAll(){

        System.out.println(light.turnOn());
        System.out.println(tv.turnOn());
        System.out.println(airConditioning.turnOn());
    }

    public void turnOffAll() {

        System.out.println(light.turnOff());
        System.out.println(tv.turnOff());
        System.out.println(airConditioning.turnOff());
    }
}
