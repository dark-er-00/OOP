import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Product[] products = new Product[10];
        int count = 0;
        String again = "";
        
        do{
            System.out.println("\n<< Add Products >>");
            products[count] = new Product();
            
            System.out.print("Product Code: ");
            products[count].setProdCode(Integer.parseInt(reader.readLine()));
            
            System.out.print("Product Name: ");
            products[count].setProdName(reader.readLine());
            
            System.out.print("Stock Quantity: ");
            products[count].setStockQty(Integer.parseInt(reader.readLine()));
            
            System.out.print("Unit Price: ");
            products[count].setUnitPrice(Double.parseDouble(reader.readLine()));
            
            System.out.print("Quantity Order: ");
            products[count].setQtyOrder(Integer.parseInt(reader.readLine()));
            
            System.out.println("Total Amount: "+ products[count].getTotalAmount());
            
            System.out.print("Add more products [Y/N]? ");
            again = reader.readLine();
            
            count++;
        } while (again.equalsIgnoreCase("Y") && count != 10);
        
        displayProducts(products, count);
    }
    
    private static void displayProducts(Product[] products, int count){
        double grandTotal = 0;
        System.out.println("<< Display Product >>");
        System.out.println(String.format("%-15s%-15s%-15s%-15s%-15s%-15s", "Product Code", "Product Name", "Stock Qty.", "Unit Price", "Qty. Order", "Total Amount"));
        for(int i = 0; i < count; i++){
            System.out.println(String.format("%-15s%-15s%-15s%-15s%-15s%-15s", products[i].getProdCode(), products[i].getProdName(), products[i].getStockQty(), products[i].getUnitPrice(), products[i].getQtyOrder(), products[i].getTotalAmount()));
            grandTotal += products[i].getTotalAmount();
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\tGrand Total:\t\t "+ grandTotal);
    }
}
