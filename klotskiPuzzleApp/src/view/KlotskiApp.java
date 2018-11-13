package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.MovePieceController;
import controller.ResetController;
import controller.SelectPieceController;
import model.Board;
import model.Model;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KlotskiApp extends JFrame { //implements ActionListener {

	/**
	 * This next line added itself when I used a quick fix, 
	 * if I take it out I get a yellow squiggle under KlotskiApp above
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	Model model;
	Board board;
	//Board JPanel;  //Need this to use WindowBuilder
	String winLabel;

	
	/**
	 * Create the frame.
	 */
	public KlotskiApp(Model model) {

		
		PuzzleView panel = new PuzzleView(model); 
		//JPanel panel = new JPanel();  //use this instead of puzzle view when i need window builder
		SelectPieceController controller = new SelectPieceController(KlotskiApp.this, model);
		panel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				controller.select(e.getPoint());
			}
		});
		
		//MovePieceController moveController = new MovePieceController(KlotskiApp.this, model);
		
		
		//from SlidingPuzzleApp class in Sample_IP_2
		setTitle("Klotski Puzzle App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); 
		setContentPane(contentPane);
		
		//PuzzleView panel = new PuzzleView();
		panel.setBackground(Color.GRAY);
		panel.setSize(new Dimension(500, 600));
		
		JButton resetButton = new JButton("Reset");
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ResetController(KlotskiApp.this, model, board).resetBoard(); 
			}
		});
		
		JButton upButton = new JButton("^");
		upButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MovePieceController(KlotskiApp.this, model).move(model.getSelectedTile(), upButton);
				//moveController.move(model.getSelectedTile(), upButton);
			}
		});
		
		JButton leftButton = new JButton("<");
		leftButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MovePieceController(KlotskiApp.this, model).move(model.getSelectedTile(), leftButton);
				//moveController.move(model.getSelectedTile(), leftButton);
			}
		});
		
		JButton rightButton = new JButton(">");
		rightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MovePieceController(KlotskiApp.this, model).move(model.getSelectedTile(), rightButton);
				//moveController.move(model.getSelectedTile(), rightButton);
			}
		});
		
		JButton downButton = new JButton("V");
		downButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MovePieceController(KlotskiApp.this, model).move(model.getSelectedTile(), downButton);
				//moveController.move(model.getSelectedTile(), downButton);
			}
		});
		
		JLabel lblMoves = new JLabel("Moves:");
		
		JLabel label = new JLabel(Integer.toString(model.getNumMoves())); 
		//End sample code
		
		//JLabel winLabel = new JLabel(""); 
		
		JLabel winLabel = new JLabel("");
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(33)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(leftButton)
										.addGap(33)
										.addComponent(rightButton))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(38)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(winLabel)
											.addComponent(upButton))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(resetButton)
										.addComponent(downButton))
									.addGap(15))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(lblMoves)
							.addGap(18)
							.addComponent(label)))
					.addContainerGap(97, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMoves)
								.addComponent(label))
							.addGap(83)
							.addComponent(winLabel)
							.addGap(86)
							.addComponent(upButton)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(rightButton)
								.addComponent(leftButton))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(downButton)
							.addPreferredGap(ComponentPlacement.RELATED, 295, Short.MAX_VALUE)
							.addComponent(resetButton)))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		
		setResizable(false);  //so that it can't resize
		this.model = model; 
			
	
	}

	public void setWinLabel(String string) {
		this.winLabel = string;
	}	
}
