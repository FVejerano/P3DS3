package medico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField campoCedula;
	private JTextField campoNombre;
	private JTextField campoApellido;
	private JTextField campoFecha;

	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Principal() {
		CrearArchivo f = new CrearArchivo();
		setTitle("Detalles del M\u00E9dico");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		campoCedula = new JTextField();
		campoCedula.setColumns(10);
		
		
		JLabel lblNewLabel = new JLabel("Medico");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_1 = new JLabel("C\u00E9dula");
		
		JButton btnNewButton = new JButton("Verificar");
		
		JButton btnGuardar = new JButton("Guardar");
		
		JButton btnActualizar = new JButton("Actualizar");
		
		JButton btnEliminar = new JButton("Eliminar");
		
		campoNombre = new JTextField();
		campoNombre.setColumns(10);
		campoNombre.setEnabled(false);
		
		JTextArea campoEsp = new JTextArea();
		campoEsp.setEnabled(false);
		
		JTextArea campoDireccion = new JTextArea();
		campoDireccion.setEnabled(false);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		
		JLabel lblNewLabel_3 = new JLabel("Apellido");
		
		campoApellido = new JTextField();
		campoApellido.setColumns(10);
		campoApellido.setEnabled(false);
		
		JLabel lblNewLabel_4 = new JLabel("Especializacion");
		
		JLabel lblNewLabel_5 = new JLabel("Direcci\u00F3n");
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.setEnabled(false);
		btnVerificar= new JButton("Activar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Medico medico;
			String cedula = campoCedula.getText().toString();
			if(f.existeCedula(cedula));
				medico = f.getInfoMedico(cedula);
				campoNombre.setText(medico.getNombre());
				campoApellido.setText(medico.getApellido());
				campoEsp.setText(medico.getEspecialidad());
				campoDireccion.setText(medico.getDireccion());
				campoFecha.setText(medico.getFecha());
			}
		});
		
		JLabel lblNewLabel_6 = new JLabel("Detalles del M\u00E9dico");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_7 = new JLabel("Fecha");
		
		campoFecha = new JTextField();
		campoFecha.setColumns(10);
		campoFecha.setEnabled(false);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_4)
								.addComponent(lblNewLabel_5)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_7))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(135)
									.addComponent(lblNewLabel_6))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(31)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(campoCedula, Alignment.LEADING)
										.addComponent(campoNombre, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
										.addComponent(campoApellido, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
										.addComponent(campoEsp, GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
										.addComponent(campoDireccion, Alignment.LEADING)
										.addComponent(campoFecha))
									.addGap(18)
									.addComponent(btnVerificar)))
							.addGap(256)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnNewButton, Alignment.LEADING)
								.addComponent(lblNewLabel, Alignment.LEADING)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(77)
							.addComponent(btnGuardar)
							.addGap(18)
							.addComponent(btnActualizar)
							.addGap(27)
							.addComponent(btnEliminar)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_6))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(campoCedula, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton)
						.addComponent(lblNewLabel_1)
						.addComponent(btnVerificar))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(campoNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(38)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(campoEsp, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_4))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(campoDireccion, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_5)))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(campoApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_3)))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(campoFecha, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_7))
					.addGap(42)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnGuardar)
						.addComponent(btnActualizar)
						.addComponent(btnEliminar))
					.addContainerGap(36, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
