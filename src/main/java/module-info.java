module com.dnbsammie.ordo {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;


    opens com.dnbsammie.ordo to javafx.fxml;
    exports com.dnbsammie.ordo;
}