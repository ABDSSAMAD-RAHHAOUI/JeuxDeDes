module com.example.jeuxdedes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jeuxdedes to javafx.fxml;
    exports com.example.jeuxdedes;
}