package pruebaInterface;

import java.awt.EventQueue;
import model.*;
import model.Bebida.nombre;
import model.Vaso.medida;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLayeredPane;
import javax.swing.JTable;

public class PruebInterface implements ActionListener{

	private JFrame frame;
	public static JComboBox<String> comboBox;
	private JTable table;
	public static DefaultListModel<Bebida> bebidas;
	public static DefaultListModel<Object>  vaso,model3;
	public static DefaultListModel<Integer> secuencia, Precio ;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebInterface window = new PruebInterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public PruebInterface() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 581, 484);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		comboBox = new JComboBox<>();
		comboBox.setBounds(63, 66, 156, 22);
		frame.getContentPane().add(comboBox);
		comboBox.addItem(new Bebida(new Vaso(medida.MINI), nombre.LECHE).toString());
		comboBox.addItem(new Bebida(new Vaso(medida.MINI), nombre.TURKO).toString());
		comboBox.addItem(new Bebida(new Vaso(medida.MINI), nombre.CAFE).toString());
		comboBox.addItem(new Bebida(new Vaso(medida.MINI), nombre.CAMPESINO).toString());
		comboBox.addItem(new Bebida(new Vaso(medida.MEDIO), nombre.CAPUCHINO).toString());
		comboBox.addActionListener(this);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(91, 357, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(40, 110, 243, 212);
		frame.getContentPane().add(layeredPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 243, 212);
		layeredPane.add(scrollPane_1);
		
		table = new JTable();
		table.createDefaultColumnsFromModel();
		scrollPane_1.setViewportView(table);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		comboBox.getSelectedItem().toString();
		
	}
}
