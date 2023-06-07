package ru.zharinov.javacourse1.java_level_2.generics.hw;

public class Box<S, I, F> {
    private S object1;
    private I object2;
    private F object3;

    public Box(S object1, I object2, F object3) {
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;
    }

    public S getObject1() {
        return object1;
    }

    public void setObject1(S object1) {
        this.object1 = object1;
    }

    public I getObject2() {
        return object2;
    }

    public void setObject2(I object2) {
        this.object2 = object2;
    }

    public F getObject3() {
        return object3;
    }

    public void setObject3(F object3) {
        this.object3 = object3;
    }
}
