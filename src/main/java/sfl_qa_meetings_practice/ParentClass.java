package sfl_qa_meetings_practice;

import java.lang.reflect.Field;

public class ParentClass {

    public static void main(String[] args) throws NoSuchFieldException {
        ObjectMethods methods = new ObjectMethods();
        Class objClass = methods.getClass();

        Field field = objClass.getDeclaredField("integera");
        field.setAccessible(true);
        try {
            field.setInt(objClass, 8);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println(field);
    }
}
