package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ViewController {

	@FXML
	private TextField txtNum1;
	@FXML
	private TextField txtNum2;
	@FXML
	private Label labelResult;
	@FXML
	private Button btSum;
	
	@FXML
	public  void onBtSumAction() {
		try {
			double numero1 = Double.valueOf(txtNum1.getText());
			double numero2 = Double.valueOf(txtNum2.getText());
			double sum = numero1+numero2;
			labelResult.setText(String.format("%.2f",sum));
		}catch(NumberFormatException e) {
			Alerts.showAlert("Aviso",null,"Número inválido informado!", AlertType.WARNING);
		}
	}
}
