module ru.belskih_is.calculator_fx_app {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.belskih_is.calculator_fx_app to javafx.fxml;
    exports ru.belskih_is.calculator_fx_app;
}