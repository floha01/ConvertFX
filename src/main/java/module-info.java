module de.floha01.convertfx.convertfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.floha01.convertfx.convertfx to javafx.fxml;
    exports de.floha01.convertfx.convertfx;
}