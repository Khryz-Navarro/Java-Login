public class main {
    public static void main(String[] args) {

        IDandPsswords idandPsswords = new IDandPsswords();
        LoginPage loginPage = new LoginPage(idandPsswords.getLoginInfo());

    }
}


