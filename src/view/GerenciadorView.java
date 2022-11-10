package view;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class GerenciadorView {
    
    private static final int LARGURA = 800;
    private static final int ALTURA = 700;
    private AnchorPane mainPane;
    private Scene mainScene;
    private Stage mainStage;
    
    
    public GerenciadorView(){
        mainPane = new AnchorPane();
        mainScene = new Scene(mainPane,ALTURA,LARGURA);
        mainStage = new Stage();
        mainStage.setScene(mainScene);
    }
    
    public Stage getMainStage(){
        return mainStage;
    }
    
}
