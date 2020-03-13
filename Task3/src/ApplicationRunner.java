
import java.awt.Rectangle;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
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
        //hallSlider.setShowTickLabels(true);
        //hallSlider.setShowTickMarks(true);
        //hallSlider.setMajorTickUnit(0.1);
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
        
        Group circleGroup = new Group();
        
        Circle hallCircle = new Circle(5, 0, 7.5, javafx.scene.paint.Color.ORANGE);
        Circle kitchenCircle = new Circle(5, 18, 7.5, javafx.scene.paint.Color.ORANGE);
        Circle livingRoomCircle = new Circle(5, 36, 7.5, javafx.scene.paint.Color.ORANGE);
        Circle diningRoomCircle = new Circle(5, 54, 7.5, javafx.scene.paint.Color.ORANGE);
        Circle landingCircle = new Circle(5, 72, 7.5, javafx.scene.paint.Color.ORANGE);
        Circle bedroom1Circle = new Circle(5, 90, 7.5, javafx.scene.paint.Color.ORANGE);
        Circle bedroom2Circle = new Circle(5, 110, 7.5, javafx.scene.paint.Color.ORANGE);
        
        
        circleGroup.getChildren().addAll(hallCircle, kitchenCircle, livingRoomCircle, diningRoomCircle, landingCircle, bedroom1Circle, bedroom2Circle);
        lightingPane.add(circleGroup, 2, 1);
        lightingPane.setRowSpan(circleGroup, 7);
        
        
        Label heatingTitle = new Label();
        heatingTitle.setText("Central Heating");
        heatingTitle.setFont(Font.font("Droid Sans", FontWeight.BOLD, 12));
        heatingPane.add(heatingTitle, 0, 0);
        
        RadioButton offButton = new RadioButton("Off");
        heatingPane.add(offButton, 0, 1);
        RadioButton autoButton = new RadioButton("Auto");
        heatingPane.add(autoButton, 0, 2);
        RadioButton onceButton = new RadioButton("Once");
        heatingPane.add(onceButton, 0, 3);
        RadioButton contButton = new RadioButton("Cont");
        heatingPane.add(contButton, 0, 4);
        
        CustomButton btn3 = new CustomButton("Hi", 200, 200);
        
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
