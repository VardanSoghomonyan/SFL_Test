package sfl_qa_meetings_practice;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.Optional;

public class ObjectMethods implements Cloneable {
    int anInt;
    float aFloat;
    private int integera = 8;



    public ObjectMethods() {
        anInt = 1;
        aFloat = 2.0f;
    }

    public ObjectMethods(int anInt, float aFloat) {
        this.anInt = anInt;
        this.aFloat = aFloat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectMethods that = (ObjectMethods) o;
//        return anInt == that.anInt &&
//                Float.compare(that.aFloat, aFloat) == 0;
        return new EqualsBuilder()
                .append(anInt, that.anInt)
                .append(aFloat, that.aFloat)
                .isEquals();
    }

    @Override
    public int hashCode() {
//        return Objects.hash(anInt, aFloat);
        return new HashCodeBuilder()
                .append(anInt)
                .append(aFloat)
                .toHashCode();
    }

    @Override
    public String toString() {
        return "ObjectMethods{" +
                "anInt=" + anInt +
                ", aFloat=" + aFloat +
                '}';
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public float getaFloat() {
        return aFloat;
    }

    public void setaFloat(float aFloat) {
        this.aFloat = aFloat;
    }

   public static void main(String[] args) throws CloneNotSupportedException {
////        Integer x = 5;
////        Integer y = 5;
////        ObjectMethods obj1 = new ObjectMethods(5, 10);
////        ObjectMethods obj2 = new ObjectMethods(5, 10);
//////        ObjectMethods obj1_clone = (ObjectMethods) obj1.clone();
////        ObjectMethods obj1_clone = obj1;
////        System.out.println(obj1.equals(obj2));
////        System.out.println(obj1);
////        System.out.println(x.equals(y));
////        System.out.println(obj1.toString());
////        System.out.println("obj1.equals(obj1_clone) is :" + obj1.equals(obj1_clone));
////        System.out.println("obj1.hashCode() is: " + obj1.hashCode());
////        System.out.println(obj1_clone.hashCode());
////        obj1.setaFloat(7f);
////        System.out.println(obj1);
////        System.out.println(obj1_clone);
////        System.out.println(obj1_clone.hashCode());
////        System.out.println(obj1.hashCode());
//
////        System.out.println(obj1_clone.hashCode());
////        System.out.println(obj1.equals(obj1_clone));
//        String a = "a"+"b";
//        String ab =a+"c";
//        String c = ab+"c";
//        String ab2 ="ab";
//        System.out.println(ab==c);
//
        initializeOptionalValues();
//
    }

    public static Integer sum(Optional<Integer> a, Optional<Integer> b) {

        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());

        Integer value1 = a.orElse(tiv());

        Integer value2 = b.get();
        return value1 + value2;
    }

    public static void initializeOptionalValues() {
        Integer value1 = null;
        Integer value2 = new Integer(100);

        Optional<Integer> a = Optional.ofNullable(value1);
        System.out.println("a is: " + a);

        Optional<Integer> b = Optional.of(value2);
        System.out.println(sum(a, b));

    }
    public static int tiv(){
        System.out.println("tiv");
        return 5;
    }
}
