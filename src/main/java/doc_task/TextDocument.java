package doc_task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextDocument extends Document {
    private String content;

    public TextDocument(String title, String author) {
        super(title, author);
    }

    public TextDocument(String title, String author, String content) {
        super(title, author);
        this.content = content;
    }

    public void appendContent(String someContent) {
        this.content += someContent;
    }

    @Override
    String getContent() {
        return content;
    }

    @Override
    void setContent(String content) {
        this.content = content;
        updateModifiedDate();
    }

    @Override
    public void display() {
        System.out.println("Текстовый документ: " + getTitle());
        System.out.println("Автор: " + getAuthor());
        System.out.println("Дата создания: " + getCreateDate());
        System.out.println("Дата изменения: " + getModifiedDate());

    }

    @Override
    public String getSummary() {
        return "";
    }

    @Override
    public void saveToFile(String fileName) {
        StringBuilder fileContent = new StringBuilder();

        fileContent.append("Заголовок:").append(getTitle()).append("\n");
        fileContent.append("Автор:").append(getAuthor()).append("\n");
        fileContent.append("Дата создания:").append(getCreateDate()).append("\n");
        fileContent.append("Дата изменения:").append(getModifiedDate()).append("\n");
        fileContent.append(content);

        try {
            Path path = Paths.get(fileName);

            Files.write(path, fileContent.toString().getBytes());
        }
        catch (IOException e) {
            System.out.println("Не удалось сохранить текстовый документ! " + e.getMessage());
        }
    }

    @Override
    public void loadFromFile(String fileName) {
        StringBuilder contentBuilder = new StringBuilder();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
               contentBuilder.append(line).append("\n");
            }

            this.content = contentBuilder.toString();
        }
        catch (IOException ex) {
            System.out.println("Не удалось загрузить данные из выбранного файла! "
                    + ex.getMessage());
        }
    }
}
