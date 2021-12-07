module com.example.assignment8neu {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assignment8neu to javafx.fxml;
    exports com.example.assignment8neu;
}