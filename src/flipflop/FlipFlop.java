/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flipflop;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Daniel
 */
public class FlipFlop extends Application {

    @Override
    public void start(Stage primaryStage) {
        //CREATE ALL CARDS;
        ArrayList<Card> cards = new ArrayList<>();
        Image pikachu = new Image("pikachu.jpg");
        Card pika = new Card("Pikachu", pikachu, 0, 0);
        cards.add(pika);
        Button btn = new Button();
        btn.setText("Start Game");
        StackPane root = new StackPane();

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Started game!");
                ImageView iv1 = new ImageView();
                iv1.setImage(pika.getCurrentImg());
                iv1.setFitWidth(150);
                iv1.setPreserveRatio(true);
                iv1.setSmooth(true);
                iv1.setCache(true);

                iv1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

                    @Override
                    public void handle(MouseEvent event) {
                        // Check all cards, if match, leave both clicked. //card1 card2 etc.
                        //else flip them again
                        pika.flip();
                        System.out.println("flip");
                        iv1.setImage(pika.getCurrentImg());
                        event.consume();
                    }
                });

                HBox box = new HBox();
                box.getChildren().add(iv1);
                root.getChildren().add(box);

                //primaryStage.setScene(scene2);
                primaryStage.show();

            }
        });

        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
