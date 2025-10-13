package lecture_5;

import java.io.*;

public class MyWriter {
    private File file;

    private void createFile() {
        file = new File("text.txt");

        if (file.exists()) {
            System.out.println("Файл уже существует!");
        }
    }

    public void writeToFile(String content) {
        createFile();

        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(content);

            System.out.println("Успешно записали данные в файл!");
            writer.close();
        } catch (IOException e) {
            System.out.println("Не удалось записать данные в файл!");
        }
    }

    public void readFile() {
        createFile();

        try {
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла! "
                    + e.getMessage());
        }
    }
}
