package gitHubActions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        assertEquals("Arnoldar",user.getUserName());
    }
}
