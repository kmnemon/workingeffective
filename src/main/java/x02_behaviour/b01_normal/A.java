package x02_behaviour.b01_normal;

public class A {
    B b;

    public A(B b) {
        this.b = b;
    }

    public void fna(){
        b.fnb();
    }
}

class B{
    void fnb(){
        System.out.println("fnb");
    }
}
