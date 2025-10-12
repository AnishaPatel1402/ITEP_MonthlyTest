// 5. OOPs Problem
// Library Management (Inheritance + Polymorphism)
// Create an abstract class LibraryItem with fields: title, id.
// Add an abstract method calculateLateFee(int daysLate).
// Create two subclasses:
// Book: Late fee = ₹2 per day.
// DVD: Late fee = ₹5 per day.
// In main, create a list of LibraryItem references (both Book and DVD objects), loop through them, and print late fees using polymorphism

import java.util.ArrayList;
import java.util.Scanner;
class LibraryManagement{
    ArrayList<LibraryItem> list;
    public LibraryManagement(){
        this.list = new ArrayList<LibraryItem>();
    }

    public void addItem(LibraryItem i){
        list.add(i);
    }

    public void removeItem(LibraryItem i){
        list.remove(i);
    }

    public void displayAll(){
        for(LibraryItem i: list){
            i.displayDetail();
            System.out.println();
        }
    }


    public void calculateLateFeesForAll(){
        Scanner sc = new Scanner(System.in);
        for(LibraryItem i: list){
            System.out.println("enter the number of late days for item : "+ i.getTitle());
            int lateDays = sc.nextInt();
            int fine = i.calculateLateFee(lateDays);
            System.out.println("fine for item "+i.getTitle() + " is:  " + fine);
            System.out.println();
        }
    }
}

abstract class LibraryItem{
    private String title;
    private int id;

    public LibraryItem(String title, int id){
        this.title = title;
        this.id = id;
    }

    public String getTitle(){
        return this.title;
    }

    public int getId(){
        return this.id;
    }

    abstract int calculateLateFee(int daysLate);

    public void displayDetail(){
        System.out.println("Title: "+ this.title);
        System.out.println("Id: "+ this.id);
    }

}

class Book extends LibraryItem{
    public Book(String title, int id){
        super(title, id);
    }

    public int calculateLateFee(int daysLate){
        System.out.println("late fine will be calculate as 2rs per day!");
        System.out.println("Number late days: "+ daysLate);
        return daysLate * 2;
    }
}

class DVD extends LibraryItem{
    public DVD(String title, int id){
        super(title, id);
    }

    public int calculateLateFee(int daysLate){
        System.out.println("late fine will be calculate as 5rs per day!");
        System.out.println("Number late days: "+ daysLate);
        return daysLate * 5;
    }
}

class Test{
    public static void main (String args[]){
        Book book1 = new Book("Atomic habits", 201);
        Book book2 = new Book("Rich Dad Poor Dad", 202);
        Book book3 = new Book("Karma", 203);

        LibraryManagement bookStore = new LibraryManagement();
        bookStore.addItem(book1);
        bookStore.addItem(book2);
        bookStore.addItem(book3);

        DVD dvd1 = new DVD("Mahabali Hanuman", 101);
        DVD dvd2 = new DVD("Choota bheem", 102);
        DVD dvd3 = new DVD("Ninja Hotori", 103);

        LibraryManagement dvdStore = new LibraryManagement();
        dvdStore.addItem(dvd1);
        dvdStore.addItem(dvd2);
        dvdStore.addItem(dvd3);

        // bookStore.displayAll();
        // dvdStore.displayAll();

        System.out.println("Calculating fine for BookStore: ");
        bookStore.calculateLateFeesForAll();

        System.out.println("Calculating fine for DvdStore");
        dvdStore.calculateLateFeesForAll();
        
    }
}