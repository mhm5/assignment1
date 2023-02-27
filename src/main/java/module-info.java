module com.mycompany.assignment1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.assignment1 to javafx.fxml;
    exports com.mycompany.assignment1;
}
