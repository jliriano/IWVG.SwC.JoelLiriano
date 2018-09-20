package IWVG.SwC.JoelLiriano.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;

    @BeforeEach
    void before() {
        this.user = new User(1,"Jon","Snow");
    }

    @Test
    void testFullName() {
        assertEquals("Jon Snow",user.fullName());
    }

    @Test
    void testGetName() {
        assertEquals("Jon", user.getName());
    }

    @Test
    void testGetFamilyName() {
        assertEquals("Snow", user.getFamilyName());
    }

    @Test
    void testGetNumber() {
        assertEquals(1, user.getNumber());
    }
}
