package course_2.ch3;

public class Spider extends Animal{

    public Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("The spider ate an insect!");
    }
}
