package question1;

//Scanner used to allow for users input
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        
     //constructors for other classes
    Products p = new Products();
    //Prompt user to either go to main menu or exit
    p.StartMenu();
    
    Scanner sc = new Scanner (System.in);
    String LaunchMenu = sc.nextLine();
    
    //have users input result in menu being shown
    //Java Programming - Joyce Farrell
        while (LaunchMenu.equals("1")){    
        p.DisplayMenu(); 
        
    //allow user to choose between 6 options
        int select = sc.nextInt();
    
    //switch case used so that outcome occurs for all 6 options
    //Java Programming - Joyce Farrell
        switch (select){
            case 1:
                //run CaptureProduct() method and also prompt user to either use main menu or exit
                p.CaptureProduct();
                p.Choice();
                LaunchMenu = sc.next();
                break;
            case 2:
                //run SearchProduct() method and also prompt user to either use main menu or exit
                p.SearchProduct();
                p.Choice();
                LaunchMenu = sc.next();
                break;
            case 3:
                //run UpdateProduct() method and also prompt user to either use main menu or exit
                p.UpdateProduct();
                p.Choice();
                LaunchMenu = sc.next();
                break;
            case 4:
                //run DeleteProduct() method and also prompt user to either use main menu or exit
                p.DeleteProduct();
                p.Choice();
                LaunchMenu = sc.next();
                break;
            case 5:
                //run PrintReport() method and also prompt user to either use main menu or exit
                p.PrintReport();
                p.Choice();
                LaunchMenu = sc.next();
                break;
            case 6:
                //Allow user to exit application
                p.ExitApplication();
                LaunchMenu="exit";
                break;
            default:
                //If user enters wrong response, they are allowed to try again
                System.out.println("Invalid response. Try Again");

        }
    }
    }
      
}
