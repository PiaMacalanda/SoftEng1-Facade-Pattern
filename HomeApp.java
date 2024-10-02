public class HomeApp {

    public static void main(String[] args){

        HomeFacade homeFacade = new HomeFacade();

        homeFacade.turnOnAll();

        System.out.println();
        
        homeFacade.turnOffAll();
    }
}
