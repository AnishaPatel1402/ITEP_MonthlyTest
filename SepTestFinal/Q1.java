// 1. Object-Oriented Programming Problem
// 📌 Problem: Library Management (Classes & Inheritance)
// Create a small library system:
// Create a base class Book with:
// title, author, price.
// A method displayInfo() to print book details.
// Create a derived class EBook with:
// fileSize (in MB) and format.
// Override displayInfo() to include ebook details.
// In main(), create an array of Book references, store both Book and EBook objects, and print their details using polymorphism.

class Book{
    private String title;
    private String author;
    private int price;

    public Book(){}

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getPrice(){
        return this.price;
    }

    public void displayInfo(){
        System.out.println("Book title : "+ this.title);
        System.out.println("Book author : "+ this.author);
        System.out.println("Book price : "+ this.price);
    }

}

class EBook extends Book{
    private int fileSize;
    private String format;

    public EBook(){}
    public EBook(String title, String author, int price, int fileSize, String format){
        super(title,author,price);
        this.fileSize = fileSize;
        this.format = format;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("EBook filesize : "+ this.fileSize + " MB");
        System.out.println("EBook format : "+ this.format);
    }
}

class Test{
    public static void main(String args[]){

        Book b1 = new Book("Atomic habits", "James clear", 120);
        Book b2 = new Book("The Karma", "Sadhguru", 200);
        Book b3 = new Book("Rich Dad Poor Dad", "Robert Henery", 250);

        Book e1 = new EBook("Ramayan", "Valmikiji", 1000, 200, "pdf");
        Book e2 = new EBook("Sakhi", "Kabirdas", 550, 122, "pdf");

        Book library[] = {b1,b2,b3,e1,e2};

        for(Book b : library){
            b.displayInfo();
            System.out.println();
        }
    }
}