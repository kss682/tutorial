package CustomerPurchase;

public class User {
    private static int USER_COUNT = 0;
    private int userId;
    private String userName;

    User(String userName){
        this.userId = ++USER_COUNT;
        this.userName = userName;
    }

    public String getUserName(){
        return userName;
    }

    public int getUserId(){
        return userId;
    }
}

