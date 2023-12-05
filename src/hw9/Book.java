package hw9;

public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }

    class Description {
        public String getBookDescription() {
            return Book.this.toString();
        }
    }
}
