
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;

public class MainUI extends VBox {

    public MainUI() {
        super();
        initialize();
    }

    private void initialize() {
        Label welcomeLabel = new Label("Welcome to the Supplement Tracker");
        this.getChildren().add(welcomeLabel);
    }
}
