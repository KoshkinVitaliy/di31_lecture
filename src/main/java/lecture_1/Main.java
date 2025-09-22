package lecture_1;

public class Main {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(5);

        myArray.arr = new int[]{1, 2, 3, 4, 5};
        myArray.showArr(myArray.arr);

        myArray.addElement(25);
        myArray.showArr(myArray.arr);

        myArray.deleteElement(2);
        myArray.showArr(myArray.arr);

        myArray.updateElement(2048, 5);
        myArray.showArr(myArray.arr);
    }
}
