package ui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import antlr4.generate.NymtaxParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import antlr4.custom.DetectionNymtaxWalker;
import antlr4.generate.NymtaxLexer;

import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.log4j.Logger;

public class NymTaxUI {


	final static Logger logger = Logger.getLogger(NymTaxUI.class);
	
	private JFrame frame;
	private String code;
    private JList consoleList = new JList();
    private DefaultListModel tokenListModel;
	private JTextArea CodeArea;
	private JComboBox comboBox;
	private DetectionNymtaxWalker walker = new DetectionNymtaxWalker();
	JScrollPane OutputscrollPane;
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
		OutputscrollPane = new JScrollPane();
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
		
		CodeArea = new JTextArea();
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
		RunButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

                System.out.println("Run button clicked!");
                code = CodeArea.getText();

                NymtaxLexer lex = new NymtaxLexer(CharStreams.fromString(code));
                CommonTokenStream tokens = new CommonTokenStream(lex);
                tokens.fill();

                tokenListModel = new DefaultListModel();

                for (Token t : tokens.getTokens()){
                    System.out.println("Token #" + t.getTokenIndex());
                    System.out.println("[TOKEN] Token #" + (t.getTokenIndex()+1) + " found: "
                            + t.getText() + " | Type: "  + NymtaxLexer.VOCABULARY.getSymbolicName(t.getType()));
                    
                    tokenListModel.addElement("[TOKEN] Token #" + (t.getTokenIndex()+1) + " found: "
                            + t.getText() + " | Type: "  + NymtaxLexer.VOCABULARY.getSymbolicName(t.getType()));
                    
                    if(0 == walker.getOutput())
                    	logger.info("[TOKEN] Token #" + (t.getTokenIndex()+1) + " found: "
                            + t.getText() + " | Type: "  + NymtaxLexer.VOCABULARY.getSymbolicName(t.getType()));
                    
                    System.out.println("----------------");
                }
				NymtaxParser parser = new NymtaxParser(tokens);



				ParseTreeWalker.DEFAULT.walk(walker, parser.program());

                consoleList.setModel(tokenListModel);
                OutputscrollPane.setViewportView(consoleList);
                consoleList.setLayoutOrientation(JList.VERTICAL);

                //ParseTree t = parser.compilationUnit();
                // txtConsole.setText("\n Parse tree: " + t.toStringTree(parser) );

			}
		});
		RunButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		menuBar.add(RunButton);
		
		comboBox= new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(comboBox);
		comboBox.setMaximumRowCount(5);
		comboBox.setBounds(new Rectangle(89, 563, 123, 28));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Verbose", "Error"}));
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					walker.setOutput(comboBox.getSelectedIndex());
			}
		});
	}

}
