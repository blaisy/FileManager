import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GUI implements ActionListener {
    private int clicks = 0;
    private JLabel label = new JLabel("Apertura File Manager:  0     ");
    private JFrame frame = new JFrame();
    private File file;
    private Desktop desktop;
    public GUI() throws IOException {

        // BOTTONE CLICCABILE
        JButton button = new JButton("Apri");
        button.addActionListener(this);

        // PANEL BOTTONE E TESTO
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);
        

        // setup display
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);
    }

    // action di button
    public void actionPerformed(ActionEvent e) {
        //clicks++;
        //label.setText("Numero di clicks:  " + clicks);
        //aperura del file al click
        file = new File("C:\\Users\\Utente\\OneDrive\\Desktop");
        desktop = Desktop.getDesktop();
        try {
            desktop.open(file);
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // create one Frame
    public static void main(String[] args) {
        new GUI();
    }
}
