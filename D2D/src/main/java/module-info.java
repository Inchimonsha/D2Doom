module org.dm.d2d {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.dm.d2d to javafx.fxml;
    exports org.dm.d2d;
}