package sfl_qa_meetings_practice;

public class JavaObject {
    static Object a;
    static int[] array = {1, 2, 3, 4, 5};
    static int[] array_clone;
    static int[] array2;

    public JavaObject() {
        super();
    }

//
//    public static void main(String[] args) {
//
//        cloning();
////        System.out.println("compare() result is: " + compare());
////        toString_new();
//    }

    private static void cloning() {
        array_clone = array.clone();
        array2 = array;
//        System.out.println(array);
//        System.out.println(array_clone);
//        System.out.println(array2);
        System.out.println("array is: " + array);
        System.out.println("array is: " + array[0]);
//        System.out.println("array_clone is: " + Arrays.toString(array_clone));
//        System.out.println("array2 is: " + Arrays.toString(array2));
//        System.out.println("array hashcode is: " + array.hashCode());
//        System.out.println("array_clone hashcode is: " + array_clone.hashCode());
////        System.out.println("array2 hashcode is: " + array2.hashCode());
//        array[4] = 6;
//        System.out.println("array after change is: " + Arrays.toString(array));
////        System.out.println("array_clone after change is: " + Arrays.toString(array_clone));
//        System.out.println("array2 after change is: " + Arrays.toString(array2));
    }

    private static boolean compare() {
        array_clone = array.clone();
        array2 = array;
        return array.equals(array2);
    }

    private static void toString_new() {
        Integer i = 5;
        System.out.println("Integer is " + i);
        System.out.println("i.toString() is " + i.toString() + "\n");
        if (i.getClass().equals(String.class)) {
            System.out.println("i is a String");
        } else {
            System.out.println("i is NOT a String");
        }


        if (i.toString().getClass().equals(String.class)) {
            System.out.println("i.toString() is a String");
        } else {
            System.out.println("i.toString() is NOT a String");
        }
    }
}
