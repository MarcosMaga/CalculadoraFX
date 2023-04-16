module com.mycompany.calculadora {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires exp4j;

    opens com.mycompany.calculadora to javafx.fxml;
    exports com.mycompany.calculadora;
}
