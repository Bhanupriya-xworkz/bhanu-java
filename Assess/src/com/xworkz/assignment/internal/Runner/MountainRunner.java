package com.xworkz.assignment.internal.Runner;
import com.xworkz.assignment.internal.veriable.Mountain;
}public class MountainRunner {
    public static void main(String[] args) {
        Mountain m = new Mountain();
        System.out.println(m);
        System.out.println(new Mountain().hashCode());
        System.out.println("original hashCode: " + System.identityHashCode(m));

        Mountain mountain1 = new Mountain();
        mountain1.setTall(true);
        Mountain mountain2 = new Mountain();
        mountain2.setTall(false);
        boolean same = mountain1.equals(mountain2);
        System.out.println("both same: " + same);
    }
}

