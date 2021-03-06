package course_2.ch3;

public abstract class Animal {
    protected Integer legs;

    protected Animal(Integer legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk(){
        System.out.println("This animal walks on "+legs+" legs.");
    }
}
