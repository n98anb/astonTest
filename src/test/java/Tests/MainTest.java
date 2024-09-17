package Tests;

import Pages.MainPage;
import com.codeborne.selenide.Selenide;
import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    public final static String URL = "https://astondevs.ru/";

    MainPage mainPage = new MainPage(URL);

    @Test
    public void radioButton(){
        Selenide.sleep(5000);
        Assert.assertFalse(mainPage.checkIfPlayButtonChange());
        Selenide.sleep(5000);
    }

    @Test
    public void volumeButton(){
        Assert.assertFalse(mainPage.checkIfVolumeButtonChange());
    }

    @Test
    public void playlistButton(){
        Assert.assertFalse(mainPage.checkIfPlaylistButtonChange());

    }
}
