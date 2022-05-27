package sample;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import java.lang.reflect.Field;
public class Controller {
    public Button btnMain;
    public TextField promien;
    public TextField wysokosc;
    public TextField grubosc;
    public Label wynik;

    public void onBtnAction(ActionEvent actionEvent) {
        double r = Double.parseDouble(promien.getText());
        double h = Double.parseDouble(wysokosc.getText());
        double g = Double.parseDouble(grubosc.getText());

        System.out.print("Promien: " + promien.getText() + "\n" + "Wysokosc: " +  wysokosc.getText()+ "\n" + "Grubosc: " +  grubosc.getText() + "\n");
        //(2 * Math.PI * (r + g)  * h) - (2 * Math.PI * r * h)
        double wynikObj = (Math.PI * Math.pow((r + g),2)  * h) - (Math.PI * Math.pow(r,2) * h);
        wynik.setText("Cena walca z blachy: " + String.format("%.2f", wynikObj * 2)  +"zł" + "\nCena z blachy stalowej nierdzewnej: " + String.format("%.2f", wynikObj * 3) + "zł");
    }
}
