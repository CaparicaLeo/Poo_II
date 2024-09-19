module com.example.ex_aula_3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.ex_aula_3 to javafx.fxml;
    exports com.example.ex_aula_3;
}