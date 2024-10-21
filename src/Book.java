import java.time.LocalDate;

public class Book {
    String title;
    Author author;
    int yearOfPublication;


    public Book(String title, Author author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication (int yearOfPublication) {
        if (yearOfPublication < 1900 || yearOfPublication > LocalDate.now().getYear()) {
            System.out.println("Invalid year of publication:" + yearOfPublication);
            return;
        }
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Название: " + title + "; Автор: " + author.toString() + "; Год публикации: " + yearOfPublication;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        return toString().equals(((Book) other).toString());
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(toString());
    }
}