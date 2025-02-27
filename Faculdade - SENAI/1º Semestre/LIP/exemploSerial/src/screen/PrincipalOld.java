package screen;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class PrincipalOld extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel pnLComunicação;
	private JTextField txtEnviar;

		
	//flag para sinalizar status da porta 
	boolean conectado = false;
	
	// String para preenchimento do Baud Rate
	   String[] baudRate = { "110", "300", "600", "1200", "2400", "4800", "9600", "14400", "19200", "38400", "57600",
	           "115200", "128000", "256000" };
	   
	   // cria objeto para comunicação serial
	   Serial com = new Serial();
	
	   /**
		 * Launch the application.
		 */
	   
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalOld frame = new PrincipalOld();
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
	public PrincipalOld() {
		setTitle("Terminal Serial RS232");
		setResizable(false);
		setFocusCycleRoot(false);
		setFocusTraversalKeysEnabled(false);
		setFocusable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 494);
		pnLComunicação = new JPanel();
		pnLComunicação.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(pnLComunicação);
		pnLComunicação.setLayout(null);
		
		JLabel lblPorta = new JLabel("Porta");
		lblPorta.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblPorta.setBounds(38, 24, 112, 31);
		pnLComunicação.add(lblPorta);
		
		JLabel lblBaudRate = new JLabel("BaudRate");
		lblBaudRate.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblBaudRate.setBounds(238, 24, 112, 31);
		pnLComunicação.add(lblBaudRate);
		
		JButton btnConnectar = new JButton("Conectar");
		btnConnectar.setRequestFocusEnabled(false);
		btnConnectar.setFocusTraversalKeysEnabled(false);
		btnConnectar.setFocusable(false);
		btnConnectar.setBackground(new Color(242, 242, 242));
		btnConnectar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnConnectar.setBounds(431, 31, 134, 56);
		pnLComunicação.add(btnConnectar);
		
		JButton btnDesconectar = new JButton("Desconectar");
		btnDesconectar.setFocusTraversalKeysEnabled(false);
		btnDesconectar.setFocusable(false);
		btnDesconectar.setEnabled(false);
		btnDesconectar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDesconectar.setBounds(575, 31, 176, 56);
		pnLComunicação.add(btnDesconectar);
		
		JComboBox cmbPortas = new JComboBox(com.listaCom());
		cmbPortas.setRequestFocusEnabled(false);
		cmbPortas.setFocusTraversalKeysEnabled(false);
		cmbPortas.setFocusable(false);
		cmbPortas.setBackground(new Color(242, 242, 242));
		cmbPortas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cmbPortas.setBounds(38, 56, 151, 31);
		pnLComunicação.add(cmbPortas);
		
		JComboBox cmbBaudRate = new JComboBox(baudRate);
		cmbBaudRate.setRequestFocusEnabled(false);
		cmbBaudRate.setSelectedIndex(11);
		cmbBaudRate.setFocusTraversalKeysEnabled(false);
		cmbBaudRate.setFocusable(false);
		cmbBaudRate.setBackground(new Color(242, 242, 242));
		cmbBaudRate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cmbBaudRate.setBounds(238, 56, 151, 31);
		pnLComunicação.add(cmbBaudRate);
		
		JPanel pnLPrincipal = new JPanel();
		pnLPrincipal.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnLPrincipal.setBackground(new Color(255, 255, 255));
		pnLPrincipal.setBounds(10, 11, 774, 90);
		pnLComunicação.add(pnLPrincipal);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(22, 167, 740, 218);
		pnLComunicação.add(textArea);
		
		JLabel lblDadosRecebidos = new JLabel("Dados Recebidos");
		lblDadosRecebidos.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblDadosRecebidos.setBounds(22, 126, 191, 30);
		pnLComunicação.add(lblDadosRecebidos);
		
		txtEnviar = new JTextField();
		txtEnviar.setBounds(22, 396, 411, 45);
		pnLComunicação.add(txtEnviar);
		txtEnviar.setColumns(10);
		
		JComboBox cmbFinalDeLinha = new JComboBox();
		cmbFinalDeLinha.setFocusTraversalKeysEnabled(false);
		cmbFinalDeLinha.setFocusable(false);
		cmbFinalDeLinha.setBackground(new Color(242, 242, 242));
		cmbFinalDeLinha.setBounds(456, 395, 176, 46);
		pnLComunicação.add(cmbFinalDeLinha);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setRequestFocusEnabled(false);
		btnEnviar.setFocusTraversalKeysEnabled(false);
		btnEnviar.setFocusable(false);
		btnEnviar.setBackground(new Color(242, 242, 242));
		btnEnviar.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnEnviar.setBounds(643, 396, 131, 42);
		pnLComunicação.add(btnEnviar);
		
		JPanel pnLComunicacao = new JPanel();
		pnLComunicacao.setBackground(new Color(248, 248, 248));
		pnLComunicacao.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnLComunicacao.setBounds(10, 112, 774, 337);
		pnLComunicação.add(pnLComunicacao);
	}
	
	// método para habilitar ou desabilitar um JPanel
	   void setPanelEnabled(JPanel panel, Boolean isEnabled) {
	       panel.setEnabled(isEnabled);

	       Component[] components = panel.getComponents();

	       for (Component component : components) {
	           if (component instanceof JPanel) {
	               setPanelEnabled((JPanel) component, isEnabled);
	           }
	           component.setEnabled(isEnabled);
	       }
	   }
}

