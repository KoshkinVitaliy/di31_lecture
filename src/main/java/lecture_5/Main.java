package lecture_5;

public class Main {
    public static void main(String[] args) {
        MyWriter writer = new MyWriter();

//        writer.writeToFile(
//                "Мои первые записанные данные в файл! \n");
//        writer.writeToFile(
//                "Мои вторые записанные данные в файл! \n");

        writer.readFile();
    }
}
