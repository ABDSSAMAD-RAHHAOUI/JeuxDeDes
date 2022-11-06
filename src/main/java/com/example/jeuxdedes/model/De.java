package com.example.jeuxdedes.model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class De {

    private Integer valeur;
    private Image image;

    public De(Integer valeur) {
        this.valeur = valeur;
    }

    public De(Integer valeur, Image image) {
        this.valeur = valeur;
        this.image = image;
    }

    public Integer getValeur() {
        return valeur;
    }

    public void setValeur(Integer valeur) {
        this.valeur = valeur;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }


}