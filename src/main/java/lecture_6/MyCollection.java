package lecture_6;

import java.util.ArrayList;
import java.util.List;

public class MyCollection {
    public static List<String> collection;
     //при создании объекта
    //-> сначала вызывается блок инициализации
    // -> затем вызывается Конструктор

    static {
        collection = new ArrayList<>();
        collection.add("Света");
        collection.add("Милана");
        collection.add("Аня");
    }
}

