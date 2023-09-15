package pesquisa;

public class Book {
    private String title;
    private String writer;
    private int yearPublication;

    public Book(String title, String writer, int yearPublication) {
        this.title = title;
        this.writer = writer;
        this.yearPublication = yearPublication;
    }

    public String getTitle() {
        return title;
    }

    public String getWriter() {
        return writer;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                ", yearPublication=" + yearPublication +
                '}';
    }
}
