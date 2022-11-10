package com.example.jeuxdedes;

import com.example.jeuxdedes.model.De;
import static org.junit.jupiter.api.Assertions.*;

import com.example.jeuxdedes.model.JeuDeDes;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class DeTest {


    JeuDeDes jeuDeDes = new JeuDeDes(new MainController(),new Timeline(), new De(), new De());

    De d1 = new De(5);

    @Test
    void testgetValeur(){
        assertEquals(5,d1.getValeur());
    }
    @Test
    void testgetImage(){
        assertNull(d1.getImage());
    }

    @Test
    void testDesValeurs() {
        new Application() {
            @Override
            public void start(Stage stage) {
                FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main.fxml"));
                Scene scene = null;
                try {
                    scene = new Scene(fxmlLoader.load(), 320, 240);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                stage.setTitle("Jeux De Des");
                stage.setScene(scene);
                stage.show();
                jeuDeDes.lancer();
                assertTrue(jeuDeDes.getDe1().getValeur()>0 && jeuDeDes.getDe1().getValeur()<=6);
                assertTrue(jeuDeDes.getDe2().getValeur()>0 && jeuDeDes.getDe2().getValeur()<=6);
            }
        };
    }



}
