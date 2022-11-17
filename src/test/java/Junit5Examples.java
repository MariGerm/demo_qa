import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Junit5Examples {
    private boolean condition;

    @BeforeAll
    static void beforeAll() {
        System.out.println("### @BeforeAll !");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("### @AfterAll !");
    }


    @BeforeEach
    void beforeEach() {
        //open("google.com")
        System.out.println("### @BeforeEach !");
    }
    @AfterEach
    void afterEach() {
        System.out.println("### @AfterEach !");
    }



    @Test
    void firstTest(){
        System.out.println("### firstTest() !");
        assertTrue(3 > 2);
     }
    
}

