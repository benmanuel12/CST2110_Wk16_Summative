
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ApplicationRunner extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("SmartPad App");
        
        GridPane mainPane = new GridPane();
        GridPane lightingPane = new GridPane();
        GridPane heatingPane = new GridPane();
        GridPane CCTVPane = new GridPane();
        
        mainPane.add(lightingPane, 0, 0);
        mainPane.add(heatingPane, 0, 1);
        mainPane.add(CCTVPane, 1, 0);
        mainPane.setRowSpan(CCTVPane, 2);
        
        Label lightingTitle = new Label();
        lightingTitle.setText("Lighting");
        lightingTitle.setFont(Font.font("Droid Sans", FontWeight.BOLD, 12));
        lightingPane.add(lightingTitle, 0, 0);
        
        Label hall = new Label();
        hall.setText("Hall:");
        lightingPane.add(hall, 0, 1);
        Label kitchen = new Label();
        kitchen.setText("Kitchen:");
        lightingPane.add(kitchen, 0, 2);
        Label diningRoom = new Label();
        diningRoom.setText("Dining Room:");
        lightingPane.add(diningRoom, 0, 3);
        Label livingRoom = new Label();
        livingRoom.setText("Living Room:");
        lightingPane.add(livingRoom, 0, 4);
        Label landing = new Label();
        landing.setText("Landing:");
        lightingPane.add(landing, 0, 5);
        Label bedroom1 = new Label();
        bedroom1.setText("Bedroom 1:");
        lightingPane.add(bedroom1, 0, 6);
        Label bedroom2 = new Label();
        bedroom2.setText("Bedroom 2:");
        lightingPane.add(bedroom2, 0, 7);
        
        
        Slider hallSlider = new Slider(0, 1, 0.5);
        lightingPane.add(hallSlider, 1, 1);
        Slider kitchenSlider = new Slider(0, 1, 0.5);
        lightingPane.add(kitchenSlider, 1, 2);
        Slider livingRoomSlider = new Slider(0, 1, 0.5);
        lightingPane.add(livingRoomSlider, 1, 3);
        Slider diningRoomSlider = new Slider(0, 1, 0.5);
        lightingPane.add(diningRoomSlider, 1, 4);
        Slider landingSlider = new Slider(0, 1, 0.5);
        lightingPane.add(landingSlider, 1, 5);
        Slider bedroom1Slider = new Slider(0, 1, 0.5);
        lightingPane.add(bedroom1Slider, 1, 6);
        Slider bedroom2Slider = new Slider(0, 1, 0.5);
        lightingPane.add(bedroom2Slider, 1, 7);
        
        
        
        
        CustomButton btn2 = new CustomButton("Hi", 100, 100);
        CustomButton btn3 = new CustomButton("Hi", 200, 200);
        
        heatingPane.add(btn2, 0, 0);
        CCTVPane.add(btn3, 0, 0);
        
        StackPane root = new StackPane();
        root.getChildren().add(mainPane);
        primaryStage.setScene(new Scene(root, 500, 250));
        primaryStage.show();  
    }

    public static void main(String[] args) {
        launch(args);
    }
     
}
