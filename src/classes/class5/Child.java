package classes.class5;

public class Child extends CommonParent {

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.likesSweetDishes());
        System.out.println(child.likeToPlay()); // Parent3
        System.out.println(child.likesMovie()); // Parent1

        Parent1 p = new CommonParent();
        System.out.println(p.likesMovie());

        Parent3 P1 = new CommonParent();
        System.out.println(P1.likeToPlay());
    }
}
