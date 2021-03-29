package ba.unsa.etf.rpr;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public class GlavnaController {
    public GridPane gridd;
    public TextField field1;
    public TextField field2;
    public Button confirm1;
    public TextField value0;
    public TextField value1;
    public TextField value2;
    public TextField value3;
    public TextField value4;
    public TextField value5;
    public TextField value6;
    public TextField value7;
    public TextField value8;
    public TextField value9;
    public TextField valueY;
    public Label lab0;
    public Label lab1;
    public Label lab2;
    public Label lab3;
    public Label lab4;
    public Label lab5;
    public Label lab6;
    public Label lab7;
    public Label lab8;
    public Label lab9;
    public Label labY;

    @FXML RadioButton radio1;
    @FXML  RadioButton radio2;
    @FXML  RadioButton radio3;
    Stage stage;

    public GlavnaController(Stage primaryStage) {
        stage=primaryStage;
    }

    @FXML
    public void initialize() {


        radio1.setSelected(true);
        value0.setVisible(false);
        value1.setVisible(false);
        value2.setVisible(false);
        value3.setVisible(false);
        value4.setVisible(false);
        value5.setVisible(false);
        value6.setVisible(false);
        value7.setVisible(false);
        value8.setVisible(false);
        value9.setVisible(false);
        valueY.setVisible(false);
 lab0.setVisible(false);
        lab1.setVisible(false);
        lab2.setVisible(false);
        lab3.setVisible(false);
        lab4.setVisible(false);
        lab5.setVisible(false);
        lab6.setVisible(false);
        lab7.setVisible(false);
        lab8.setVisible(false);
        lab9.setVisible(false);
        labY.setVisible(false);
    }

    public void clickConfrim1(ActionEvent actionEvent) {
        AtomicBoolean sveOk = new AtomicBoolean(true);

        if(field1.getText().isEmpty()) return;
        double d = Double.parseDouble(field1.getText());
        if (!field1.getText().isEmpty() && d<=10 && d>0 ) {
            field1.getStyleClass().removeAll("poljeNijeIspravno");
            field1.getStyleClass().add("poljeIspravno");
        } else {
            field1.getStyleClass().removeAll("poljeIspravno");
            field1.getStyleClass().add("poljeNijeIspravno");
            prazno();
            sveOk.set(false);


        }

    if(sveOk.get() && d==1) {
        prazno();
        value0.setVisible(true);
        lab0.setVisible(true);
        labY.setVisible(true);
        valueY.setVisible(true);
    }

        if(sveOk.get() && d==2) {
            prazno();
            value0.setVisible(true);
            lab0.setVisible(true);
            value1.setVisible(true);
            lab1.setVisible(true);
            labY.setVisible(true);
            valueY.setVisible(true);
        }

        if(sveOk.get() && d==3) {
            prazno();
            value0.setVisible(true);
            lab0.setVisible(true);
            value1.setVisible(true);
            lab1.setVisible(true);
            value2.setVisible(true);
            lab2.setVisible(true);
            value2.setVisible(true);
            lab2.setVisible(true);

            labY.setVisible(true);
            valueY.setVisible(true);
        }
        if(sveOk.get() && d==4) {
            prazno();
            value0.setVisible(true);
            lab0.setVisible(true);
            value1.setVisible(true);
            lab1.setVisible(true);
            value2.setVisible(true);
            lab2.setVisible(true);
            value2.setVisible(true);
            lab2.setVisible(true);
            value3.setVisible(true);
            lab3.setVisible(true);
            labY.setVisible(true);
            valueY.setVisible(true);
        }

        if(sveOk.get() && d==5) {
            prazno();
            value0.setVisible(true);
            lab0.setVisible(true);
            value1.setVisible(true);
            lab1.setVisible(true);
            value2.setVisible(true);
            lab2.setVisible(true);
            value2.setVisible(true);
            lab2.setVisible(true);
            value3.setVisible(true);
            lab3.setVisible(true);
            value4.setVisible(true);
            lab4.setVisible(true);

            labY.setVisible(true);
            valueY.setVisible(true);
        }

        if(sveOk.get() && d==6) {
            prazno();
            value0.setVisible(true);
            lab0.setVisible(true);
            value1.setVisible(true);
            lab1.setVisible(true);
            value2.setVisible(true);
            lab2.setVisible(true);
            value2.setVisible(true);
            lab2.setVisible(true);
            value3.setVisible(true);
            lab3.setVisible(true);
            value4.setVisible(true);
            lab4.setVisible(true);
            value5.setVisible(true);
            lab5.setVisible(true);

            labY.setVisible(true);
            valueY.setVisible(true);
        }
        if(sveOk.get() && d==7) {
            prazno();
            value0.setVisible(true);
            lab0.setVisible(true);
            value1.setVisible(true);
            lab1.setVisible(true);
            value2.setVisible(true);
            lab2.setVisible(true);
            value2.setVisible(true);
            lab2.setVisible(true);
            value3.setVisible(true);
            lab3.setVisible(true);
            value4.setVisible(true);
            lab4.setVisible(true);
            value5.setVisible(true);
            lab5.setVisible(true);
            value6.setVisible(true);
            lab6.setVisible(true);
            labY.setVisible(true);
            valueY.setVisible(true);
        }

        if(sveOk.get() && d==8) {
            prazno();
            value0.setVisible(true);
            lab0.setVisible(true);
            value1.setVisible(true);
            lab1.setVisible(true);
            value2.setVisible(true);
            lab2.setVisible(true);
            value2.setVisible(true);
            lab2.setVisible(true);
            value3.setVisible(true);
            lab3.setVisible(true);
            value4.setVisible(true);
            lab4.setVisible(true);
            value5.setVisible(true);
            lab5.setVisible(true);
            value6.setVisible(true);
            lab6.setVisible(true);
            value7.setVisible(true);
            lab7.setVisible(true);
            labY.setVisible(true);
            valueY.setVisible(true);
        }

        if(sveOk.get() && d==9) {
            prazno();
            value0.setVisible(true);
            lab0.setVisible(true);
            value1.setVisible(true);
            lab1.setVisible(true);
            value2.setVisible(true);
            lab2.setVisible(true);
            value2.setVisible(true);
            lab2.setVisible(true);
            value3.setVisible(true);
            lab3.setVisible(true);
            value4.setVisible(true);
            lab4.setVisible(true);
            value5.setVisible(true);
            lab5.setVisible(true);
            value6.setVisible(true);
            lab6.setVisible(true);
            value7.setVisible(true);
            lab7.setVisible(true);
            value8.setVisible(true);
            lab8.setVisible(true);
            labY.setVisible(true);
            valueY.setVisible(true);
        }



        if(sveOk.get() && d==10) {
            prazno();
            value0.setVisible(true);
            lab0.setVisible(true);
            value1.setVisible(true);
            lab1.setVisible(true);
            value2.setVisible(true);
            lab2.setVisible(true);
            value2.setVisible(true);
            lab2.setVisible(true);
            value3.setVisible(true);
            lab3.setVisible(true);
            value4.setVisible(true);
            lab4.setVisible(true);
            value5.setVisible(true);
            lab5.setVisible(true);
            value6.setVisible(true);
            lab6.setVisible(true);
            value7.setVisible(true);
            lab7.setVisible(true);
            value8.setVisible(true);
            lab8.setVisible(true);
            value9.setVisible(true);
            lab9.setVisible(true);
            labY.setVisible(true);
            valueY.setVisible(true);
        }
    }



    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    public void prazno(){
        value0.setVisible(false);
        value1.setVisible(false);
        value2.setVisible(false);
        value3.setVisible(false);
        value4.setVisible(false);
        value5.setVisible(false);
        value6.setVisible(false);
        value7.setVisible(false);
        value8.setVisible(false);
        value9.setVisible(false);
        valueY.setVisible(false);
        lab0.setVisible(false);
        lab1.setVisible(false);
        lab2.setVisible(false);
        lab3.setVisible(false);
        lab4.setVisible(false);
        lab5.setVisible(false);
        lab6.setVisible(false);
        lab7.setVisible(false);
        lab8.setVisible(false);
        lab9.setVisible(false);
        labY.setVisible(false);
    }
    public void nova(ActionEvent actionEvent) {
        boolean sveOk=true;
        int n= Integer.parseInt(field1.getText())+1;
        int B= Integer.parseInt(field2.getText());
        int row;
        int column;

        Stage nova=new Stage();

        //Create the gridpane.
        GridPane grid = new GridPane();

        for(row=0; row<n; row++) {

            for(column=0; column<B+1; column++) {

                TextField box = new TextField();
                box.setText("TEST");
                if(row==0 && column==0) {box.setText("X1=( " +value0.getText()+" ) "); box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: Grey;");}
                if(row==0 && column==1) {box.setText("X2=( "+value1.getText()+" )"); box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: Grey;");}
                if(row==0 && column==2) {box.setText("X3=( "+value2.getText()+" )"); box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: Grey;");}
                if(row==0 && column==3) {box.setText("X4=( "+value3.getText()+" )"); box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: Grey;");}
                if(row==0 && column==4) {box.setText("X5=( "+value4.getText()+" )"); box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: Grey;");}
                if(row==0 && column==5) {box.setText("X6=( "+value5.getText()+" )"); box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: Grey;");}
                if(row==0 && column==6) {box.setText("X7=( "+value6.getText()+" )"); box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: Grey;");}
                if(row==0 && column==7) {box.setText("X8=( "+value7.getText()+" )"); box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: Grey;");}
                if(row==0 && column==8) {box.setText("X9=( "+value8.getText()+" )"); box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: Grey;");}
                if(row==0 && column==9) {box.setText("X10=( "+value9.getText()+" )"); box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: Grey;");}
                if(row==0 && column==B) {box.setText("Y= ( "+valueY.getText()+" )"); box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: Grey;");}


                box.setEditable(true);
                if(row==0) box.setEditable(false);
sveOk=false;

//String[] s=value0.getText().split(",");
                if(column==0 && row!=0) {
                    box.focusedProperty().addListener(new ChangeListener<Boolean>()
                    {
                        @Override
                        public void changed(ObservableValue<? extends Boolean> arg0, Boolean oldPropertyValue, Boolean newPropertyValue)
                        {
                            if ( value0.getText().toLowerCase().contains(box.getText().toLowerCase()) && box.getText()!="," && box.getText().length()==1)
                            {
                                box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: lightgreen;");
                            }
                            else
                            {
                                box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: lightpink;");
                            }
                        }
                    });
                }
                if(column==1 && row!=0) {
                    box.focusedProperty().addListener(new ChangeListener<Boolean>()
                    {
                        @Override
                        public void changed(ObservableValue<? extends Boolean> arg0, Boolean oldPropertyValue, Boolean newPropertyValue)
                        {
                            if ( value1.getText().toLowerCase().contains(box.getText().toLowerCase()) && box.getText()!="," && box.getText().length()==1)
                            {
                                box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: lightgreen;");
                            }
                            else
                            {
                                box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: lightpink;");
                            }
                        }
                    });
                }

                if(column==2 && row!=0) {
                    box.focusedProperty().addListener(new ChangeListener<Boolean>()
                    {
                        @Override
                        public void changed(ObservableValue<? extends Boolean> arg0, Boolean oldPropertyValue, Boolean newPropertyValue)
                        {
                            if ( value2.getText().toLowerCase().contains(box.getText().toLowerCase()) && box.getText()!="," && box.getText().length()==1)
                            {
                                box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: lightgreen;");
                            }
                            else
                            {
                                box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: lightpink;");
                            }
                        }
                    });
                }

                if(column==3 && row!=0) {
                    box.focusedProperty().addListener(new ChangeListener<Boolean>()
                    {
                        @Override
                        public void changed(ObservableValue<? extends Boolean> arg0, Boolean oldPropertyValue, Boolean newPropertyValue)
                        {
                            if ( value3.getText().toLowerCase().contains(box.getText().toLowerCase()) && box.getText()!="," && box.getText().length()==1)
                            {
                                box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: lightgreen;");
                            }
                            else
                            {
                                box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: lightpink;");
                            }
                        }
                    });
                }
                if(column==4 && row!=0) {
                    box.focusedProperty().addListener(new ChangeListener<Boolean>()
                    {
                        @Override
                        public void changed(ObservableValue<? extends Boolean> arg0, Boolean oldPropertyValue, Boolean newPropertyValue)
                        {
                            if ( value4.getText().toLowerCase().contains(box.getText().toLowerCase()) && box.getText()!="," && box.getText().length()==1)
                            {
                                box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: lightgreen;");
                            }
                            else
                            {
                                box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: lightpink;");
                            }
                        }
                    });
                }
                if(column==5 && row!=0) {
                    box.focusedProperty().addListener(new ChangeListener<Boolean>()
                    {
                        @Override
                        public void changed(ObservableValue<? extends Boolean> arg0, Boolean oldPropertyValue, Boolean newPropertyValue)
                        {
                            if ( value5.getText().toLowerCase().contains(box.getText().toLowerCase()) && box.getText()!="," && box.getText().length()==1)
                            {
                                box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: lightgreen;");
                            }
                            else
                            {
                                box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: lightpink;");
                            }
                        }
                    });
                }

                if(column==6 && row!=0) {
                    box.focusedProperty().addListener(new ChangeListener<Boolean>()
                    {
                        @Override
                        public void changed(ObservableValue<? extends Boolean> arg0, Boolean oldPropertyValue, Boolean newPropertyValue)
                        {
                            if ( value6.getText().toLowerCase().contains(box.getText().toLowerCase()) && box.getText()!="," && box.getText().length()==1)
                            {
                                box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: lightgreen;");
                            }
                            else
                            {
                                box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: lightpink;");
                            }
                        }
                    });
                }

                if(column==7 && row!=0) {
                    box.focusedProperty().addListener(new ChangeListener<Boolean>()
                    {
                        @Override
                        public void changed(ObservableValue<? extends Boolean> arg0, Boolean oldPropertyValue, Boolean newPropertyValue)
                        {
                            if ( value7.getText().toLowerCase().contains(box.getText().toLowerCase()) && box.getText()!="," && box.getText().length()==1)
                            {
                                box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: lightgreen;");
                            }
                            else
                            {
                                box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: lightpink;");
                            }
                        }
                    });
                }

                if(column==8 && row!=0) {
                    box.focusedProperty().addListener(new ChangeListener<Boolean>()
                    {
                        @Override
                        public void changed(ObservableValue<? extends Boolean> arg0, Boolean oldPropertyValue, Boolean newPropertyValue)
                        {
                            if ( value8.getText().toLowerCase().contains(box.getText().toLowerCase()) && box.getText()!="," && box.getText().length()==1)
                            {
                                box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: lightgreen;");
                            }
                            else
                            {
                                box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: lightpink;");
                            }
                        }
                    });
                }

                if(column==9 && row!=0) {
                    box.focusedProperty().addListener(new ChangeListener<Boolean>()
                    {
                        @Override
                        public void changed(ObservableValue<? extends Boolean> arg0, Boolean oldPropertyValue, Boolean newPropertyValue)
                        {
                            if ( value9.getText().toLowerCase().contains(box.getText().toLowerCase()) && box.getText()!="," && box.getText().length()==1)
                            {
                                box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: lightgreen;");
                            }
                            else
                            {
                                box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: lightpink;");
                            }
                        }
                    });
                }

                if(column==B && row!=0) {
                    box.focusedProperty().addListener(new ChangeListener<Boolean>()
                    {
                        @Override
                        public void changed(ObservableValue<? extends Boolean> arg0, Boolean oldPropertyValue, Boolean newPropertyValue)
                        {
                            if ( valueY.getText().toLowerCase().contains(box.getText().toLowerCase()) && box.getText()!="," && box.getText().length()==1)
                            {
                                box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: lightgreen;");
                            }
                            else
                            {
                                box.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: lightpink;");
                            }
                        }
                    });
                }

                grid.add(box,column,row);
            }


        }
        Button btn = new Button("CALCULATE!");
        btn.setStyle("-fx-text-box-border: Black; -fx-focus-color: Black; -fx-background-color: RED;");;
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
               int count=0;
                for(int red=1; red<n; red++) {

                    for(int kolona=0; kolona<B; kolona++) {
                       if( CountRow(red,kolona,grid)) {
                           count++;

                       }
                      //  System.out.println(count);
                       }
                }




                nova.close();
            }

        });
        grid.add(btn,n+1,B+1);
        nova.setScene(new Scene(grid));
        nova.show();

    }


    public boolean CountRow( int row, int column,GridPane gridPane) {


        ObservableList<Node> childrens = gridPane.getChildren();
        for(Node node : childrens) {
            if(node instanceof TextField && gridPane.getRowIndex(node) == row && gridPane.getColumnIndex(node) == column) {
                TextField textField= (TextField) node; // use what you want to remove
                System.out.println(textField.getText().toString());
                if(textField.getText().equals("PROBA")) return  true;
            }
        }
 return false;
    }
}





