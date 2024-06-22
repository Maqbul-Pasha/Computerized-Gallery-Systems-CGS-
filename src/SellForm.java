import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SellForm extends JFrame {
    private JTextField txtSArtPieceID;
    private JTextField txtSPrice;
    private JButton btnSell;
    private JButton clearButton;
    public JPanel sellPanel;

    Gallery gal = new Gallery();

    public SellForm(Gallery gal) {
        setSize(420,420);
        this.gal = gal;
        btnSell.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String msg = gal.sellArtPiece(txtSArtPieceID.getText(), Double.parseDouble(txtSPrice.getText()));
                JOptionPane.showMessageDialog(null, msg);
            }
        });
    }
}
