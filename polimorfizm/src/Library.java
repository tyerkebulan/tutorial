public class Library {
    private String name;
    private String city;
    private String country;
    private Book[] books = new Book[100];
    private int sizeOfBooks = 0;

    public Library() {

    }
    public Library(String name, String city, String country, Book[] books) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.books = books;
    }

    void addBook(Book b){
        books[sizeOfBooks] = b;
        sizeOfBooks++;
    }
    void printLibraryData(){

        for (int i=0;i<sizeOfBooks;i++){
            System.out.println(books[i].getBookData() + " " + name + " " + country + " " + city);
        }


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    static class BuildLibrary{
       Library library;
       public BuildLibrary(){
           library = new Library();
       }
        BuildLibrary withCountry(String country){
            library.country = country;
            return this;
        }
        BuildLibrary withCity(String city){
            library.city = city;
            return this;
        }
        BuildLibrary withName(String name){
            library.name = name;
            return this;
        }
        BuildLibrary withBooks(Book[] books){
            library.books = books;
            return this;
        }
        Library build(){
           return library;
        }

    }
}
