module com.group4.assignment3_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.group4.assignment3_javafx to javafx.fxml;
    exports com.group4.assignment3_javafx;
}
