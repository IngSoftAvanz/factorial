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

public class ViewFactImpl1 extends JFrame implements ViewFactorial {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldInput;
	private JLabel lblResultado;
	private JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewFactImpl1 frame = new ViewFactImpl1();
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
	public ViewFactImpl1() {
		setTitle("Factorial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelCenter = new JPanel();
		contentPane.add(panelCenter);
		panelCenter.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblInput = new JLabel("n:");
		panelCenter.add(lblInput);
		
		textFieldInput = new JTextField();
		panelCenter.add(textFieldInput);
		textFieldInput.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		panelCenter.add(btnCalcular);
		
		lblResultado = new JLabel("Resultado:");
		contentPane.add(lblResultado, BorderLayout.SOUTH);
		
		this.setResizable(false);
		this.pack();
		this.setVisible(true);

	}

	@Override
	public int getInput() {
		return Integer.parseInt(this.textFieldInput.getText());
	}

	@Override
	public void setResult(long res) {
		this.lblResultado.setText("Resultado: " + res);
	}

	@Override
	public void setMessage(String msg) {
		this.lblResultado.setText(msg);
	}

	@Override
	public void setController(ActionListener ctr) {
		this.btnCalcular.addActionListener(ctr);
		this.btnCalcular.setActionCommand("Calcular");
	}

}
