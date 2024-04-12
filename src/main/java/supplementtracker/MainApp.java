
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import supplementtracker.ui.MainUI;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        MainUI mainUI = new MainUI();
        primaryStage.setTitle("Personal Supplements Tracker");
        primaryStage.setScene(new Scene(mainUI, 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
