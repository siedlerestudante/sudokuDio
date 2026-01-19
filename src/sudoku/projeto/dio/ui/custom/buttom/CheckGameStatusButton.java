package sudoku.projeto.dio.ui.custom.buttom;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CheckGameStatusButton extends JButton {

    public CheckGameStatusButton(final ActionListener actionListener){
        this.setText("verificar jogo");
        this.addActionListener(actionListener);
    }
}
