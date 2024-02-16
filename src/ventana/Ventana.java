package ventana;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame {

	public Ventana(){
		setVisible(true);
		setTitle("mi primer ventanita");
		setSize (400,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.componentes();
		
	}
	
	public void componentes() {
		JPanel login=new JPanel();
		login.setSize(400,500);
		login.setLocation(0,0);
		login.setLayout(null);
		login.setBackground(Color.gray);
		
		JLabel title= new JLabel ("Bienvendio a la ventana");
		title.setBackground(Color.pink);
		title.setLocation(100,10);
		title.setSize(190,40);
		title.setOpaque(true);
		login.add(title);
		
		
		JLabel usuario=new JLabel("Usuario");
		usuario.setBackground(Color.white);
		usuario.setLocation(150,80);
		usuario.setSize(100,30);
		usuario.setOpaque(true);
		login.add(usuario);
		
		JTextField usuarioField=new JTextField();
		usuarioField.setBounds(150, 130, 80, 30);
		login.add(usuarioField);
		add(login);
		
		JLabel contraseña=new JLabel("contraseña");
		contraseña.setBackground(Color.white);
		contraseña.setLocation(120,170);
		contraseña.setSize(130,30);
		contraseña.setOpaque(true);
		login.add(contraseña);
		
		JTextField contraseñaField=new JTextField();
		contraseñaField.setBounds(150, 220, 80, 30);
		login.add(contraseñaField);
		add(login);

		JButton acceder =new JButton("Acceder");
		
		acceder.setBounds(150,270,80,30);
		login.add(acceder);
		

		add(login);
	}
}
