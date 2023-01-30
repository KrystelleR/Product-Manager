package question1;

//Scanner imported to allow user to input 
//ArrayList imported to hold product details
import java.util.Scanner;
import java.util.ArrayList;

public class Products {
    
    //Declaring variables
    //JavaTPoint.com
    private static int i = 0;
    protected static ArrayList <String> ProductCode = new ArrayList <String> ();
    protected static ArrayList <String> ProductName = new ArrayList <String> ();
    protected static ArrayList <String> ProductCategory = new ArrayList <String> ();
    protected static ArrayList <String> ProductWarranty = new ArrayList <String> ();
    protected static ArrayList <Integer> ProductPrice = new ArrayList <Integer> ();
    protected static ArrayList <Integer> ProductStockLevel = new ArrayList <Integer> ();
    protected static ArrayList <String> ProductSupplier = new ArrayList <String> ();
    
    //Start menu to prompt user to either go to main menu or exit
        public static void StartMenu(){
        System.out.print(
                    "BRIGHT FUTURE TECHNOLOGIES APPLICATION" +"\n" +
                    "***************************************" + "\n"+
                    "Enter (1) to launch menu or any other key to exit" + "\n"
        );   
    }
        //main menu for user to use
        public static void DisplayMenu(){
            System.out.print(
                    "Please select one of the following menu items:" +"\n"+
                    "(1) Capture a new product." + "\n" +
                    "(2) Search for a product." + "\n" +
                    "(3) Update a product. " + "\n" +
                    "(4) Delete a product. " + "\n" +
                    "(5) Print report. " + "\n" +
                    "(6) Exit application. " + "\n" 
            );   
        }
        //allow user to be able to go back to main menu or exit application
        public static void Choice(){
            System.out.print("Enter (1) to launch menu or any other key to exit. ");
        }
        
        //Capture mehtod that captures the product details 
        public static void CaptureProduct(){
            System.out.print(
                    "CAPTURE A NEW PRODUCT" + "\n" +
                    "*************************" + "\n"
            );
            Scanner sc = new Scanner (System.in);
            
            //prompt for product code
            System.out.print("Enter the product code: ");
            String Code = sc.nextLine();
            ProductCode.add(Code);
            
            //prompt for product name
            System.out.print("Enter the product name: ");
            String name = sc.nextLine();
            ProductName.add(name);
            
            //while statement used so that if user inputs invalid response they are still able to retry
           while (true){
               System.out.print(
                    "Select the product category: " + "\n" +
                    "Desktop computer - 1" + "\n" +
                    "Laptop - 2" + "\n" +  
                    "Tablet - 3" + "\n" +  
                    "Printer - 4" + "\n" + 
                    "Gaming Console - 5" + "\n" + "\n"      
            );
            //prompt for product category
            System.out.print("Product Category >> ");
            int Category = sc.nextInt();
            if (Category > 0 && Category <7){
                switch (Category){
                    case 1:
                        ProductCategory.add("Desktop Computer"); 
                        break;
                    case 2:
                        ProductCategory.add("Laptop"); 
                        break;
                    case 3:
                        ProductCategory.add("Tablet"); 
                        break;
                    case 4:
                        ProductCategory.add("Printer"); 
                        break;
                    case 5:
                        ProductCategory.add("Gaming Console"); 
                        break;      
                }
                break;
            }
            else{
                System.out.println("You have entered an invalid number. Try again. ");
            }
           }
           
           //prompt user for product warranty
            System.out.print("Indicate the product warranty. Enter (1) for 6 months or any other key for 2 years. ");
            String Warranty = sc.next();
            if (Warranty.equals("1")){
                ProductWarranty.add("6 months");
            }
            else{
                ProductWarranty.add("2 years");
            }
            
            //prompt user for product price
            System.out.print("Enter the price for " + ProductName.get(i) + " >> ");
            int Price = sc.nextInt();
            ProductPrice.add(Price);
            
            //prompt user for product stock level
            System.out.print("Enter the stock level for " + ProductName.get(i) + " >> ");
            int StockLevel = sc.nextInt();
            ProductStockLevel.add(StockLevel);
            
            //prompt user for product supplier
            System.out.print("Enter the supplier for " + ProductName.get(i) + " >> ");
            String Supplier = sc.next();
            ProductSupplier.add(Supplier);
            
            System.out.println("Product details has been saved successfully!!!");
            i++;
        } 
        
        //search method to see information for product code
        public static void SearchProduct(){
            Scanner sc = new Scanner (System.in);
            System.out.print("Please enter the product code to search: ");
            String tempCode = sc.next();
            
            //searching for if the entered code is an element of the array list
            int index = ProductCode.indexOf(tempCode);
            if(index >=0){
                System.out.print(
                        "**************************************************************" + "\n" +
                        "PRODUCT SEARCH RESULTS" + "\n" +  
                        "**************************************************************" + "\n" +
                        "PRODUCT CODE:            " + ProductCode.get(index) + "\n" +
                        "PRODUCT NAME:            " + ProductName.get(index) + "\n" + 
                        "PRODUCT WARRANTY:        " + ProductWarranty.get(index) + "\n" +    
                        "PRODUCT CATEGORY:        " + ProductCategory.get(index) +  "\n" +     
                        "PRODUCT PRICE:           R " + ProductPrice.get(index) + "\n" +    
                        "PRODUCT STOCK LEVELS:    " + ProductStockLevel.get(index) + "\n" +      
                        "PRODUCT SUPPLIER:        " + ProductSupplier.get(index) + "\n" +
                        "**************************************************************" + "\n"      
                );
            }
            else{
                System.out.println("The product cannot be located. Invalid Product");
            }
        }
        //update method to allow user to change answers for product details
        //StackOverflow
        public static void UpdateProduct(){
            //while used so that if user enters invalid response, they are able to retry
            while(true){
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter the product code to update: ");
            String tempCode = sc.next();
            //searchign if inputed code is an element of the arraylist
            int index = ProductCode.indexOf(tempCode);
            if(index >=0){
                
                //while used so that if user enters invalid response, they are able to retry
                while (true){
                System.out.println("Update the warranty? (y) Yes, (n) No ");
                String changeWarranty = sc.next();
                if(changeWarranty.equals("y")){
                    //to update remove current element and add new element
                    ProductWarranty.remove(index);
                    System.out.print("Enter (1) for 6 months or any other key for 2 years to update the warranty for " + tempCode+" >> ");
                    String newWarranty = sc.next();
                    if (newWarranty.equals("1")){
                        ProductWarranty.add(index,"6 months ");
                        break;
                    }
                    else{
                        ProductWarranty.add(index,"2 years ");
                        break;
                    }
                }
                else if(changeWarranty.equals("n")){
                    break;
                }
                else{
                    System.out.println("Invalid response. Try again.");
                }
            }   
            //while used so that if user enters invalid response, they are able to retry
             while(true){
                 System.out.print("Update the product price? (y) Yes, (n) No ");
                 String changePrice = sc.next();
                 if(changePrice.equals("y")){
                     //to update remove current element and add new element
                     ProductPrice.remove(index);
                     System.out.println("Enter the new price for " + tempCode +" >> ");
                     int newPrice = sc.nextInt();
                     ProductPrice.add(index, newPrice);
                     break;
                 }
                 else if(changePrice.equals("n")){
                    break; 
                 }
                 else{
                     System.out.println("Invalid response. Try again.");
                 }
             }   
             //while used so that if user enters invalid response, they are able to retry
             while(true){
                 System.out.print("Update the stock level? (y) Yes, (n) No  ");
                 String changeStockLevel = sc.next();
                 if(changeStockLevel.equals("y")){
                     //to update remove current element and add new element
                     ProductStockLevel.remove(index);
                     System.out.println("Enter the new stock level for " + tempCode +" >> ");
                     int newStockLevel = sc.nextInt();
                     ProductStockLevel.add(index, newStockLevel);
                     break;
                 }
                 else if (changeStockLevel.equals("n")){
                     break;
                 }
                 else{
                   System.out.println("Invalid response. Try again.");  
                 }
             }
                System.out.println("Product details has been successfully updated!!!");
                break;
            }
            else{
                System.out.print("Invalid product code. Try again.");
            }
        }
        }
        //method to allow user to delete inputed answer
        public static void DeleteProduct(){
            //while used so that if user enters invalid response, they are able to retry
            while(true){
            System.out.print("Please enter the product code to delete: ");
            Scanner sc = new Scanner (System.in);
            String tempCode = sc.next();
            int index = ProductCode.indexOf(tempCode);
            //search for if inputted answer is an element of arraylist
            if(index >=0){
                //allow user to confirm before deletion
                System.out.print("Are you sure you want to delete " + ProductCode.get(index)+ "? \n"+
                "Enter (1) to confirm or any other key to return."
                );
                String confirm = sc.next();
                //remove() method used to delete element
                if(confirm.equals("1")){
                    ProductCode.remove(index);
                    ProductName.remove(index);
                    ProductWarranty.remove(index);
                    ProductCategory.remove(index);
                    ProductPrice.remove(index);
                    ProductStockLevel.remove(index);
                    ProductSupplier.remove(index);
                    
                    System.out.println("Product code " +tempCode+" was successfully removed!!!");
                    break;
                }
                else{
                    break;
                }
            }
            else{
                    System.out.println("Invalid product code. Try again.");
        }
        }
        }
        //method to print out report and calculate average and total price
    public static void PrintReport(){
        System.out.println(
                "PRODUCT REPORT" + "\n" +
                "============================================================================");
        //getting arraylist length
        int SIZE = ProductCode.size();
        for(int i =0; i < SIZE; i++){
            int x = i+1;
            System.out.print(
                    "PRODUCT " + x + "\n" + 
                    "---------------------------------------------------------------------------- \n" +
                    "PRODUCT CODE >>      " + ProductCode.get(i) + "\n" +
                    "PRODUCT NAME >>      " + ProductName.get(i) + "\n" +
                    "PRODUCT CATEGORY >>  " + ProductCategory.get(i) + "\n" +
                    "PRODUCT WARRANTY >>  " + ProductWarranty.get(i) + "\n" +
                    "PRODUCT PRICE >>     " + ProductPrice.get(i) + "\n" +
                    "PRODUCT LEVEL >>     " + ProductStockLevel.get(i) + "\n" +
                    "PRODUCT SUPPLIER >>  " + ProductSupplier.get(i) + "\n" +
                    "---------------------------------------------------------------------------- \n"
            );
            
        }
        //getting total value
        double TotalValue =0;
        for(int i =0; i < SIZE; i++){
            TotalValue += ProductPrice.get(i);
        }
        //getting average value
        double Average = TotalValue / SIZE;
        System.out.print(
                     "============================================================================" + "\n" +
                    "TOTAL PRODUCT COUNT: "  + SIZE + "\n" + 
                    "TOTAL PRODUCT VALUE: R " + TotalValue + "\n" +
                    "AVERAGE PRODUCT VALUE: R " + Average + "\n" +
                    "============================================================================ \n"
                );
    }
        //null mehtod that allows user to exit application
        public static void ExitApplication(){
            
        }
}
