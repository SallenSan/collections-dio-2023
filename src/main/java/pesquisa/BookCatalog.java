package pesquisa;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {

    private List<Book> bookCatalogs;

    public BookCatalog() {
        this.bookCatalogs = new ArrayList<>();
    }

    public void addBooks(String title, String writer, int yearPublication ){
        bookCatalogs.add(new Book(title, writer, yearPublication));

    }
    public List<Book> searchWriter(String writer){
        List<Book> booksByWriter = new ArrayList<>();
        if(!bookCatalogs.isEmpty()){
            for(Book b : bookCatalogs){
                if(b.getWriter().equalsIgnoreCase(writer)){
                    booksByWriter.add(b);
                }
            }
        }
        return booksByWriter;
    }

    public List<Book> searchByYearRange(int startYear, int endYear){
        List<Book> booksByYear = new ArrayList<>();
        if(!bookCatalogs.isEmpty()){
            for(Book b : bookCatalogs){
                if(b.getYearPublication() >= startYear && b.getYearPublication() <= endYear){
                    booksByYear.add(b);
                }
            }
        }
        return booksByYear;
    }

    public Book searchByTitle(String title) {
        Book byTitle = null;
        if (!bookCatalogs.isEmpty()) {
            for (Book b : bookCatalogs) {
                if (b.getTitle().equalsIgnoreCase(title)) {
                    byTitle = b;
                }
            }
        }
        return byTitle;

    }

    public static void main(String[] args) {
        BookCatalog bookCatalog = new BookCatalog();

        bookCatalog.addBooks("livro1", "autor1", 1934);
        bookCatalog.addBooks("livro2", "autor2", 1939);
        bookCatalog.addBooks("livro2", "autor2", 1940);
        bookCatalog.addBooks("livro3", "autor3", 2022);

        System.out.println(bookCatalog.searchWriter("autor2"));
    }

}
