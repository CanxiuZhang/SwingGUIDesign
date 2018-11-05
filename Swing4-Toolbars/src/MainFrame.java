import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	private TextPanel textPanel;
	private JButton btn;
	
	public MainFrame() {
		super("hello world");
		
		setLayout(new BorderLayout());
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		btn = new JButton("click me");
		textPanel = new TextPanel();
		
		add(textPanel, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// add text to the TextArea in the panel method
				textPanel.AppendText("Hello\n");
			}
			
		});
		
		
	}
}
