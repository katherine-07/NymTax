package ui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import antlr4.custom.NymtaxWalker;
import antlr4.generate.NymtaxParser;

import compiler.execution.ExecutionManager;
import org.antlr.v4.runtime.*;

import antlr4.custom.DetectionNymtaxWalker;
import antlr4.custom.NymtaxErrorListener;
import antlr4.generate.NymtaxLexer;

import org.antlr.v4.runtime.tree.ParseTree;
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
	private NymtaxErrorListener listener = new NymtaxErrorListener();
	private DetectionNymtaxWalker walker = new DetectionNymtaxWalker();
	private NymtaxWalker mainWalker = new NymtaxWalker();
	private ExecutionManager executionManager = ExecutionManager.getInstance();
	private ANTLRErrorStrategy errorStrategy = new DefaultErrorStrategy();
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
		
		JFileChooser fc = new JFileChooser();
		JTextArea OutputArea = new JTextArea();
		OutputArea.setEditable(false);
		OutputArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
		OutputscrollPane.setViewportView(OutputArea);
		
		JLabel lblOutput = new JLabel("Output :");
		lblOutput.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblOutput.setBounds(15, 568, 134, 22);
		frame.getContentPane().add(lblOutput);
		
		JScrollPane CodescrollPane = new JScrollPane();
		CodescrollPane.setBounds(15, 77, 1168, 475);
		frame.getContentPane().add(CodescrollPane);
		
		CodeArea = new JTextArea();
		CodeArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
		CodescrollPane.setViewportView(CodeArea);
		
		JLabel lblCode = new JLabel("Code :");
		lblCode.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCode.setBounds(15, 47, 134, 22);
		frame.getContentPane().add(lblCode);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1196, 31);
		frame.getContentPane().add(menuBar);
		
		FileChooserDemo fcd = new FileChooserDemo();
		JButton UploadButton = new JButton("Upload");
		UploadButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		UploadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if (e.getSource() == UploadButton) {
				        int returnVal = fc.showOpenDialog(fcd);

				        if (returnVal == JFileChooser.APPROVE_OPTION) {
				        	
				        	BufferedReader fileReader = null;
				    		String rawData = new String();
				            File file = fc.getSelectedFile();
				     
							try {
								fileReader = new BufferedReader(new FileReader(file));
								rawData = new String();
								while((rawData = fileReader.readLine()) != null) {
									CodeArea.append(rawData + "\n");
								}
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}finally
							{
								try
								{
									fileReader.close();
								}
								catch (IOException e1)
								{
									e1.printStackTrace();
								}
							}
				            
				            //This is where a real application would open the file.
				            logger.info("Opening: " + file.getName() + ".");
				        } else {
				            logger.info("Open command cancelled by user.");
				        }
				   }
			}
		});
		menuBar.add(UploadButton);
		
		JButton RunButton = new JButton("Run");
		RunButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

                ExecutionManager.getInstance().newProgram();
                code = CodeArea.getText();

                NymtaxLexer lex = new NymtaxLexer(CharStreams.fromString(code));
                CommonTokenStream tokens = new CommonTokenStream(lex);
                tokens.fill();

                tokenListModel = new DefaultListModel();

				if(0 == walker.getOutput()) {
					for (Token t : tokens.getTokens()) {
						logger.info("[TOKEN] Token #" + (t.getTokenIndex() + 1) + " found: "
								+ t.getText() + " | Type: " + NymtaxLexer.VOCABULARY.getSymbolicName(t.getType()));

					}
				}
				NymtaxParser parser = new NymtaxParser(tokens);
				parser.addErrorListener(listener);
				parser.setErrorHandler(errorStrategy);

				ParseTreeWalker.DEFAULT.walk(walker, parser.program());
				parser.reset();
//				ParseTreeWalker.DEFAULT.walk(mainWalker, parser.program());
//				parser.reset();


				System.out.println("-------- RUNNING PROGRAM --------");

				//ParseTreeWalker.DEFAULT.walk(mainWalker, parser.program());
				ExecutionManager.getInstance().visit(parser.program());

                consoleList.setModel(tokenListModel);
                OutputscrollPane.setViewportView(consoleList);
                consoleList.setLayoutOrientation(JList.VERTICAL);

                //ParseTree t = parser.compilationUnit();
                // txtConsole.setText("\n Parse tree: " + t.toStringTree(parser) );
				System.out.println("====== END PROGRAM EXECUTION =====");
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
				System.out.println("CHANGE" + comboBox.getSelectedIndex());
					walker.setOutput(comboBox.getSelectedIndex());
			}
		});
	}

}
