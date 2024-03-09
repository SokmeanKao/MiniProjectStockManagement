import controller.ProductController;
import model.ProductImplement;
import view.ProductView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instantiate the Model, View, and Controller
        Scanner scanner= new Scanner(System.in);
        ProductImplement model = new ProductImplement();
        ProductView view = new ProductView();
        ProductController controller = new ProductController(model, view);
        controller.initializeTables(); // create table if not exists
        do {
            controller.displayProductList();
            System.out.println("*Display");
            System.out.println(" W) Write    R) Read    U) Update    D) Delete     S) Search    Se) Set Row \n" +
                    " Sa) Save   Un) Unsaved    Ba) Backup    Re) Restore    E) Exit  ");
            System.out.println("-------------------------------");
            System.out.print("Choose an option(): ");
            String option = scanner.next();
            switch (option) {
                case "*" -> {
                    controller.displayProductList();
                }
                case "w", "W" -> {
                    controller.insertUnsavedProduct();
                }
                case "r", "R" -> {
                    controller.viewProductDetails();
                }
                case "u", "U" -> {
                    controller.updateProduct();
                }
                case "un", "Un" -> {
                    controller.displayUnsavedProducts();
                }
                case "sa", "Sa" -> {
                    controller.addAndSaveUnsavedProducts();
                }
                case "d", "D" -> {
                   controller.deleteProduct();
                }
                case "f", "F" -> {
                    controller.firstPage();
                }
                case "p", "P" -> {
                    controller.previousPage();
                }
                case "n", "N" -> {
                    controller.nextPage();
                }
                case "l", "L" -> {
                    controller.lastPage();
                }
                case "g", "G" -> {
                    controller.goToSpecificPage();
                }
                case "s", "S" -> {
                    controller.searchProductByNameInput();
                }
                case "se", "Se" -> {
                    controller.setNumberOfDisplayRows();
                }
                case "h", "H" -> {
                    controller.help();
                }
                case "ba", "Ba", "BA", "bA" -> {
                    controller.backup();
                }
                case "re", "Re", "RE", "rE" -> {
                    controller.restore();
                }
                case "E","e" ->{
                    System.out.println("Exiting Stock Management System. Goodbye!");
                    return;
                }
            }
//            List<ProductDTO> dataList = DataStorage.retrieveData();
//            // Display dataList in your UI or console
//
//            // Before closing, save the data
//            DataStorage.storeData(dataList);
//
//            // Create a backup with a specific version
//            DataStorage.createBackup(dataList, 1);
//
//            // Restore data from a specific backup version
//            List<ProductDTO> restoredData = DataStorage.restoreBackup(1);

        }while (true);


    }
}
