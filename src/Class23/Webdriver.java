package Class23;

public class Webdriver {
    public  void startBrowser(){
        System.out.println("starting the browser");
    }
    public void openUrl(String url){
        System.out.println("opening url");
    }

    public void testLoginPage(){
        System.out.println("Cheaking if login page is visible ");
    }

    public void closeBrowser(){
        System.out.println("closing the browser");
    }


}
class chrome extends Webdriver{
    @Override
    public void startBrowser() {
        System.out.println("opeing google chrome");

    }

    @Override
    public void openUrl(String url) {
        System.out.println("opeing the "+url+"on goolge chrome");
    }

    @Override
    public void testLoginPage() {
        System.out.println("testing the login botten");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing the google chrome");
    }

}
class firfox extends Webdriver{

    @Override
    public void startBrowser() {
        System.out.println("opeing fairfox");

    }

    @Override
    public void openUrl(String url) {
        System.out.println("opeing the "+url+"on fair fox");

    }

    @Override
    public void testLoginPage() {
        System.out.println("testing the login botten");

    }

    @Override
    public void closeBrowser() {
        System.out.println("closing the Fairfox ");

    }

}
class Safari extends Webdriver{

    @Override
    public void startBrowser() {
        System.out.println("opeing safri");

    }

    @Override
    public void openUrl(String url) {
        System.out.println("opeing the "+url+"on safari");

    }

    @Override
    public void testLoginPage() {
        System.out.println("testing the login botten");

    }

    @Override
    public void closeBrowser() {
        System.out.println("closing the safari ");

    }

}
class edge extends Webdriver{

    @Override
    public void startBrowser() {
        System.out.println("opeing edge");

    }

    @Override
    public void openUrl(String url) {
        System.out.println("opeing the "+url+"Edge");

    }

    @Override
    public void testLoginPage() {
        System.out.println("testing the login botten");

    }

    @Override
    public void closeBrowser() {
        System.out.println("closing the edge ");

    }

}

