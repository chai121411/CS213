package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SongController {
	@FXML Button addButton;
	@FXML Button deleteButton;
	@FXML Button editButton;
	@FXML Button cancelButton;
	@FXML Button saveButton;
	@FXML TextField songName;
	@FXML TextField artist;
	@FXML TextField album;
	@FXML TextField year;
	
	public void convert(ActionEvent e) {
		Button b = (Button)e.getSource();
		if (b == addButton) {
			float fval = Float.valueOf(songName.getText());
			float cval = (fval-32)*5/9;
			artist.setText(String.format("%5.1f", cval));
		} else {
			float cval = Float.valueOf(album.getText());
			float fval = cval*9/5+32;
			year.setText(String.format("%5.1f", fval));
		}
	}
	
}
