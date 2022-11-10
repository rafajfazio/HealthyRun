package app;

import javafx.application.Application;
import javafx.stage.Stage;
import view.GerenciadorView;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage){
        try{
            GerenciadorView gerenciador = new GerenciadorView();
            primaryStage = gerenciador.getMainStage(); 
            
            primaryStage.show();
        }   catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args){
        launch(args);
    }
        
}
