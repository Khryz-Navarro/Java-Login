import java.util.HashMap;

public class IDandPsswords {

    HashMap<String, String> logininfo = new HashMap<String, String>();

    IDandPsswords() {
        logininfo.put("admin", "admin");
        logininfo.put("admin2", "1234");
        logininfo.put("whiteDude42069", "helloWorld");
    }
    public HashMap getLoginInfo(){
        return logininfo;
    }

}
