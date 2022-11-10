package com.example.jeuxdedes.model;

import com.example.jeuxdedes.MainController;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.util.Duration;

import java.util.*;

/**
 * 
 */
public class JeuDeDes {
    private Boolean resultat;
    private final De de1;
    private final De de2;
    private final Timeline timeline;
    private final MainController mainController;
    private MainController mainController1;

    public JeuDeDes(MainController mainController,Timeline timeline, De de1, De de2) {
        this.mainController = mainController;
        this.timeline = timeline;
        this.de1 = de1;
        this.de2 = de2;
    }

    public void lancer() {
        String imagesPath = "C:\\Users\\hp\\OneDrive\\Bureau\\School\\demo\\JeuxDeDes\\src\\main\\resources\\com\\example\\jeuxdedes\\assets\\";

        final int NUM_FRAMES = 50;
        final int PAUSE_BETWEEN_FRAMES = 300;
        List<Image> images = List.of(
                new Image(imagesPath+"1.png"),
                new Image(imagesPath+"2.png"),
                new Image(imagesPath+"3.png"),
                new Image(imagesPath+"4.png"),
                new Image(imagesPath+"5.png"),
                new Image(imagesPath+"6.png")
        );

        for (int i = 0; i < NUM_FRAMES; i++) {
            Random random = new Random();
            int r1 = random.nextInt(6);
            int r2 = random.nextInt(6);
            timeline.getKeyFrames().add(
                    new KeyFrame(
                            Duration.millis(i * PAUSE_BETWEEN_FRAMES),
                            new KeyValue(this.mainController.de1Image.imageProperty(), images.get(r1)),
                            new KeyValue(this.mainController.de2Image.imageProperty(), images.get(r2))
                    )
            );
            de1.setValeur(r1+1);
            de1.setImage(images.get(r1));
            de2.setValeur(r2+1);
            de2.setImage(images.get(r2));

        }

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    public De getDe1() {
        return de1;
    }
    public De getDe2() {
        return de2;
    }


    public Boolean getResultat() {
        return this.getDe1().getValeur() + this.getDe2().getValeur() >= 7;
    }


    public Timeline getTimeline() {
        return timeline;
    }

}