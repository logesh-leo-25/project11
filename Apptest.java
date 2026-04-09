package com.logic;
import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {
    App app = new App();

    @Test
    public void testLogic() {
        assertTrue(app.isEven(4));
        assertTrue(app.isPositive(10));
    }
}
