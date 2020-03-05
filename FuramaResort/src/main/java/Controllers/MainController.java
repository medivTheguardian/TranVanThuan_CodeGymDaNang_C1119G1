package Controllers;

import Views.Menu;

public class MainController {
    private Menu menu = new Menu();


    public void displayMainMenu() {
        int slectedOption = menu.mainMenu();
        switch (slectedOption) {
            case 1: {
                menuAddNewService();
                break;
            }
            case 2: {
                menuShowService();
                break;
            }
            case 3: {

                break;
            }
            case 4: {

                break;
            }
            case 5: {

                break;
            }
            case 6: {
              
                break;
            }
            case 7: {
                System.exit(0);
            }
            default:
                displayMainMenu();
    }
}
