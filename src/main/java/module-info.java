module room.schema.parser.javafx {

  requires javafx.controls;
  requires javafx.fxml;
  requires com.google.gson;

  opens edu.cnm.deepdive.controller to javafx.fxml;
  opens edu.cnm.deepdive.model to com.google.gson;

  exports edu.cnm.deepdive;

}