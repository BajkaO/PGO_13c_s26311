import java.time.LocalDate;
import java.util.ArrayList;

public class Ksiazka {

    Long ID;
    String name;
    Genre genre;
    Lang lang;
    LocalDate PublishDate;
    Double age;
    int borrowCount;
    boolean isAva;
    ArrayList<Osoba> authors;


    public Ksiazka(Long ID, String name, Genre genre, Lang lang, LocalDate publishDate, Double age, int borrowCount, boolean isAva,ArrayList<Osoba> authors) {
        this.ID = ID;
        this.name = name;
        this.genre = genre;
        this.lang = lang;
        PublishDate = publishDate;
        this.age = age;
        this.borrowCount = borrowCount;
        this.isAva = isAva;
        this.authors = authors;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Lang getLang() {
        return lang;
    }

    public void setLang(Lang lang) {
        this.lang = lang;
    }

    public LocalDate getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        PublishDate = publishDate;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public int getBorrowCount() {
        return borrowCount;
    }

    public void setBorrowCount(int borrowCount) {
        this.borrowCount = borrowCount;
    }

    public boolean isAva() {
        return isAva;
    }

    public void setAva(boolean ava) {
        isAva = ava;
    }

    public ArrayList<Osoba> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Osoba> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", genre=" + genre +
                ", lang=" + lang +
                ", PublishDate=" + PublishDate +
                ", age=" + age +
                ", borrowCount=" + borrowCount +
                ", isAva=" + isAva +
                ", authors=" + authors +
                '}';
    }
}
