import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTests {
    Dog dog = new Dog();

    @Test
    void dogTalkWoofTest(){
        assertEquals("Woof", dog.talk());
    }

    @Test
    void DogDividesHappyTest(){
        assertEquals(2, dog.divide(8,4));
    }

    @Test
    void DogZeroDivisionTest(){
       Exception ex = assertThrows(ArithmeticException.class, () -> dog.divide(1,0));
       assertEquals("dog is zero-smart", ex.getMessage());
    }

    @Test
    void CatAgeTest(){
        Cat cat = new Cat("Moos", 2);
        assertEquals(2, cat.Age());
    }

    @Test
    void GodSizeTest(){
        assertEquals("Medium", dog.size());
    }

}
