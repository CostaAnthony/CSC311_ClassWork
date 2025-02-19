module edu.farmingdale.csc311_classwork {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.farmingdale.csc311_classwork to javafx.fxml;
    exports edu.farmingdale.csc311_classwork;
}