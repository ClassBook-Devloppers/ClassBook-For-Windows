import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import java.io.File;
import java.net.MalformedURLException;

public class WebBrowserApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Charger le fichier HTML depuis le dossier src
        File file = new File("src/index.html");
        String localUrl = null;
        try {
            localUrl = file.toURI().toURL().toString();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        // Créer un WebView
        WebView webView = new WebView();
        webView.getEngine().load(localUrl);

        // Créer la scène
        Scene scene = new Scene(webView, 800, 600);

        // Configurer la scène sur la scène principale
        primaryStage.setScene(scene);
        primaryStage.setTitle("Web Browser");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
