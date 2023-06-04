package test;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class TestA {
    @Test
    public void test(){
        B b = mock(B.class);
        C c = mock(C.class);
        A a = new A(b);

        when(b.fnb()).thenReturn(c);

        a.fna();


        verify(a.b).fnb();
        verify(c).fnc();


    }

}


class A{
    public B b;
    public A(B b) {
        this.b = b;
    }

    public String fna(){
        C c = b.fnb();
        c.fnc();

        return "a";
    }

}

class B{
    C c;

    public B(C c) {
        this.c = c;
    }

    public C fnb(){

        return c;
    }
}

class C{
    public String fnc(){
        System.out.println("hi there c");

        return "c";
    }
}

