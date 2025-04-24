package pe.edu.upeu.tresenraya.control;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pe.edu.upeu.tresenraya.modelo.TresEnRayaTO;
import java.util.List;

@Controller
public class    tresEnRayaControl {
    String jugador1;
    String jugador2;
    int indexID = 1;
    boolean circulo = true;

    //@Autowired
    //tresEnRayaControl tresEnRayaControl;

    @FXML
    Label label_turno;

    @FXML
    TableView<TresEnRayaTO> tableView;
    private ObservableList<TresEnRayaTO> datos;
    List<TresEnRayaTO> lista;

    @FXML
    TableColumn<TresEnRayaTO, String> partidox;

    @FXML
    TableColumn<TresEnRayaTO, String> jugador1x;

    @FXML
    TableColumn<TresEnRayaTO, String> jugador2x;

    @FXML
    TableColumn<TresEnRayaTO, String> ganadorx;

    @FXML
    TableColumn<TresEnRayaTO, String> puntuacionx;

    @FXML
    TableColumn<TresEnRayaTO, String> estadox;

    @FXML
    Button btn1_1;

    @FXML
    Button btn1_2;

    @FXML
    Button btn1_3;

    @FXML
    Button btn2_1;

    @FXML
    Button btn2_2;

    @FXML
    Button btn2_3;

    @FXML
    Button btn3_1;

    @FXML
    Button btn3_2;

    @FXML
    Button btn3_3;

    @FXML
    private TextField txt_jugador1;

    @FXML
    private TextField txt_jugador2;

    @FXML
    Label label_aviso;

    @FXML
    Button btn_iniciar;

    @FXML
    private void initialize() {
        btn_iniciar.setDisable(false);
        btn1_1.setDisable(true);
        btn1_2.setDisable(true);
        btn1_3.setDisable(true);
        btn2_1.setDisable(true);
        btn2_2.setDisable(true);
        btn2_3.setDisable(true);
        btn3_1.setDisable(true);
        btn3_2.setDisable(true);
        btn3_3.setDisable(true);

    }

    private void btnIniciar() {
        jugador1 = txt_jugador1.getText();
        label_turno.setText(jugador1);
        jugador2 = txt_jugador2.getText();
        btn1_1.setDisable(false);
        btn1_2.setDisable(false);
        btn1_3.setDisable(false);
        btn2_1.setDisable(false);
        btn2_2.setDisable(false);
        btn2_3.setDisable(false);
        btn3_1.setDisable(false);
        btn3_2.setDisable(false);
        btn3_3.setDisable(false);
        btn_iniciar.setDisable(true);
        //txt_jugador1.setText("");
        //txt_jugador2.setText("");
    }

    private void btnAnular() {
        btn1_1.setText("1");
        btn1_1.setStyle("-fx-text-fill: transparent;");
        btn1_2.setText("2");
        btn1_2.setStyle("-fx-text-fill: transparent;");
        btn1_3.setText("3");
        btn1_3.setStyle("-fx-text-fill: transparent;");
        btn2_1.setText("4");
        btn2_1.setStyle("-fx-text-fill: transparent;");
        btn2_2.setText("5");
        btn2_2.setStyle("-fx-text-fill: transparent;");
        btn2_3.setText("6");
        btn2_3.setStyle("-fx-text-fill: transparent;");
        btn3_1.setText("7");
        btn3_1.setStyle("-fx-text-fill: transparent;");
        btn3_2.setText("8");
        btn3_2.setStyle("-fx-text-fill: transparent;");
        btn3_3.setText("9");
        btn3_3.setStyle("-fx-text-fill: transparent;");
        initialize();

    }

    private void btn_1_1() {
        if (btn1_1.getText().equals("1")) {
            if (circulo) {
                btn1_1.setText("O");
                btn1_1.setStyle("-fx-font-size: 36px;-fx-text-fill: red");
                circulo = false;
            } else {
                btn1_1.setText("X");
                btn1_1.setStyle("-fx-font-size: 36px;-fx-text-fill: blue");
                circulo = true;
            }
            if (label_turno.getText().equals(jugador1)) {
                label_turno.setText(jugador2);
            } else if (label_turno.getText().equals(jugador2)) {
                label_turno.setText(jugador1);
            }
            ganar();
        }
    }
    private void btn_1_2(){
        if (btn1_2.getText().equals("2")) {
            if (circulo) {
                btn1_2.setText("O");
                btn1_2.setStyle("-fx-font-size: 36px;-fx-text-fill: red");
                circulo = false;
            } else {
                btn1_2.setText("X");
                btn1_2.setStyle("-fx-font-size: 36px;-fx-text-fill: blue");
                circulo = true;
            }
            if (label_turno.getText().equals(jugador1)) {
                label_turno.setText(jugador2);
            } else if (label_turno.getText().equals(jugador2)) {
                label_turno.setText(jugador1);
            }
            ganar();
        }
    }
    private void btn_1_3(){
        if (btn1_3.getText().equals("3")) {
            if (circulo) {
                btn1_3.setText("O");
                btn1_3.setStyle("-fx-font-size: 36px;-fx-text-fill: red");
                circulo = false;
            } else {
                btn1_3.setText("X");
                btn1_3.setStyle("-fx-font-size: 36px;-fx-text-fill: blue");
                circulo = true;
            }
            if (label_turno.getText().equals(jugador1)) {
                label_turno.setText(jugador2);
            } else if (label_turno.getText().equals(jugador2)) {
                label_turno.setText(jugador1);
            }
            ganar();
        }
    }
    private void btn_2_1(){
        if (btn2_1.getText().equals("4")) {
            if (circulo) {
                btn2_1.setText("O");
                btn2_1.setStyle("-fx-font-size: 36px;-fx-text-fill: red");
                circulo = false;
            } else {
                btn2_1.setText("X");
                btn2_1.setStyle("-fx-font-size: 36px;-fx-text-fill: blue");
                circulo = true;
            }
            if (label_turno.getText().equals(jugador1)) {
                label_turno.setText(jugador2);
            } else if (label_turno.getText().equals(jugador2)) {
                label_turno.setText(jugador1);
            }
            ganar();
        }
    }
    private void btn_2_2(){
        if (btn2_2.getText().equals("5")) {
            if (circulo) {
                btn2_2.setText("O");
                btn2_2.setStyle("-fx-font-size: 36px;-fx-text-fill: red");
                circulo = false;
            } else {
                btn2_2.setText("X");
                btn2_2.setStyle("-fx-font-size: 36px;-fx-text-fill: blue");
                circulo = true;
            }
            if (label_turno.getText().equals(jugador1)) {
                label_turno.setText(jugador2);
            } else if (label_turno.getText().equals(jugador2)) {
                label_turno.setText(jugador1);
            }
            ganar();
        }
    }
    private void btn_2_3(){
        if (btn2_3.getText().equals("6")) {
            if (circulo) {
                btn2_3.setText("O");
                btn2_3.setStyle("-fx-font-size: 36px;-fx-text-fill: red");
                circulo = false;
            } else {
                btn2_3.setText("X");
                btn2_3.setStyle("-fx-font-size: 36px;-fx-text-fill: blue");
                circulo = true;
            }
            if (label_turno.getText().equals(jugador1)) {
                label_turno.setText(jugador2);
            } else if (label_turno.getText().equals(jugador2)) {
                label_turno.setText(jugador1);
            }
            ganar();
        }
    }
    private void btn_3_1(){
        if (btn3_1.getText().equals("7")) {
            if (circulo) {
                btn3_1.setText("O");
                btn3_1.setStyle("-fx-font-size: 36px;-fx-text-fill: red");
                circulo = false;
            } else {
                btn3_1.setText("X");
                btn3_1.setStyle("-fx-font-size: 36px;-fx-text-fill: blue");
                circulo = true;
            }
            if (label_turno.getText().equals(jugador1)) {
                label_turno.setText(jugador2);
            } else if (label_turno.getText().equals(jugador2)) {
                label_turno.setText(jugador1);
            }
            ganar();
        }
    }
    private void btn_3_2(){
        if (btn3_2.getText().equals("8")) {
            if (circulo) {
                btn3_2.setText("O");
                btn3_2.setStyle("-fx-font-size: 36px;-fx-text-fill: red");
                circulo = false;
            } else {
                btn3_2.setText("X");
                btn3_2.setStyle("-fx-font-size: 36px;-fx-text-fill: blue");
                circulo = true;
            }
            if (label_turno.getText().equals(jugador1)) {
                label_turno.setText(jugador2);
            } else if (label_turno.getText().equals(jugador2)) {
                label_turno.setText(jugador1);
            }
            ganar();
        }
    }
    private void btn_3_3(){
        if (btn3_3.getText().equals("9")) {
            if (circulo) {
                btn3_3.setText("O");
                btn3_3.setStyle("-fx-font-size: 36px;-fx-text-fill: red");
                circulo = false;
            } else {
                btn3_3.setText("X");
                btn3_3.setStyle("-fx-font-size: 36px;-fx-text-fill: blue");
                circulo = true;
            }
            if (label_turno.getText().equals(jugador1)) {
                label_turno.setText(jugador2);
            } else if (label_turno.getText().equals(jugador2)) {
                label_turno.setText(jugador1);
            }
            ganar();
        }
    }
    private void ganar(){
            if (btn1_1.getText().equals(btn1_2.getText()) && btn1_2.getText().equals(btn1_3.getText())) {
                label_turno.setText("Ganador");
            } else if (btn2_1.getText().equals(btn2_2.getText()) && btn2_2.getText().equals(btn2_3.getText())) {
                label_turno.setText("Ganador");
            } else if (btn3_1.getText().equals(btn3_2.getText()) && btn3_2.getText().equals(btn3_3.getText())) {
                label_turno.setText("Ganador");
            } else if (btn1_1.getText().equals(btn2_1.getText()) && btn2_1.getText().equals(btn3_1.getText())) {
                label_turno.setText("Ganador");
            } else if (btn1_2.getText().equals(btn2_2.getText()) && btn2_2.getText().equals(btn3_2.getText())) {
                label_turno.setText("Ganador");
            } else if (btn1_3.getText().equals(btn2_3.getText()) && btn2_3.getText().equals(btn3_3.getText())) {
                label_turno.setText("Ganador");
            } else if (btn1_1.getText().equals(btn2_2.getText()) && btn2_2.getText().equals(btn3_3.getText())) {
                label_turno.setText("Ganador");
            } else if (btn1_3.getText().equals(btn2_2.getText()) && btn2_2.getText().equals(btn3_1.getText())) {
                label_turno.setText("Ganador");
            }


    }

    @FXML
    private void controlClick(ActionEvent event) {
        Button boton = (Button) event.getSource();
        switch (boton.getId()) {
            case "btn_iniciar":
                if(txt_jugador1.getText() !="" && txt_jugador2.getText() !=""){
                    btnIniciar(); label_aviso.setText("");label_aviso.setStyle("-fx-background-color: transparent;");}
                else{
                    label_aviso.setText(" INGRESAR JUGADORES");
                    label_aviso.setStyle("-fx-text-fill: white; -fx-font-size: 15px; -fx-font-weight: bold;" +
                            "-fx-background-color:red ;");
                }
                break;
            case "btn_anular":
                btnAnular();
                break;
            case "btn1_1":
                btn_1_1();
                break;
            case "btn1_2":
                btn_1_2();
                break;
            case "btn1_3":
                btn_1_3();
                break;
            case "btn2_1":
                btn_2_1();
                break;
            case "btn2_2":
                btn_2_2();
                break;
            case "btn2_3":
                btn_2_3();
                break;
            case "btn3_1":
                btn_3_1();
                break;
            case "btn3_2":
                btn_3_2();
                break;
            case "btn3_3":
                btn_3_3();
                break;

        }
    }

}
