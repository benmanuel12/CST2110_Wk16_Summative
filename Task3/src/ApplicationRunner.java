
import java.awt.Rectangle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class ApplicationRunner extends Application {
    
    //private IntegerProperty hallOpacity = new SimpleIntegerProperty(0);

    @Override
    public void start(Stage primaryStage) {

        // ------------------------ Main Pane ----------------------------------
        primaryStage.setTitle("SmartPad App");

        GridPane mainPane = new GridPane();
        GridPane lightingPane = new GridPane();
        GridPane heatingPane = new GridPane();
        GridPane CCTVPane = new GridPane();
        mainPane.setPadding(new Insets(10, 10, 10, 10));
        lightingPane.setPadding(new Insets(10, 10, 10, 10));
        heatingPane.setPadding(new Insets(10, 10, 10, 10));
        CCTVPane.setPadding(new Insets(10, 10, 10, 10));

        mainPane.setMargin(lightingPane, new Insets(0, 5, 5, 0));
        mainPane.setMargin(heatingPane, new Insets(5, 5, 0, 0));
        mainPane.setMargin(CCTVPane, new Insets(0, 5, 0, 5));

        lightingPane.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, new CornerRadii(5), BorderWidths.DEFAULT)));
        heatingPane.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, new CornerRadii(5), BorderWidths.DEFAULT)));
        CCTVPane.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, new CornerRadii(5), BorderWidths.DEFAULT)));

        mainPane.add(lightingPane, 0, 0);
        mainPane.add(heatingPane, 0, 1);
        mainPane.add(CCTVPane, 1, 0);
        mainPane.setRowSpan(CCTVPane, 2);

        // ------------------------ Lighting Pane ------------------------------
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
        hallSlider.setBlockIncrement(0.001);
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

        Circle hallCircle = new Circle(7.5, 0, 10, javafx.scene.paint.Color.ORANGE);
        Circle kitchenCircle = new Circle(7.5, 25, 10, javafx.scene.paint.Color.ORANGE);
        Circle livingRoomCircle = new Circle(7.5, 50, 10, javafx.scene.paint.Color.ORANGE);
        Circle diningRoomCircle = new Circle(7.5, 75, 10, javafx.scene.paint.Color.ORANGE);
        Circle landingCircle = new Circle(7.5, 100, 10, javafx.scene.paint.Color.ORANGE);
        Circle bedroom1Circle = new Circle(7.5, 125, 10, javafx.scene.paint.Color.ORANGE);
        Circle bedroom2Circle = new Circle(7.5, 150, 10, javafx.scene.paint.Color.ORANGE);

        circleGroup.getChildren().addAll(hallCircle, kitchenCircle, livingRoomCircle, diningRoomCircle, landingCircle, bedroom1Circle, bedroom2Circle);
        lightingPane.add(circleGroup, 2, 1);
        lightingPane.setRowSpan(circleGroup, 7);

        lightingPane.getRowConstraints().add(new RowConstraints(25));
        lightingPane.getRowConstraints().add(new RowConstraints(25));
        lightingPane.getRowConstraints().add(new RowConstraints(25));
        lightingPane.getRowConstraints().add(new RowConstraints(25));
        lightingPane.getRowConstraints().add(new RowConstraints(25));
        lightingPane.getRowConstraints().add(new RowConstraints(25));
        lightingPane.getRowConstraints().add(new RowConstraints(25));
        lightingPane.getRowConstraints().add(new RowConstraints(25));
        
        hallSlider.valueProperty().addListener(
        (observable, oldvalue, newvalue) ->
        {
            double i = newvalue.doubleValue();
            hallCircle.setFill(Color.hsb(74.0, 0.19, i));
        });
        
        kitchenSlider.valueProperty().addListener(
        (observable, oldvalue, newvalue) ->
        {
            double i = newvalue.doubleValue();
            kitchenCircle.setFill(Color.hsb(74.0, 0.19, i));
        });
        
        livingRoomSlider.valueProperty().addListener(
        (observable, oldvalue, newvalue) ->
        {
            double i = newvalue.doubleValue();
            livingRoomCircle.setFill(Color.hsb(74.0, 0.19, i));
        });
        
        diningRoomSlider.valueProperty().addListener(
        (observable, oldvalue, newvalue) ->
        {
            double i = newvalue.doubleValue();
            diningRoomCircle.setFill(Color.hsb(74.0, 0.19, i));
        });
        
        landingSlider.valueProperty().addListener(
        (observable, oldvalue, newvalue) ->
        {
            double i = newvalue.doubleValue();
            landingCircle.setFill(Color.hsb(74.0, 0.19, i));
        });
        
        bedroom1Slider.valueProperty().addListener(
        (observable, oldvalue, newvalue) ->
        {
            double i = newvalue.doubleValue();
            bedroom1Circle.setFill(Color.hsb(74.0, 0.19, i));
        });
        
        bedroom2Slider.valueProperty().addListener(
        (observable, oldvalue, newvalue) ->
        {
            double i = newvalue.doubleValue();
            bedroom2Circle.setFill(Color.hsb(74.0, 0.19, i));
        });
        
        //----------------------- Heating Pane ---------------------------------
        Label heatingTitle = new Label();
        heatingTitle.setText("Central Heating");
        heatingTitle.setFont(Font.font("Droid Sans", FontWeight.BOLD, 12));
        heatingPane.add(heatingTitle, 0, 0);

        ToggleGroup radioGroup = new ToggleGroup();

        RadioButton offButton = new RadioButton("Off");
        offButton.setToggleGroup(radioGroup);
        heatingPane.add(offButton, 0, 1);
        RadioButton autoButton = new RadioButton("Auto");
        autoButton.setToggleGroup(radioGroup);
        heatingPane.add(autoButton, 0, 2);
        RadioButton onceButton = new RadioButton("Once");
        onceButton.setToggleGroup(radioGroup);
        heatingPane.add(onceButton, 0, 3);
        RadioButton contButton = new RadioButton("Cont");
        contButton.setToggleGroup(radioGroup);
        heatingPane.add(contButton, 0, 4);

        Slider heatingSlider = new Slider(0.0, 30.0, 5);
        heatingSlider.setShowTickLabels(true);
        heatingSlider.setShowTickMarks(true);
        heatingSlider.setMajorTickUnit(5);
        heatingSlider.setBlockIncrement(5);
        heatingSlider.setOrientation(Orientation.VERTICAL);

        heatingPane.add(heatingSlider, 1, 1);
        heatingPane.setRowSpan(heatingSlider, 4);

        TextArea heatingText = new TextArea();
        heatingText.setText("20.0");
        heatingText.setFont(Font.font("Verdana", 20));
        heatingText.setPrefHeight(50);
        heatingText.setPrefWidth(100);

        heatingPane.add(heatingText, 2, 2);
        heatingPane.setRowSpan(heatingText, 2);

        heatingPane.getRowConstraints().add(new RowConstraints(35)); // column 0 is 100 wide
        heatingPane.getRowConstraints().add(new RowConstraints(35));
        heatingPane.getRowConstraints().add(new RowConstraints(35));
        heatingPane.getRowConstraints().add(new RowConstraints(35));
        heatingPane.getRowConstraints().add(new RowConstraints(35));

        heatingPane.getColumnConstraints().add(new ColumnConstraints(100));
        heatingPane.getColumnConstraints().add(new ColumnConstraints(100));

        heatingText.textProperty().bind(
                Bindings.format(
                        "%.1f",
                        heatingSlider.valueProperty()
                )
        );

        // --------------------------- CCTV Pane -------------------------------
        Label CCTVTitle = new Label();

        CCTVTitle.setText(
                "CCTV");
        CCTVTitle.setFont(Font.font("Droid Sans", FontWeight.BOLD, 12));
        CCTVPane.add(CCTVTitle,
                0, 0);
        try {
            Image front = new Image(new FileInputStream("images/front.jpg"));
            Image back = new Image(new FileInputStream("images/back.jpg"));
            Image side = new Image(new FileInputStream("images/side.jpg"));
            Image drive = new Image(new FileInputStream("images/drive.jpg"));
            Image mute = new Image(new FileInputStream("images/mute-screen.gif"));

            ImageView frontView = new ImageView(front);
            ImageView backView = new ImageView(back);
            ImageView sideView = new ImageView(side);
            ImageView driveView = new ImageView(drive);

            Group frontGroup = new Group(frontView);
            Group backGroup = new Group(backView);
            Group sideGroup = new Group(sideView);
            Group driveGroup = new Group(driveView);

            CCTVPane.add(frontGroup, 0, 1);
            CCTVPane.add(backGroup, 1, 1);
            CCTVPane.add(sideGroup, 0, 2);
            CCTVPane.add(driveGroup, 1, 2);

            HBox buttonBar = new HBox();

            ToggleGroup buttonGroup = new ToggleGroup();

            ToggleButton frontButton = new ToggleButton("Front");
            ToggleButton backButton = new ToggleButton("Back");
            ToggleButton sideButton = new ToggleButton("Side");
            ToggleButton driveButton = new ToggleButton("Drive");

            HBox.setMargin(frontButton, new Insets(30, 10, 10, 10));
            HBox.setMargin(backButton, new Insets(30, 10, 10, 10));
            HBox.setMargin(sideButton, new Insets(30, 10, 10, 10));
            HBox.setMargin(driveButton, new Insets(30, 10, 10, 10));

            buttonBar.setAlignment(Pos.CENTER);

            frontButton.setToggleGroup(buttonGroup);
            backButton.setToggleGroup(buttonGroup);
            sideButton.setToggleGroup(buttonGroup);
            driveButton.setToggleGroup(buttonGroup);

            frontButton.setOnAction(new EventHandler<ActionEvent>() {
                public void handle(ActionEvent event) {
                    if (frontButton.isSelected()) {
                        frontView.setImage(mute);
                    } else {
                        frontView.setImage(front);
                    }
                }
            });

            backButton.setOnAction(new EventHandler<ActionEvent>() {
                public void handle(ActionEvent event) {
                    if (backButton.isSelected()) {
                        backView.setImage(mute);
                    } else {
                        backView.setImage(back);
                    }
                }
            });

            sideButton.setOnAction(new EventHandler<ActionEvent>() {
                public void handle(ActionEvent event) {
                    if (sideButton.isSelected()) {
                        sideView.setImage(mute);
                    } else {
                        sideView.setImage(side);
                    }
                }
            });

            driveButton.setOnAction(new EventHandler<ActionEvent>() {
                public void handle(ActionEvent event) {
                    if (driveButton.isSelected()) {
                        driveView.setImage(mute);
                    } else {
                        driveView.setImage(drive);
                    }
                }
            });

            buttonBar.getChildren().addAll(frontButton, backButton, sideButton, driveButton);

            CCTVPane.add(buttonBar, 0, 3);
            CCTVPane.setColumnSpan(buttonBar, 2);

        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }

        StackPane root = new StackPane();

        root.getChildren()
                .add(mainPane);
        primaryStage.setScene(
                new Scene(root, 750, 450));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
