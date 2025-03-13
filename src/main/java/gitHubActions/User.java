package gitHubActions;

public class User {
    private String userName;
    private String passWord;

    public User(String userName, String passWord){
        this.userName= userName;
        this.passWord = passWord;
    }


    public String getUserName() {
        return userName+"hej";
    }

    public String getPassWord() {
        return passWord;
    }

    public void changeUserName(String userName) {
        this.userName=userName;
    }
}
