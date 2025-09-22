package lecture_1;

public class MyArray {

    int[] arr;

    public MyArray(int arrLength) {
        this.arr = new int[arrLength];
    }

    void showArr(int[] arr) {
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }

    int[] addElement(int element) {
        int lastIndex = arr.length - 1;
        int lastIndexNew = lastIndex + 1;

        for (int k = 0; k < arr.length; k++) {
            if (arr[k] == 0) {
                arr[k] = element;

                break;
            } else if (k + 1 == arr.length && arr[k] != 0) {
                int[] arrCopy = arr;
                arr = new int[arrCopy.length + 1];

                for (int index = 0; index < arrCopy.length; index++) {
                    arr[index] = arrCopy[index];
                }

                arr[lastIndexNew] = element;

                break;
            }
        }
        return arr;
    }

    int[] deleteElement(int indexOfElement) {
        int[] arrCopy = arr;
        arr = new int[arr.length - 1];

        boolean flag = false;

        for (int index = 0; index < arr.length; index++) {
            if(index == indexOfElement && index < arr.length - 1) {
                arr[index] = arrCopy[index + 1];
                flag = true;
            }
            else {
                if(flag) {
                    arr[index] = arrCopy[index+1];
                }
                else arr[index] = arrCopy[index];
            }
        }
        return arr;
    }

    int[] updateElement(int element, int index) {
        try {
            arr[index] = element;
        }
        catch(IndexOutOfBoundsException exception) {
            addElement(element);
        }

        return arr;
    }
}
