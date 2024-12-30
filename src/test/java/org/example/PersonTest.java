package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testConstructorAndGetters() {
        Person person = new Person("Alice", 25);
        assertEquals("Alice", person.getName());
        assertEquals(25, person.getAge());
    }

    @Test
    public void testSetAge() {
        Person person = new Person("Bob", 30);
        person.setAge(35);
        assertEquals(35, person.getAge());
    }

    @Test
    public void testSetAgeNegative() {
        Person person = new Person("Charlie", 20);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> person.setAge(-5));
        assertEquals("Age cannot be negative", exception.getMessage());
    }

    @Test
    public void testIsAdult() {
        Person person = new Person("David", 20);
        assertTrue(person.isAdult());

        Person child = new Person("Eve", 15);
        assertFalse(child.isAdult());
    }
}
