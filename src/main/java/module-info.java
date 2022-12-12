module com.example.newgameproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;

    opens com.example.newgameproject to javafx.fxml;
    exports com.example.newgameproject;
}