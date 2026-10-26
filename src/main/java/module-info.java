module com.mycompany.lab09_cynthia {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.lab09_cynthia to javafx.fxml;
    exports com.mycompany.lab09_cynthia;
}
