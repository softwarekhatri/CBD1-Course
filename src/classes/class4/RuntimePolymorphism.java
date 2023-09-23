package classes.class4;

import java.io.Serializable;

public class RuntimePolymorphism {

    /*
     * Runtime Polymorphism, dynamic binding, overiding
     */
    static class Samsung {

        public int getCameraMp() {
            return 80;
        }

    }

    static class OnePlus extends Samsung {
        @Override
        public int getCameraMp() {
            return 120;
        }

    }

    public static void main(String[] args) {
        // Samsung s = new Samsung();
        // OnePlus one = new OnePlus();
        // System.out.println(s.getCameraMp());
        // System.out.println(one.getCameraMp());

        Samsung s = new OnePlus();
        System.out.println(s.getCameraMp());
    }

}
