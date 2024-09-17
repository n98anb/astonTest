package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    SelenideElement radioOnImg = $x("//div[@class = 'css-t61cko']/img");
    SelenideElement volumeButton = $x("//div[@class='chakra-stack css-1ski9r']/button[1]");
    SelenideElement volumeHidden = $x("//div[@class = 'chakra-stack css-1ski9r']/div[@style][1]");
    SelenideElement playlistButton = $x("//div[@class='chakra-stack css-1ski9r']/button[2]");
    SelenideElement playlistHidden = $x("//div[@class='chakra-stack css-1ski9r']/div[@style][2]");


    public MainPage(String url){
        Selenide.open(url);
    }


    public void clickOnPlayButton(){
        radioOnImg.click();
    }


    public boolean checkIfPlayButtonChange(){
        String radioOff = radioOnImg.getAttribute("src");
        radioOnImg.click();
        Selenide.sleep(2000);
        String radioOn = radioOnImg.getAttribute("src");
        return radioOff.equalsIgnoreCase(radioOn);
    }

    public boolean checkIfVolumeButtonChange(){
        String volumeVisible = volumeHidden.getAttribute("style");
        volumeButton.click();
        String volumeHid = volumeHidden.getAttribute("style");
        return volumeHid.equalsIgnoreCase(volumeVisible);
    }

    public boolean checkIfPlaylistButtonChange(){
        String playlistHid = playlistHidden.getAttribute("style");
        playlistButton.click();
        String playlistVisible = playlistHidden.getAttribute("style");
        return playlistVisible.equalsIgnoreCase(playlistHid);
    }
}
