module com.example.java_calculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires javafx.graphics;

    opens com.example.java_calculator to javafx.fxml;
    exports com.example.java_calculator;
}