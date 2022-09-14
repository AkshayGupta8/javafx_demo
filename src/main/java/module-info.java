module com.ui.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.ui.demo to javafx.fxml;
    exports com.ui.demo;
}