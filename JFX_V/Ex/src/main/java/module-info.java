module com.example.ex {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.ex to javafx.fxml;
    exports com.example.ex;
}