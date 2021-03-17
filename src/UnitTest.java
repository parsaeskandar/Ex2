import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTest {

    @Test
    public void test1() {
        Rectangle r = new Rectangle(1.6, 2);
        assertEquals(r.computeArea(), 3.2, 0.001);
    }

    @Test
    public void test2() {
        Rectangle r = new Rectangle(-2, 2);
        assertEquals(r.computeArea(), 0, 0.0001);
    }

    @Test
    public void test3() {
        Rectangle r = new Rectangle(2, 2);
        r.setWidth(4);
        assertEquals(r.computeArea(), 8, 0.0001);
    }


    @Test
    public void test4() {
        Rectangle r = new Rectangle(7, 2);
        r.setHeight(-2);
        assertEquals(r.computeArea(), 0, 0.0001);
    }

    @Test
    public void test5() {
        Square s = new Square(5);
        assertEquals(s.computeArea(), 25, 0.0001);
    }

    @Test
    public void test6() {
        Square s = new Square(5);
        s.setHeight(-3);
        assertEquals(s.computeArea(), 0, 0.0001);
    }


    @Test
    public void test7() {
        Square s = new Square(2);
        s.setHeight(2.5);
        assertEquals(s.computeArea(), 6.25, 0.0001);
    }
}


