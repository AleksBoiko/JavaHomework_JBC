public class Book {
    private String author;
    private String title;
    private int pageCount;
    private int catalogNumber;
    private String location;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
        this.pageCount = 0;
        this.catalogNumber = 0;
        this.location = "";
    }

    public Book(String author, String title, int pageCount, int catalogNumber, String location) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
        this.catalogNumber = catalogNumber;
        this.location = location;
    }

    public void setCatalogNumber(int catalogNumber) {
        this.catalogNumber = catalogNumber;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void printInfo() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Количество страниц: " + pageCount);
        System.out.println("Номер в каталоге: " + catalogNumber);
        System.out.println("Местонахождение: " + location);
    }
}

