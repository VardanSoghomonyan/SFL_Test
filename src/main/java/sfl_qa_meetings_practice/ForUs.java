package sfl_qa_meetings_practice;

import java.util.Arrays;

public class ForUs extends Object {
    int[] ar;

    public ForUs(int[] ar) {
        this.ar = ar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForUs forUs = (ForUs) o;
        return Arrays.equals(ar, forUs.ar);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(ar);
    }

//    public static void main(String[] args) {
//    }
}


