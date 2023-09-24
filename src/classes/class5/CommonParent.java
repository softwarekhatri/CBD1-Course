package classes.class5;

public class CommonParent implements Parent1, Parent2, Parent3 {

    @Override
    public String likesSweetDishes() {
        return Parent3.LIKES_DISHES;
    }

    @Override
    public boolean likeToPlay() {
        return false;
    }

    @Override
    public String likesMovie() {
        return "yes";
    }

    public static void main(String[] args) {
        int b = 20;
        // Integer a = 10;
        // Integer a = new Integer(10);
        Integer a = b;
        // Java developer did the magic -> AutoBoxing
        int c = a;
        System.out.println(a); // Unboxing

        // String s = "Ankit";
        // String s = new String("Ankit");
        // System.out.println(a);
        // System.out.println(b);
    }
}
