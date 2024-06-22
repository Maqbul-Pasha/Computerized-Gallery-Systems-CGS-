import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm_CGS extends JFrame {

    public JPanel mainPanel;
    private JTabbedPane tabbedPanel;
    private JPanel ArtPieceTab;
    private JPanel ArtistTab;
    private JPanel CuratorTab;
    private JLabel curatorId_label;
    private JTextField curatorId_textField;
    private JLabel firstName_label;
    private JTextField firstName_textfield;
    private JTextField lastName_textField;
    private JLabel lastName_label;
    private JTextField commission_textField;
    private JLabel commission_textfield;
    private JButton btnAddCurator;
    private JButton btnAddArtist;
    private JButton btnClear;
    private JTextField txtArtistID;
    private JTextField txtCuratorID;
    private JTextField txtFirstName;
    private JTextField txtLastName;
    private JTextField txtArtPieceID;
    private JButton btnAPClear;
    private JLabel lblArtPieceID;
    private JTextField txtAArtistID;
    private JTextField txtACuratorID;
    private JTextField txtTitle;
    private JTextField txtYear;
    private JTextField txtEstimate;
    private JButton btnAPAdd;
    private JButton btnAPSell;
    private JButton add_artist;

    Gallery gal = new Gallery();

    public MainForm_CGS(){
        setSize(420,420);

        btnAddCurator.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = gal.addCurator(curatorId_textField.getText(),firstName_textfield.getText(),
                                            lastName_textField.getText(), commission_textField.getText());

                JOptionPane.showMessageDialog(null, msg);

            }
        });
        btnAddArtist.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = gal.addArtist(txtArtistID.getText(), txtCuratorID.getText(),
                                            txtFirstName.getText(),txtLastName.getText());
                JOptionPane.showMessageDialog(null, msg);
            }
        });
        btnAPAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = gal.addPiece(txtArtPieceID.getText(),txtAArtistID.getText(),txtACuratorID.getText(),
                                txtTitle.getText(),Double.parseDouble(txtEstimate.getText()),
                                Integer.parseInt(txtYear.getText()));
                JOptionPane.showMessageDialog(null, msg);
            }
        });
        btnAPSell.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SellForm sf = new SellForm(gal);
                sf.setContentPane(sf.sellPanel);
                sf.setVisible(true);
            }
        });
    }
}
