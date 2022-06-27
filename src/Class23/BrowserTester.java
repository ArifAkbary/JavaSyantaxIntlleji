package Class23;

public class BrowserTester {
    public static void main(String[] args) {



        Webdriver chrome =new firfox();
        chrome.startBrowser();
        chrome.testLoginPage();
        chrome.openUrl("www.google.com");
        chrome.closeBrowser();


        Webdriver []brwoser={new firfox(),new chrome(),new Safari(),new edge()};


        for(int i=0; i<brwoser.length;i++){

            brwoser[i].startBrowser();
              brwoser[i].openUrl("www.google.com");
             brwoser[i].testLoginPage();
              brwoser[i].closeBrowser();


        }

       // for(Webdriver webdriver:brwoser){
         //   webdriver.startBrowser();
          //  webdriver.openUrl("www.google.com");
          //  webdriver.testLoginPage();
         //   webdriver.closeBrowser();
        }





    }



