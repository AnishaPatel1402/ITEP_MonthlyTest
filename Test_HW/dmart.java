import java.util.Scanner;
class Dmart{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name = ");
        String custormerName = sc.nextLine();

        System.out.print("enter your gender = ");
        String gender = sc.next();

        System.out.print("enter name of item 1 = ");
        String item1 = sc.next();
        System.out.print("enter quantity of item 1  = ");
        int quantity1 = sc.nextInt();

        System.out.print("enter name of item 2 = ");
        String item2 = sc.next();
        System.out.print("enter quantity of item 2  = ");
        int quantity2 = sc.nextInt();

        System.out.print("enter name of item 3 = ");
        String item3 = sc.next();
        System.out.print("enter quantity of item 3  = ");
        int quantity3 = sc.nextInt();

        System.out.print("enter name of item 4 = ");
        String item4 = sc.next();
        System.out.print("enter quantity of item 4  = ");
        int quantity4 = sc.nextInt();

        System.out.print("enter name of item 5 = ");
        String item5 = sc.next();
        System.out.print("enter quantity of item 5  = ");
        int quantity5 = sc.nextInt();

        System.out.print("enter name of item 6 = ");
        String item6 = sc.next();
        System.out.print("enter quantity of item 6  = ");
        int quantity6 = sc.nextInt();

        System.out.print("enter name of item 7 = ");
        String item7 = sc.next();
        System.out.print("enter quantity of item 7  = ");
        int quantity7 = sc.nextInt();

        System.out.print("enter name of item 8 = ");
        String item8 = sc.next();
        System.out.print("enter quantity of item 8  = ");
        int quantity8 = sc.nextInt();

        System.out.print("enter name of item 9 = ");
        String item9 = sc.next();
        System.out.print("enter quantity of item 9  = ");
        int quantity9 = sc.nextInt();

        System.out.print("enter name of item 10 = ");
        String item10 = sc.next();
        System.out.print("enter quantity of item 10  = ");
        int quantity10 = sc.nextInt();

        double priceOfItem1 = 10 * quantity1;
        double priceOfItem1AfterDiscount = priceOfItem1;
        if(quantity1 > 4){
            double discount = priceOfItem1 * 0.05;
            priceOfItem1AfterDiscount = priceOfItem1 - discount;
        }

        double priceOfItem2 = 20 * quantity2;
        double priceOfItem3 = 30 * quantity3;
        double priceOfItem4 = 40 * quantity4;
        
        double priceOfItem5 = 50 * quantity5;
        double priceOfItem5AfterDiscount = priceOfItem5 - (priceOfItem5 * 0.1);
        double priceOfItem6 = 60 * quantity6;
        double priceOfItem7 = 70 * quantity7;
        double priceOfItem8 = 80 * quantity8;
        double priceOfItem9 = 90 * quantity9;

        double priceOfItem10 = 100 * quantity10;
        double priceOfItem10AfterDiscount = priceOfItem10;
        priceOfItem10AfterDiscount = priceOfItem10 - (priceOfItem10 * 0.15);

        double actualPrice = priceOfItem1 + priceOfItem2 + priceOfItem3 + priceOfItem4 + priceOfItem5 +  priceOfItem6 + priceOfItem7 + priceOfItem8 + priceOfItem9 + priceOfItem10;
        double totalPrice = priceOfItem1AfterDiscount + priceOfItem2 + priceOfItem3 + priceOfItem4 + priceOfItem5AfterDiscount +  priceOfItem6 + priceOfItem7 + priceOfItem8 + priceOfItem9 + priceOfItem10AfterDiscount;

        double totalPriceAfterDiscount = totalPrice;
        if(totalPrice > 10000){
            totalPriceAfterDiscount = totalPrice - (totalPrice * 15.0/100);
        } 
        else if(totalPrice >= 5000 && totalPrice <= 10000){
            totalPriceAfterDiscount = totalPrice - (totalPrice * 10.0/100);
        }

        double gst = totalPriceAfterDiscount * (10.0/100);
        double totalPriceWithGst = totalPriceAfterDiscount + gst;

        System.out.print("Do you want a carrybag (Y/N)");
        char choice = sc.next().charAt(0);
        int bag = 0;
        if(choice == 'Y') bag = 10;

        String gift = "Cadberry";
        if(gender.charAt(0) == 'M'){
            gift = "LadgerBag";
        }

        System.out.println("\t\t\t\t\tDmart\t\t\t\t");
        System.out.println("\t\tName :  "+ custormerName +"\t\tDate : 22/07/2025");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("ItemName\t Quatity\t Price \t\t Total \t\t AfterDiscount");
        System.out.println(item1+"\t\t"+quantity1+"\t\t"+10+"\t\t"+priceOfItem1+"\t\t"+priceOfItem1AfterDiscount);
        System.out.println(item2+"\t\t"+quantity2+"\t\t"+20+"\t\t"+priceOfItem2+"\t\t"+priceOfItem2);
        System.out.println(item3+"\t\t"+quantity3+"\t\t"+30+"\t\t"+priceOfItem3+"\t\t"+priceOfItem3);
        System.out.println(item4+"\t\t"+quantity4+"\t\t"+40+"\t\t"+priceOfItem4+"\t\t"+priceOfItem4);
        System.out.println(item5+"\t\t"+quantity5+"\t\t"+50+"\t\t"+priceOfItem5+"\t\t"+priceOfItem5AfterDiscount);
        System.out.println(item6+"\t\t"+quantity6+"\t\t"+60+"\t\t"+priceOfItem6+"\t\t"+priceOfItem6);
        System.out.println(item7+"\t\t"+quantity7+"\t\t"+70+"\t\t"+priceOfItem7+"\t\t"+priceOfItem7);
        System.out.println(item8+"\t\t"+quantity8+"\t\t"+80+"\t\t"+priceOfItem8+"\t\t"+priceOfItem8);
        System.out.println(item9+"\t\t"+quantity9+"\t\t"+90+"\t\t"+priceOfItem9+"\t\t"+priceOfItem9);
        System.out.println(item10+"\t\t"+quantity10+"\t\t"+100+"\t\t"+priceOfItem10+"\t\t"+priceOfItem10AfterDiscount);
        System.out.println("------------------------------------------------------------------------------------");

        System.out.println("\t\t\t\t\t A.P.\t\t D.P.");
        System.out.println("\t\t\t\t\t"+ actualPrice+"\t\t"+totalPriceAfterDiscount);
        System.out.println("Gift : "+ gift);
        System.out.println("Carrybag : "+ choice);
        System.out.println("GST (10%) : "+ gst);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t"+ totalPrice +"\t\t"+totalPriceWithGst+ " RS");
        System.out.println("\t\t\tThankyou");
        System.out.println("\t\t\tTo Vist Us");
        System.out.println("\t\t\tDmart");

    }
}