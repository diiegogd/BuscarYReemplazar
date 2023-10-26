package dad.byr;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class BuscarYReemplazar extends Application {

    // Declaración de variables para los elementos de la interfaz
    private Label buscarLabel, reemplazarLabel;
    private TextField buscarTextField, reemplazarTextField;
    private CheckBox checkBox1, checkBox2, checkBox3, checkBox4;
    private Button buscarButton, remplazarButton, remplazartodoButton, cerrarButton, ayudaButton;

    @Override
    public void start(Stage primaryStage) {

        // Inicialización de los elementos de la interfaz
        buscarLabel = new Label("Buscar:");
        buscarTextField = new TextField();
        reemplazarLabel = new Label("Reemplazar con:");
        reemplazarTextField = new TextField();
        checkBox1 = new CheckBox("Mayúsculas y minúsculas");
        checkBox2 = new CheckBox("Buscar hacia atrás");
        checkBox3 = new CheckBox("Expresión regular");
        checkBox4 = new CheckBox("Resaltar resultados");
        buscarButton = new Button("Buscar");
        remplazarButton = new Button("Remplazar");
        remplazartodoButton = new Button("Remplazar todo");
        cerrarButton = new Button("Cerrar");
        ayudaButton = new Button("Ayuda");

        // Configuración de tamaños de los botones
        buscarButton.setMinWidth(100);
        remplazarButton.setMinWidth(100);
        remplazartodoButton.setMinWidth(100);
        cerrarButton.setMinWidth(100);
        ayudaButton.setMinWidth(100);

        // Creación de un GridPane para organizar los elementos en una cuadrícula
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Agregar los elementos al GridPane
        gridPane.add(buscarLabel, 0, 0);
        gridPane.add(buscarTextField, 1, 0);
        gridPane.add(reemplazarLabel, 0, 1);
        gridPane.add(reemplazarTextField, 1, 1);

        // Creación de casillas de verificación y configuración de su disposición
        VBox checkBoxesBox = new VBox(5, checkBox1, checkBox3);
        checkBoxesBox.setAlignment(Pos.CENTER_LEFT);
        checkBoxesBox.setPadding(new Insets(10, 0, 0, 0));

        VBox checkBoxesBox2 = new VBox(5, checkBox2, checkBox4);
        checkBoxesBox2.setAlignment(Pos.CENTER_LEFT);
        checkBoxesBox2.setPadding(new Insets(10, 0, 0, 0));

        HBox checkBoxesContainer = new HBox(checkBoxesBox, checkBoxesBox2);
        gridPane.add(checkBoxesContainer, 1, 2);

        // Creación de VBox para organizar los botones y configuración de su disposición
        VBox botonesBox = new VBox(5, buscarButton, remplazarButton, remplazartodoButton, cerrarButton, ayudaButton);
        botonesBox.setAlignment(Pos.TOP_RIGHT);
        botonesBox.setPadding(new Insets(10));

        // Creación del contenedor principal y adición de los componentes
        HBox root = new HBox(gridPane, botonesBox);

        // Creación de la escena y configuración del escenario principal
        Scene scene = new Scene(root, 540, 230);
        primaryStage.setTitle("Buscar y reemplazar");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}