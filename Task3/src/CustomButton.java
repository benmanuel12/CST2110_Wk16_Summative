import javafx.scene.control.Button;

public class CustomButton extends Button {
    public CustomButton(String text, int width, int height) {
        super(text);

        super.setMinSize(width, height);
        super.setMaxSize(width, height);
    }
}