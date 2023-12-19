/**
 * The TextAnalysisGUI class represents a graphical user interface for text analysis.
 * It provides text input, analysis functionality, and output display.
 * The class implements the ActionListener interface to handle button clicks.
 * 
 * @author Balkarn Gill
 */
import javax.swing.*;
import java.awt.event.*;

public class TextAnalysisGUI implements ActionListener {
    private JTextArea input;
    private JTextArea output;
    private JButton analyze;
    private JButton clear;

    /**
     * Constructs a TextAnalysisGUI object and initializes the GUI components.
     */
    public TextAnalysisGUI() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        
        this.input = new JTextArea(10, 40);
        this.output = new JTextArea(10, 40);
        this.analyze = new JButton("Analyze");
        this.clear = new JButton("Clear");

        this.analyze.addActionListener(this);
        this.clear.addActionListener(this);
        
        panel.add(input);
        panel.add(analyze);
        panel.add(clear);
        panel.add(output);
        
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    /**
     * The entry point of the application.
     * Creates an instance of TextAnalysisGUI to start the GUI.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        new TextAnalysisGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == analyze) {
            TextAnalyzer analyzer = new TextAnalyzer(input.getText());
            output.setText(analyzer.toString());
        }
        
        if (e.getSource() == clear) {
            input.setText("");
            output.setText("");
        }
    }
}
