module com.aulafx.prueba1 {
    // necesito estos módulos
    requires javafx.controls;
    requires javafx.fxml;

    // cada módulo debe ser abierto (opens) y exportado (exports)
    exports com.aulafx.prueba1.modelo;
    opens com.aulafx.prueba1.modelo to javafx.fxml;



    exports com.aulafx.prueba1.controlador;
    opens com.aulafx.prueba1.controlador to javafx.fxml;
}