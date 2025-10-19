import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingClass {


    // New stack should be empty test


    @Test
    public void emptyTest(){
        MyStack myStack = new MyStack();
         Assertions.assertTrue(myStack.isEmpty());
    }

    @Test
    public void pushTest(){
        MyStack myStack = new MyStack();

        myStack.push(new Object());
        Assertions.assertFalse(myStack.isEmpty());
    }


    @Test
    public void sizeTest(){
        MyStack myStack = new MyStack();

        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());

        Assertions.assertEquals(3, myStack.size());

        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());

        Assertions.assertEquals(6, myStack.size());
    }
}
