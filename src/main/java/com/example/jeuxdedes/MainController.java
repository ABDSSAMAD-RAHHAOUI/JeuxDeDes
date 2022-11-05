package com.example.jeuxdedes;

import com.example.jeuxdedes.model.De;
import com.example.jeuxdedes.model.JeuDeDes;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    private JeuDeDes jeuDeDes;
    Timeline timeline1;

    /************************/
    @FXML
    public ImageView de1Image, de2Image;
    @FXML
    public Button jouer, stop;
    @FXML
    private Label welcomeText;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.timeline1 = new Timeline();
        this.jeuDeDes = new JeuDeDes(this,timeline1,new De(0,de1Image.getImage()),new De(0,de2Image.getImage()));
        stop.setDisable(true);
    }

    @FXML
    protected void onPlayButtonClick()  {
        jouer.setDisable(true);
        stop.setDisable(false);
        jeuDeDes.lancer();

    }

    @FXML
    public void onStopButtonClick() {
        de1Image.setImage(this.jeuDeDes.getDe1().getImage());
        de2Image.setImage(this.jeuDeDes.getDe2().getImage());
        welcomeText.setText("");
        stop.setDisable(true);
        jouer.setDisable(false);
        welcomeText.setVisible(true);
        timeline1.stop();
        this.jeuDeDes.getTimeline().stop();
        welcomeText.setText(this.jeuDeDes.getResultat() ? "Gagner :)" : "Perdu :(");
    }


}