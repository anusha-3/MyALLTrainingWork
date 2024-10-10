package p1;

public class Author {
    private String authorName;
    private String nativeLanguage;
    private String secondLanguage;

    Book book;

    public Author() {
    }

    public Author(String authorName, String nativeLanguage, String secondLanguage, Book book) {
        this.authorName = authorName;
        this.nativeLanguage = nativeLanguage;
        this.secondLanguage = secondLanguage;
        this.book = book;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getNativeLanguage() {
        return nativeLanguage;
    }

    public void setNativeLanguage(String nativeLanguage) {
        this.nativeLanguage = nativeLanguage;
    }

    public String getSecondLanguage(String language) {
        return secondLanguage;
    }

    public void setSecondLanguage(String secondLanguage) {
        this.secondLanguage = secondLanguage;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    @Override
    public String toString() {
        return "Author{" +
                "Name: " + authorName +
                ", Native Language: " + nativeLanguage +
                ", Second Language" + secondLanguage +
                ", Book: "+book.toString()+
                '}';
    }
}
