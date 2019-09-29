package dad.javafx.holamundo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HolaMundoMejoradoApp extends Application {
	
	private Label saludoLabel;
	private Button saludarButton;
	private TextField nombreText;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		nombreText=new TextField();
		nombreText.setMaxWidth(150);
		nombreText.setPromptText("Introduce un nombre: ");
		
		saludarButton = new Button("Saludar");
		saludarButton.setDefaultButton(true);
		saludarButton.setOnAction(e -> onSaludarButtonAction(e));
		
		saludoLabel=new Label("Aquí saldrá el saludo");
		saludoLabel.setWrapText(true);
		//Wraptext hace que si el texto que se esta mostrando excede el ancho de la ventana, no se pongan puntos suspensivos
		//sino que salte de linea y siga mostrando
		
		VBox root = new VBox();
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(nombreText,saludarButton,saludoLabel);
		
		
		
		Scene scene = new Scene(root, 320,200);
		
		primaryStage.setTitle("HolaMundoFX");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

	private void onSaludarButtonAction(ActionEvent e) {
		// TODO Auto-generated method stub
		String nombre = nombreText.getText();
		saludoLabel.setText("¡Hola "+nombre+"!");
		saludoLabel.setStyle("-fx-text-fill: blue; -fx-font: italic bold 30 sans-serif;");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}


}


