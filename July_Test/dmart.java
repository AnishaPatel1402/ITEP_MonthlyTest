import java.util.Scanner;
class Dmart{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the name your name = ");
        String customerName = sc.nextLine();
        System.out.print("enter your gender = ");
        String gender = sc.next();

        System.out.println("enter the item name and quantity one by one");
        System.out.print("enter Item 1 name = ");
        String item1 = sc.next();
        System.out.print("enter the quantity of item 1 = ");
        int quantity1 = sc.nextInt();

        System.out.print("enter Item 2 name = ");
        String item2 = sc.next();
        System.out.print("enter the quantity of item 2 = ");
        int quantity2 = sc.nextInt();

        System.out.print("enter Item 3 name = ");
        String item3 = sc.next();
        System.out.print("enter the quantity of item 3 = ");
        int quantity3 = sc.nextInt();

        System.out.print("enter Item 4 name = ");
        String item4 = sc.next();
        System.out.print("enter the quantity of item 4 = ");
        int quantity4 = sc.nextInt();

        System.out.print("enter Item 5 name = ");
        String item5 = sc.next();
        System.out.print("enter the quantity of item 5 = ");
        int quantity5 = sc.nextInt();

        System.out.print("enter Item 6 name = ");
        String item6 = sc.next();
        System.out.print("enter the quantity of item 6 = ");
        int quantity6 = sc.nextInt();

        System.out.print("enter Item 7 name = ");
        String item7 = sc.next();
        System.out.print("enter the quantity of item 7 = ");
        int quantity7 = sc.nextInt();

        System.out.print("enter Item 8 name = ");
        String item8 = sc.next();
        System.out.print("enter the quantity of item 8 = ");
        int quantity8 = sc.nextInt();

        System.out.print("enter Item 9 name = ");
        String item9 = sc.next();
        System.out.print("enter the quantity of item 9 = ");
        int quantity9 = sc.nextInt();

        System.out.print("enter Item 10 name = ");
        String item10 = sc.next();
        System.out.print("enter the quantity of item 10 = ");
        int quantity10 = sc.nextInt();

        double totalPrice1Before = 10.0 * quantity1;
        double totalPrice1After = 0;
        if(quantity1 > 4){
           totalPrice1After = totalPrice1Before - (totalPrice1Before*5.0/100);
        }

        double totalPrice2 = 20 * quantity2;
        double totalPrice3 = 30 * quantity3;
        double totalPrice4 = 40 * quantity4;

        double totalPrice5Before = 50 * quantity5;
        double totalPrice5After = totalPrice5Before - (totalPrice5Before*10.0/100);

        double totalPrice6 = 60 * quantity6;
        double totalPrice7 = 70 * quantity7;
        double totalPrice8 = 80 * quantity8;
        double totalPrice9 = 90 * quantity9;

        double totalPrice10Before = 100 * quantity10;
        double totalPrice10After = totalPrice10Before - (totalPrice10Before * 15.0/100);

        double totalBillBefore = totalPrice1Before + totalPrice2 + totalPrice3 + totalPrice4 + totalPrice5Before + totalPrice6 + totalPrice7 + totalPrice8 + totalPrice9 + totalPrice10Before;

        double totalBill = totalPrice1After + totalPrice2 + totalPrice3 + totalPrice4 + totalPrice5After + totalPrice6 + totalPrice7 + totalPrice8 + totalPrice9 + totalPrice10After;

        if(totalBill > 10000){
            totalBill = totalBill - (totalBill*15.0/100);
        }
        else if(totalBill >= 5000 && totalBill <= 10000){
            totalBill = totalBill - (totalBill*10.0/100);
        }

        double gst = totalBill * 10.0/100;
        double totalBillWithGst = totalBill + gst;

        System.out.print("Do you want carrybag Y/N = ");
        char carrybag = sc.next().charAt(0);
        int bag = 0;
        if(carrybag == 'Y'){
            bag = 10;
        }

        // System.out.println(totalBill);
        String gift = "Cadberry";
        if(gender.charAt(0)=='m'){
            gift = "Ladger Wallet";
        }


        System.out.println("                                  Dmart                                        ");
        System.out.println("\t\tName : "+ customerName + "\t\t\t\tDate : 21/07/2025");
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("Item Name \t\t Quantity \t\t Price \t\t Total \t\t After-Discount"); 
        System.out.println(item1+"\t\t\t"+ quantity1 + "\t\t\t"+ 10 + "\t\t\t"+ totalPrice1Before +"\t\t"+ totalPrice1After); 
        System.out.println(item2+"\t\t\t"+ quantity2 + "\t\t\t"+ 20 + "\t\t\t"+ totalPrice2 +"\t\t"+ totalPrice2); 
        System.out.println(item1+"\t\t\t"+ quantity1 + "\t\t\t"+ 30 + "\t\t\t"+ totalPrice3 +"\t\t"+ totalPrice3); 
        System.out.println(item1+"\t\t\t"+ quantity1 + "\t\t\t"+ 40 + "\t\t\t"+ totalPrice4 +"\t\t"+ totalPrice4); 
        System.out.println(item1+"\t\t\t"+ quantity1 + "\t\t\t"+ 50 + "\t\t\t"+ totalPrice5Before +"\t\t"+ totalPrice5After); 
        System.out.println(item1+"\t\t\t"+ quantity1 + "\t\t\t"+ 60 + "\t\t\t"+ totalPrice6 +"\t\t"+ totalPrice6); 
        System.out.println(item1+"\t\t\t"+ quantity1 + "\t\t\t"+ 70 + "\t\t\t"+ totalPrice7 +"\t\t"+ totalPrice7); 
        System.out.println(item1+"\t\t\t"+ quantity1 + "\t\t\t"+ 80 + "\t\t\t"+ totalPrice8 +"\t\t"+ totalPrice8); 
        System.out.println(item1+"\t\t\t"+ quantity1 + "\t\t\t"+ 90 + "\t\t\t"+ totalPrice9 +"\t\t"+ totalPrice9); 
        System.out.println(item1+"\t\t\t"+ quantity1 + "\t\t\t"+ 100 + "\t\t\t"+ totalPrice10Before +"\t\t"+ totalPrice10After); 
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t"+ "\t\tA.P. " +"\t\t"+ "\t\tD.P. ");
        System.out.println("\t\t\t\t\t\t\t\t\t"+ totalBillBefore +"\t"+ totalBill);
        System.out.println("Gift :- "+ gift +"\t\t\t\t\t 0.00 \t\t\t 0.00");
        System.out.println("CarryBag : "+ carrybag +"\t \t \t 10.00 \t 10.00");
        System.out.println("GST (10%) \t\t\t "+ gst +"\t\t"+ gst);
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t" + (totalBillBefore + gst + bag) + "\t" + (totalBillWithGst + bag)+ "RS");
        System.out.println("\t\t\t Thank you");
        System.out.println("\t\t\t To Visit Us");
        System.out.println("\t\t\t Dmart");
        System.out.println("--------------------------------------------------------------------------------------------------");
    }
}