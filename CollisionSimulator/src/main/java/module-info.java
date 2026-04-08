module org.example.demo1234 {
    requires javafx.controls;
    requires javafx.fxml;


    exports org.example.collisionsimulator;
    opens org.example.collisionsimulator to javafx.fxml;
}