import java.util.Scanner;

class Car{
    int speed;
    double regularPrice;
    String color;

    public Car(int speed, double regularPrice, String color){
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }
    public double getSalePrice(){
        return regularPrice;
    }
}

class Truck extends Car {
    int weight;
    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    public double getSalePrice(){
        if (weight > 2000) {
            return regularPrice * 0.90; // 10% discount
        }
        else{
            return regularPrice * 0.80; // 20% discount
        }
    }
}

class Ford extends Car{
    int year;
    int manufacturerDiscount;
    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    public double getSalePrice(){
        return super.getSalePrice() - manufacturerDiscount;
    }
}

class Sedan extends Car {
    int length;
    public Sedan(int speed, double regularPrice, String color, int length){
        super(speed, regularPrice,color);
        this.length = length;
    }

    @Override
    public double getSalePrice(){
        if(length > 20){
            return regularPrice * 0.95; //5% discount
        }
        else{
            return regularPrice * 0.90; //10% discount
        }
    }
}

public class MyOwnAutoShop{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for Sedan:");
        System.out.print("Speed: ");
        int sedanSpeed = scanner.nextInt();
        System.out.print("Regular Price: ");
        double sedanPrice = scanner.nextDouble();
        System.out.print("Color: ");
        String sedanColor = scanner.next();
        System.out.print("Length: ");
        int sedanLength = scanner.nextInt();
        Sedan sedan = new Sedan(sedanSpeed, sedanPrice, sedanColor, sedanLength);

        System.out.println("\nEnter details for Ford1:");
        System.out.print("Speed: ");
        int ford1Speed = scanner.nextInt();
        System.out.print("Regular Price: ");
        double ford1Price = scanner.nextDouble();
        System.out.print("Color: ");
        String ford1Color = scanner.next();
        System.out.print("Year: ");
        int ford1Year = scanner.nextInt();
        System.out.print("Manufacturer Discount: ");
        int ford1Discount = scanner.nextInt();
        Ford ford1 = new Ford(ford1Speed, ford1Price, ford1Color, ford1Year, ford1Discount);

        System.out.println("\nEnter details for Ford2:");
        System.out.print("Speed: ");
        int ford2Speed = scanner.nextInt();
        System.out.print("Regular Price: ");
        double ford2Price = scanner.nextDouble();
        System.out.print("Color: ");
        String ford2Color = scanner.next();
        System.out.print("Year: ");
        int ford2Year = scanner.nextInt();
        System.out.print("Manufacturer Discount: ");
        int ford2Discount = scanner.nextInt();
        Ford ford2 = new Ford(ford2Speed, ford2Price, ford2Color, ford2Year, ford2Discount);

        System.out.println("\nEnter details for Car:");
        System.out.print("Speed: ");
        int carSpeed = scanner.nextInt();
        System.out.print("Regular Price: ");
        double carPrice = scanner.nextDouble();
        System.out.print("Color: ");
        String carColor = scanner.next();
        Car car = new Car(carSpeed, carPrice, carColor);

        System.out.printf("\nSedan sale price: $%.2f%n", sedan.getSalePrice());
        System.out.printf("Ford 1 sale price: $%.2f%n", ford1.getSalePrice());
        System.out.printf("Ford 2 sale price: $%.2f%n", ford2.getSalePrice());
        System.out.printf("Car sale price: $%.2f%n", car.getSalePrice());

        scanner.close();
    }
}

