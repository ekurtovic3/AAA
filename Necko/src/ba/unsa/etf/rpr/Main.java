package ba.unsa.etf.rpr;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Main extends Application {
    int i = 1;
    @Override
    public void start(Stage primaryStage) throws Exception{


        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/glavna.fxml"));
        GlavnaController ctrl = new GlavnaController(primaryStage);
        loader.setController(ctrl);
        Parent root = loader.load();
        primaryStage.setTitle("Program za distance između tačaka");
        primaryStage.setScene(new Scene(root, 700, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

/*
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Scene;
    import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Border;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;


import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends Application {
    @Override
    public void start(Stage s) {
     //Create the integers for creating the grid.
    int n=10;
    int B=5;
    int row;
    int column;



    //Create the gridpane.
    GridPane grid = new GridPane();
    // Border border = BorderFactory.createLineBorder(Color.DARK_GRAY, 5);
//grid.setBorder(border);
     for(row=0; row<n; row++) {
        for(column=0; column<B; column++) {
            TextField box = new TextField();
            box.setEditable(true);
            box.setText("TEST");

            box.focusedProperty().addListener(new ChangeListener<Boolean>()
            {
                @Override
                public void changed(ObservableValue<? extends Boolean> arg0, Boolean oldPropertyValue, Boolean newPropertyValue)
                {
                    if (newPropertyValue)
                    {
                        box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: lightpink;");
                    }
                    else
                    {
                        box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: lightgreen;");
                    }
                }
            });

            box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: lightgreen;");
            grid.add(box,column,row);



        }
    }
     s.setScene(new Scene(grid));
    // s.setTitle("");
      s.show();

}

    public static void main(String[] args) {
      launch(args);
      }

     }
*/
