import java.util.Scanner;

class Amount{
    class SaleAmount{
        double original;
        double discount;
        SaleAmount(double original, double discount){
            this.original =original;
            this.discount = discount;
        }
        double calculateSale(){
            double amount = (original*discount)/100;
            double sale = original - amount;
            return sale;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double original = sc.nextDouble();
        double discount = sc.nextDouble();
        Amount obj1 = new Amount();
        Amount.SaleAmount obj2 = obj1.new SaleAmount(original,discount);
        System.out.println(obj2.calculateSale());
        sc.close();
    }
}