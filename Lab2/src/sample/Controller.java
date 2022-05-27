package sample;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.lang.reflect.Field;
public class Controller {
    public Button btnMain;
    int clickCounter = 0;
    public TextField txtLicznik;

    public void onBtnAction(ActionEvent actionEvent) {
        System.out.println("Kliknięcie nr " + ++clickCounter);
        if (clickCounter ==1)
            btnMain.setText("I jeszcze raz");
        txtLicznik.setText(String.valueOf(clickCounter));
    }
}
