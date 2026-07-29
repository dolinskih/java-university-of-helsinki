
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(scan.nextLine());
        double giftTax = 0;

        if (gift >= 1000000){
            giftTax = 142100 + (double) (gift - 1000000) * 0.17;
        } else if(gift >= 200000) {
            giftTax = 22100 + (double) (gift - 200000) * 0.15;
        } else if(gift >= 55000) {
            giftTax = 4700 + (double) (gift - 55000) * 0.12;
        } else if(gift >= 25000) {
            giftTax = 1700 + (double) (gift - 25000) * 0.1;
        } else if(gift >= 5000) {
            giftTax = 100 + (double) (gift - 5000) * 0.08;
        }

        if(giftTax == 0){
            System.out.println("No tax!");
        } else {
            System.out.println("Tax: " + giftTax);
        }
    }
}
