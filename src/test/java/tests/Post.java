package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Common;

public class Post {
    @BeforeClass
    public void openLink() {
        Common.openLink("https://www.post.lt/siuntu-sekimas");
    }

    @Test
    public void testDoubleClickMainLogo() {
        pages.Post.kazkoksveiksmas();

        pages.Post.ivestiReiksmeIKonkretuLaukeli();
        pages.Post.paspaustiAntKonkretausMygtuko();

        // Testas
        // 1. ivesti
        // 2. paspausti

        String actualOutput;

        pages.Post.performDoubleClick();
        actualOutput = pages.Post.Buttons.getDoubleClickOutputText();


    }

    @Test
    public void testRightClickButton() {
        String expectedOutput = "You have done a right click";
        String actualOutput;

        pages.demoQA.Buttons.performRightClick();
        actualOutput = pages.demoQA.Buttons.getRightClickOutputText();

        Assert.assertEquals(actualOutput, expectedOutput);
    }
}
}


