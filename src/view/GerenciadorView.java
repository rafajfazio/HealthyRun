package view;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

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
        criarBotoes();
    }
    
    public Stage getMainStage(){
        return mainStage;
    }
    
    private void criarBotoes(){
        
        Button botao = new Button();
        mainPane.getChildren().add(botao);
        
        botao.setOnMouseEntered(new EventHandler<Event>() {
            @Override
            public void handle(Event event){
                System.out.println("MOUSE ENTERED");
            }
        });
        
    }
    
}
