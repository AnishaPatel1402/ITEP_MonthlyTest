import java.util.ArrayList;
class Library{
    ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(Book b){
        books.add(b);
        System.out.println(b.getId()+ " Book added successfully");
    }

    public void listBook(){
        for(Book b: books){
            b.displayBook();
        }
    }

    public void deleteBook(int id){
        for(Book b : books){
            if(b.getId() == id) {
                books.remove(b);
                System.out.println(b.getId()+ " Book deleted");
            }
        }
    }

}
class Book{
    private int id;
    private String title; 
    private String author;

    public Book(int id, String title, String author){
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId(){
        return this.id;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public void displayBook(){
        System.out.println("Book Id = "+ this.id);
        System.out.println("Book Title = "+ this.title);
        System.out.println("Book Author = "+ this.author);
        System.out.println();
    }
}
class Test{
    public static void main(String args[]){
       Book b1 = new Book(101, "Atomic Habits", "James Clear");
       Book b2 = new Book(102, "Death", "Sadhguru");
       Book b3 = new Book(103, "The Art of Living", "Ravisanker ji");
        // b1.displayBook();
        // b2.displayBook();
        // b3.displayBook();

        Library l = new Library();
        l.addBook(b1);
        l.addBook(b2);
        l.addBook(b3);

        l.listBook();

        l.deleteBook(b2.getId());

        l.listBook();

        l.deleteBook(b1.getId());
        l.listBook();
    }
}