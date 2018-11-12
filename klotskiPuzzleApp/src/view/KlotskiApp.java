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
	
	/**
	 * Create the frame.
	 */
	public KlotskiApp(Model model) {
		
		PuzzleView panel = new PuzzleView(model); 
		SelectPieceController controller = new SelectPieceController(KlotskiApp.this, model);
		panel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				controller.select(e.getPoint());
			}
		});
		
		MovePieceController moveController = new MovePieceController(KlotskiApp.this, model);
		
		
		//from SlidingPuzzleApp class in Sample_IP_2
		setTitle("Klotski Puzzle App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//PuzzleView panel = new PuzzleView();
		panel.setBackground(Color.GRAY);
		panel.setSize(new Dimension(400, 500));
		
		JButton resetButton = new JButton("Reset");
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResetController.resetBoard(); //FIX LATER
			}
		});
		
		JButton upButton = new JButton("^");
		upButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moveController.move(model.getSelectedTile(), upButton);
			}
		});
		
		JButton leftButton = new JButton("<");
		leftButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moveController.move(model.getSelectedTile(), leftButton);
			}
		});
		
		JButton rightButton = new JButton(">");
		rightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moveController.move(model.getSelectedTile(), rightButton);
			}
		});
		
		JButton downButton = new JButton("V");
		downButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moveController.move(model.getSelectedTile(), downButton);
				//System.out.println("pressed");
			}
		});
		
		JLabel lblMoves = new JLabel("Moves:");
		
		JLabel label = new JLabel("12"); //this shouldn't actually be 12, but that's a problem for later
		//End sample code
		
		JLabel winLabel = new JLabel(""); 
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE) //337
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(33)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(38)
										.addComponent(upButton)
										.addGap(36))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(leftButton)
										.addGap(33)
										.addComponent(rightButton)))
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, 39, GroupLayout.PREFERRED_SIZE)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(resetButton)
										.addComponent(downButton))
									.addGap(15))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(lblMoves)
							.addGap(18)
							.addComponent(label)))
					.addContainerGap(79, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE) //530
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMoves)
								.addComponent(label))
							.addGap(189)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(upButton)
								.addPreferredGap(ComponentPlacement.UNRELATED))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(rightButton)
								.addComponent(leftButton))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(downButton)
							.addPreferredGap(ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
							.addComponent(resetButton)))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		
		//setResizable(false);  //so that it can't resize
		this.model = model; 
			
	
	}

	public void setWinLabel(String string) {
		this.winLabel = string;
		
	}	
}
