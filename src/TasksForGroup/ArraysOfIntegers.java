package TasksForGroup;

import java.util.Arrays;
public class ArraysOfIntegers {
    public static void main(String[] args) {
        //for(<начальная точка>; <условие выхода>; <операторы счетчика>) {
        //	Тело цикла
        //}
        // “Создай переменную i с начальным значением 0 (int i = 0),
        // пока она не достигнет 5 (i <= 5),
        // прибавляй к ней по 1 (i++)
        // на каждом шаге записывай значение i в консоль.”

        //Шаг 1: определить закономерность.
        //Шаг 2: напишем код для вывода первых N элементов данного ряда в виде массива:

        System.out.println("Task 1");
        //Task 1: 1, 2, 3, 4, 5…
        int[] array = new int[10];
        for (int i = 1; i <= array.length; i++) {
            array[i-1] = i;
        }
        System.out.println(Arrays.toString(array));
        
        System.out.println("Task 2");
        //Task 2: 2,  4,  6,   8,  10...
        int[] arr1 = new int[10];
        for (int i = 1; i <= arr1.length; i++){
            arr1[i-1] = i * 2;
        }
        System.out.println(Arrays.toString(arr1));

        System.out.println("Another version");
        int[] arr2 = new int[10];
        for (int i = 0, p = 2; i < arr2.length; i++, p+=2){
            arr2[i]=p;
        }
        System.out.println(Arrays.toString(arr2));

        //Task 3: 1,  4,  9,  16,  25... (1^2, 2^2, 3^2...)
        System.out.println("Task 3");
        int[] arr3 = new int[10];
        for (int i = 1; i <= arr3.length; i++){
            arr3[i-1] = i* i;
        }
        System.out.println(Arrays.toString(arr3));

        //Task 4: 1,  8, 27,  64, 125...
        System.out.println("Task 4");
        int[] arr4 = new int[10];
        for (int i = 1; i <= arr4.length; i++){
            arr4[i-1] = i * i * i;
        }
        System.out.println(Arrays.toString(arr4));

        //Task 5: 1, -1,  1,  -1,   1,  -1...
        System.out.println("Task 5");
        int[] arr5 = new int[10];
        for (int i = 0; i < arr5.length; i+=2){
            arr5[i] = 1;
        }
        for(int i = 1; i <= arr5.length; i+=2){
            arr5[i] = (-1);
        }
        System.out.println(Arrays.toString(arr5));

        System.out.println("Task 6");
        //Task 6: 1, -2,  3,  -4,   5,  -6...
        int[] arr6 = new int[10];
        for(int i = 1; i <= arr6.length; i++){
            arr6[i-1] = i;
            if (arr6[i-1] % 2 == 0){
                arr6[i-1] = i * (-1);
            }
        }
        System.out.println(Arrays.toString(arr6));

        System.out.println("Task 7");
        //Task 7: 1, -4,  9, -16,  25....
        int [] arr7 = new int[10];
        for (int i = 1; i <= arr7.length; i += 2){
            arr7[i-1] = i * i;
        }
        for (int i = 2; i <= arr7.length; i += 2) {
            arr7[i-1] = i * (-i);
        }
        System.out.println(Arrays.toString(arr7));

        System.out.println("Task 8");
        //Task 8: 1,  0,  2,   0,   3,   0,  4....
        int [] arr8 = new int[10];
        for(int i = 1, count = 0; i <= arr8.length; i += 2){
            arr8[i-1] = i + count;
            count--;
        }
        System.out.println(Arrays.toString(arr8));

        System.out.println("Task 9");
        //Task 9: 1,  2,  6,  24, 120, 720...
       int[] arr9 = new int[10];
       for(int i = 1, a = 1; i <= arr9.length; i++){
            arr9[i-1] = i * a ;
            a = arr9[i-1];
        }
        System.out.println(Arrays.toString(arr9));

        System.out.println("Another version");
        int[] arr = new int[10];
        int a = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a * (i+1);
            a = arr[i];
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Task 10");
        //Task 10: 0, 1, 1, 2, 3, 5, 8...
        int[] arr10 = new int [10];

        for(int i = 1, count = 1; i < arr10.length; i++){
            arr10[i] = arr10[i-1] + count;
            count = arr10[i-1];
        }
        System.out.println(Arrays.toString(arr10));
    }
}
