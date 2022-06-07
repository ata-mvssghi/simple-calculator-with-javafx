module com.example.workshop11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.workshop11 to javafx.fxml;
    exports com.example.workshop11;
}