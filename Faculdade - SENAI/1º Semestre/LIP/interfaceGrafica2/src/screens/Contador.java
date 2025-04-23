package screens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Contador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textValor;

	/**
	 * Launch the application.
	 */
	int contador = 0;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contador frame = new Contador();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Contador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 459, 116);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblContador = new JLabel("Contador");
		lblContador.setHorizontalAlignment(SwingConstants.CENTER);
		lblContador.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblContador.setBounds(10, 26, 140, 26);
		contentPane.add(lblContador);
		
		textValor = new JTextField();
		textValor.setHorizontalAlignment(SwingConstants.RIGHT);
		textValor.setText("0");
		textValor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textValor.setBounds(147, 22, 166, 34);
		contentPane.add(textValor);
		textValor.setColumns(10);
		
		JButton btnUP = new JButton("UP");
		btnUP.setBounds(323, 16, 96, 47);
		contentPane.add(btnUP);
		
		btnUP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador++;
				
				textValor.setText("" + contador);
			}
		});
	}

	protected JTextField setText(int contador) {
		// TODO Auto-generated method stub
		return null;
	}
}
