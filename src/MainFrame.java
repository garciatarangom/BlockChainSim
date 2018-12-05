import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class MainFrame extends JFrame {

    {
        this.setSize(500, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.init();
    } //end initializer

    Lista registros = new Lista();


    public MainFrame() {
        init();
    } //end MainFrame constructor

    private void init() {
        JPanel panel = new JPanel(new GridLayout(0, 2));
        JLabel name = new JLabel("NAME");
        name.setHorizontalAlignment(JLabel.CENTER);
        panel.add(name);
        JTextField namefield = new JTextField();
        panel.add(namefield);
        JLabel password = new JLabel("PASSWORD");
        password.setHorizontalAlignment(JLabel.CENTER);
        panel.add(password);
        JPasswordField passfield = new JPasswordField();
        panel.add(passfield);
        JLabel bitcoins = new JLabel("BITCOINS");
        bitcoins.setHorizontalAlignment(JLabel.CENTER);
        panel.add(bitcoins);
        JTextField bitfield = new JTextField();
        panel.add(bitfield);
        JButton save = new JButton("SAVE");
        panel.add(save);
        this.setContentPane(panel);
        Action saveAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Registro nuevoRegistro = new Registro(namefield.getText(),String.valueOf(passfield.getPassword()), Double.parseDouble(bitfield.getText()));
                System.out.println (nuevoRegistro.toSHA1());
                registros.addRegistro(nuevoRegistro); //agregar nuevo objeto registro a la lista
                System.out.println("#####REGISTROS#########");
                System.out.println(registros.toString()); //Imprimir la lista de registros
                namefield.setText("");
                passfield.setText("");
                bitfield.setText("");
            } //end actionPerformed
        }; //end saveAction
        save.addActionListener(saveAction);
    } //end init
}
