package Class26;


/*
Create a WebDriver Interface that will have the following unimplemented behaviour:
openBrowser(), closeBrowser(), maximizeWindow(), findElement().
Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
 */

public interface WebDriver {
    void openBrowser();
    void closeBroser();
    void mazmisewindows();
    void findelements();

}
class ChromeDriver implements WebDriver{


    @Override
    public void openBrowser() {
        System.out.println("www.google.com");

    }

    @Override
    public void closeBroser() {

    }

    @Override
    public void mazmisewindows() {

    }

    @Override
    public void findelements() {
        System.out.println("find the the log in box");

    }
}
class fairfox implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("www.facebook.com");

    }

    @Override
    public void closeBroser() {

    }

    @Override
    public void mazmisewindows() {

    }

    @Override
    public void findelements() {
        System.out.println("find the password box");

    }

    public static void main(String[] args) {
        WebDriver webDriver=new fairfox();
        WebDriver webDriver1=new ChromeDriver();
        webDriver1.openBrowser();
        webDriver.openBrowser();
    }
}
