package sale;

// Author: Cephas Kaburu
import java.util.Scanner;

public class Sale {

    /**
     * @param args the command line arguments
     */
    
    private double price = 0.00;
    private double TV = 0.00;
    private double washer = 0.00;
    private double fridge = 0.00;
    private double microwave = 0.00;
    private double taxes = 0.00;
    
    
    public Sale() // default constructor
    {
        
    }
    public Sale(double p, double t, double w, double f, double m, double tax)
    {
        set(p ,t, w, f, m, tax);
    }
    
    public void set(double p, double t, double w, double f, double m, double tax)
    {
        price = p;
        washer = w;
        fridge = f;
        microwave = m;
        TV = t;
        taxes = tax;
    }
    public double getPrice()
    {
        Scanner input = new Scanner(System.in);
        double price = input.nextDouble();
        return price;
    }
    public double getTV()
    {
        Scanner input = new Scanner(System.in);
        TV = input.nextDouble();
        return TV;
    }
    public double getFridge()
    {
        Scanner input = new Scanner(System.in);
        fridge = input.nextDouble();
        return fridge;
    }
    public double getWasher()
    {
        Scanner input = new Scanner(System.in);
        washer = input.nextDouble();
        return washer;
    }
     public double getMicrowave()
    {
        Scanner input = new Scanner(System.in);
        microwave = input.nextDouble();
        return microwave;
    }
     public double getTaxes()
     {
         Scanner input = new Scanner(System.in);
         taxes = input.nextDouble();
         return taxes;
     }
   
     public void show(){
         System.out.print("\nPrices:\n");
         System.out.print("\tTV\t\t= $"+ TV +"\n");
         System.out.print("\tWasher/Dryer\t= $"+ TV +"\n");
         System.out.print("\tRefrigerator\t= $"+ TV +"\n");
         System.out.print("\tMicrowave\t= $"+ TV +"\n");
         
        System.out.print("Your subtotal is " + subTotal());
        System.out.print("And at a tax rate of "+ taxes +"percent, this will add $"+ taxes()+ " in sales tax");
        System.out.print("for a grand total of $ "); total();
         
     }
     public double subTotal()
     {
         price = TV + washer + fridge + microwave;
         return price;
     }
     public double taxes()
     {
         return ((taxes/100)*subTotal());
     }
     public double total()
     {
            double grandTotal = TV + washer + fridge + microwave+taxes();
            return grandTotal;
     }
     
     
         
    public static void main(String[] args) {
        // TODO code application logic here
        Sale item;
        item = new Sale(); 
        
        
        System.out.print("Welcome to Sales!!\n\n");
        System.out.print("What was the price of the TV? ");item.getTV();
        System.out.print("and what was the price of the washer/dryer? ");item.getWasher();
        System.out.print("and what was the price of the refrigerator? ");item.getFridge();
        System.out.print("and what was the price of the microwave? ");item.getMicrowave();
        System.out.print("What is the local sales tax rate? ");item.getTaxes();
        
        item.show();
            
    }
    
}
