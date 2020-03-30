package lv.javaguru.homework.lesson5;

//Ok
//izmanto "ctrl + alt + l"
public class Book {
    private String author;
    private String title;
    private int pageCount;

    public  String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title ;
    }

    public int getPageCount() {
        return pageCount;
    }
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
   @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null ||  getClass() != that.getClass()) return false;
        Book myBook = (Book) that;
        boolean isAuthorEquals = myBook.author.equals(author);
        boolean isTitleEquals = myBook.title.equals(title);
        boolean isPageCountEquals = myBook.pageCount == pageCount;

        return  isAuthorEquals &&
                isTitleEquals &&
                isPageCountEquals;

//        return Object.equals(author,myBook.author) &&
//                Object.equals(title,myBook.title) &&
//                Object.equals(pageCount,myBook.pageCount);
   }
    @Override
    public String toString(){
        return "Book{" + "author=" +author + '/' +
        ", title=" + title +'/' +
    ". pageCount=" + pageCount+ '}';
    }
    }


