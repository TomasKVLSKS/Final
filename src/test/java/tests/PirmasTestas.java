package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Common;
import pages.Post;
import utils.Driver;

public class PirmasTestas {

//    @BeforeMethod
//    public void setup() {
//        Driver.initialize();
//    }

    @Test
    public void testPirmasTestas(){
        Driver.initialize();
        Common.openLink("https://www.post.lt");
        Post.kazkoksveiksmas();
    }
    @AfterTest
    public void quit() {
        Driver.quit();
    }
}
