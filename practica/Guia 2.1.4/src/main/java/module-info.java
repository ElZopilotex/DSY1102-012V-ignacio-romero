module com.example.guia_2_1_4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.guia_2_1_4 to javafx.fxml;
    exports com.example.guia_2_1_4;
}