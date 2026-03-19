package isa.factorial.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;

public class ViewFactImpl2 extends JFrame implements ViewFactorial {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldInput;
	private JLabel lblError;
	private JButton btnCalcular;
	private JPanel panel;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewFactImpl2 frame = new ViewFactImpl2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewFactImpl2() {
		setTitle("Factorial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelCenter = new JPanel();
		contentPane.add(panelCenter);
		panelCenter.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel = new JPanel();
		panelCenter.add(panel);
		
		textFieldInput = new JTextField();
		textFieldInput.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(textFieldInput);
		textFieldInput.setColumns(10);
		
		lblResultado = new JLabel("! =");
		panel.add(lblResultado);
		
		btnCalcular = new JButton("Compute");
		panelCenter.add(btnCalcular);
		
		lblError = new JLabel("Info:");
		contentPane.add(lblError, BorderLayout.SOUTH);
		
		this.setVisible(true);

	}

	@Override
	public int getInput() {
		return Integer.parseInt(this.textFieldInput.getText().strip());
	}

	@Override
	public void setResult(long res) {
		this.lblResultado.setText("! = " + res);
	}

	@Override
	public void setMessage(String msg) {
		this.lblResultado.setText("! = ");
		this.lblError.setText(msg);
	}

	@Override
	public void setController(ActionListener ctr) {
		this.btnCalcular.addActionListener(ctr);
		this.btnCalcular.setActionCommand("Calcular");
	}

}
