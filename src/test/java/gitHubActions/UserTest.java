package gitHubActions;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void testUser() {
        User user = new User("Arne", "Alligator");

        assertEquals("Arne", user.getUserName());
        assertEquals("Alligator", user.getPassWord());
    }

    @Test
    public void testChangeUserName(){
        User user=new User("Arne","Alligator");

        user.changeUserName("Arnold");
        assertEquals("Arnold",user.getUserName());
    }
}
