package com.example.jeuxdedes;

import com.example.jeuxdedes.model.De;
import static org.junit.jupiter.api.Assertions.*;

import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;

public class DeTest {

    De d1 = new De(5);

    @Test
    void testgetValeur(){
        assertEquals(5,d1.getValeur());
    }
    @Test
    void testgetImage(){
        assertNull(d1.getImage());
    }



}
