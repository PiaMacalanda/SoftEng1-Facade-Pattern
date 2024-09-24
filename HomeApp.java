public class HomeApp {

    public static void main(String[] args){

        HomeService light = new Light();
        HomeService tv = new Tv();
        HomeService airConditioning = new AirConditioning();

        HomeInterface homeInterface = new HomeInterface(light, tv, airConditioning);

        System.out.println("--Executes turnOnAll() HomeApp");
        homeInterface.turnOnAll();

        System.out.println("\n--Executes turnOffAll() HomeApp");
        homeInterface.turnOffAll();
    }
}
