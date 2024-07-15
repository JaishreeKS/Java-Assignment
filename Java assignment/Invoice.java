import java.util.Scanner;

public class Invoice{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }

    public String getPartNumber(){
        return partNumber;
    }
    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }

    public String getPartDescription(){
        return partDescription;
    }
    public void setPartDescription(String partDescription){
        this.partDescription = partDescription;
    }

    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        if (quantity > 0) {
            this.quantity = quantity;
        }
        else{
            this.quantity = 0;
        }
    }

    public double getPricePerItem(){
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem){
        if(pricePerItem > 0){
            this.pricePerItem = pricePerItem;
        }
        else{
            this.pricePerItem = 0.0;
        }
    }
    
    public double getInvoiceAmount(){
        return quantity * pricePerItem;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter part number: ");
        String partNumber = scanner.nextLine();
        System.out.print("Enter part description: ");
        String partDescription = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter price per item: ");
        double pricePerItem = scanner.nextDouble();

        Invoice invoice = new Invoice(partNumber, partDescription, quantity, pricePerItem);

        System.out.println("\nInvoice Details:");
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: " + invoice.getPricePerItem());
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());
    }
}

