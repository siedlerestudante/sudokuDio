package sudoku.projeto.dio.ui.custom.buttom;

import javax.swing.*;
import java.awt.event.ActionListener;

public class FinishGameButton extends JButton {

    public FinishGameButton(final ActionListener actionListener){
        this.setText("Conluir");
        this.addActionListener(actionListener);
    }

}
