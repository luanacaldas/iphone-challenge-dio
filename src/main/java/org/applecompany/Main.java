package org.applecompany;

public class Main {
    public static void main(String[] args) {

        iPhone myiPhone = new iPhone(100, true, "6.1 inches");

        myiPhone.powerOn();
        myiPhone.unlock();

        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.play();
        musicPlayer.selectMusic("Black - Pearl Jam");

        Telephone telephone = new Telephone();
        telephone.call("11-90000-0000");
        telephone.answer();

        InternetBrowser browser = new InternetBrowser();
        browser.displayPage("https://www.linkedin.com/in/luanavalimm/");
        browser.addNewTab();
        browser.updatePage();
    }
}
