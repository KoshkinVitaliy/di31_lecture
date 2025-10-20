package doc_task;

import java.time.LocalDateTime;

public abstract class Document implements Saveable, Displayable{
    private String title;
    private String author;
    private LocalDateTime createDate;
    private LocalDateTime modifiedDate;

    public Document(String title, String author) {
        this.title = title;
        this.author = author;
        this.createDate = LocalDateTime.now();
        this.modifiedDate = LocalDateTime.now();
    }

    abstract String getContent();
    abstract void setContent(String content);

    public void updateModifiedDate() {
        this.modifiedDate = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }


    public LocalDateTime getCreateDate() {
        return createDate;
    }


    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }
}
