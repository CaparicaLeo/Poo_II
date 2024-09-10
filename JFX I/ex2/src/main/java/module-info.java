module com.example.ex2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.ex2 to javafx.fxml;
    exports com.example.ex2;
}