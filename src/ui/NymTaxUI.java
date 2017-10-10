package ui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class NymTaxUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NymTaxUI window = new NymTaxUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NymTaxUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1218, 856);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("NymTax-workspace");
		JScrollPane OutputscrollPane = new JScrollPane();
		OutputscrollPane.setBounds(15, 599, 1168, 189);
		frame.getContentPane().add(OutputscrollPane);
		
		JTextArea OutputArea = new JTextArea();
		OutputscrollPane.setViewportView(OutputArea);
		
		JLabel lblOutput = new JLabel("Output :");
		lblOutput.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblOutput.setBounds(15, 568, 134, 22);
		frame.getContentPane().add(lblOutput);
		
		JScrollPane CodescrollPane = new JScrollPane();
		CodescrollPane.setBounds(15, 77, 1168, 475);
		frame.getContentPane().add(CodescrollPane);
		
		JTextArea CodeArea = new JTextArea();
		CodescrollPane.setViewportView(CodeArea);
		
		JLabel lblCode = new JLabel("Code :");
		lblCode.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCode.setBounds(15, 47, 134, 22);
		frame.getContentPane().add(lblCode);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1196, 31);
		frame.getContentPane().add(menuBar);
		
		JButton UploadButton = new JButton("Upload");
		UploadButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		UploadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		menuBar.add(UploadButton);
		
		JButton RunButton = new JButton("Run");
		RunButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		menuBar.add(RunButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(comboBox);
		comboBox.setMaximumRowCount(5);
		comboBox.setBounds(new Rectangle(89, 563, 123, 28));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Verbose", "Error"}));
	}

}
