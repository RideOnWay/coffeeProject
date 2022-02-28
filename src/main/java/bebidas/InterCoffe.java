package bebidas;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import model.Bebida;
import java.awt.BorderLayout;

public class InterCoffe {

	private JFrame frame;
	public static JComboBox comboBox, snackCombo;
	public String item;
	public static DefaultListModel<Bebida> model;
	public static DefaultListModel<Object>  modelSnack,model3;
	public static DefaultListModel<Integer> model2, modelSPrecio ;
	private JSplitPane splitPane, splitPane_1 ;
	private JScrollPane scrollPane,scrollPane_1;
	public static JList<Bebida> list;
	public static JList<Object>  listSnack,medVaso; 
	public static JList<Integer> list_1, listSnackPrecio;
	public static JTextField sumaTotal;
	public static JButton botonTotal, botonBorrar, botonVasoQ, botonVasoV, confirmar;
	public static JLabel sumaBebida, sumaSnack, labelHora;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterCoffe window = new InterCoffe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public InterCoffe() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		
		frame.setBounds(100, 100, 688, 534);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		splitPane = new JSplitPane();
		splitPane.setDividerSize(0);
		splitPane.setBounds(43, 119, 179, 222);
		frame.getContentPane().add(splitPane);
		splitPane.setDividerLocation(100);
		
		splitPane_1 = new JSplitPane();
		splitPane_1.setDoubleBuffered(true);
		splitPane_1.setDividerSize(-1);
		splitPane_1.setBounds(350, 119, 186, 222);
		frame.getContentPane().add(splitPane_1);
		splitPane_1.setDividerLocation(120);
		
		scrollPane = new JScrollPane();
		splitPane.setLeftComponent(scrollPane);
	
		scrollPane_1 = new JScrollPane();
		splitPane.setRightComponent(scrollPane_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		splitPane_1.setLeftComponent(scrollPane_2);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		splitPane_1.setRightComponent(scrollPane_3);
		
		Ejecutor ejc = new Ejecutor();
		ejc.llenarVectorBebida();
		
		comboBox = new JComboBox<>(ejc.listBebida);
		comboBox.setBounds(36, 39, 186, 22);
		frame.getContentPane().add(comboBox);
		comboBox.addActionListener(new Ejecutor());
		
		ejc.llenarVectorSnack();
		snackCombo = new JComboBox<>(ejc.listSnacks);
		snackCombo.setBounds(275, 39, 186, 22);
		frame.getContentPane().add(snackCombo);
		snackCombo.addActionListener(new Ejecutor());
		
		model = new DefaultListModel<>();
		model2 = new DefaultListModel<>();
		model3 = new DefaultListModel<>();
		modelSnack = new DefaultListModel<>();
		modelSPrecio = new DefaultListModel<>();
		            
		list = new JList<>(model);
		scrollPane.setViewportView(list);
		list.addListSelectionListener(new Escuchador());
		
		
		list_1 = new JList<>(model2);
		list_1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		scrollPane_1.setViewportView(list_1);

		
		listSnack = new JList<>(modelSnack);
		scrollPane_2.setViewportView(listSnack );
		listSnack.addListSelectionListener(new Escuchador());
		
		listSnackPrecio = new JList<>(modelSPrecio);
		listSnackPrecio.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		scrollPane_3.setViewportView(listSnackPrecio);
		
		medVaso = new JList<>(model3);
		medVaso.setBorder(new MatteBorder(2, 2, 1, 1, (Color) Color.GRAY));
		medVaso.setBounds(222, 119, 76, 222);
		frame.getContentPane().add(medVaso);
		
		
		sumaTotal = new JTextField();
		sumaTotal.setToolTipText("NON");
		sumaTotal.setBorder(new LineBorder(Color.BLACK, 2, true));
		sumaTotal.setBackground(Color.WHITE);
		sumaTotal.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		sumaTotal.setSelectedTextColor(Color.BLACK);
		sumaTotal.setEditable(false);
		sumaTotal.setBounds(150, 422, 129, 22);
		frame.getContentPane().add(sumaTotal);
		sumaTotal.setColumns(10);
		
		sumaBebida = new JLabel("New label");
		sumaBebida.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		sumaBebida.setBounds(170, 345, 46, 14);
		frame.getContentPane().add(sumaBebida);
		sumaBebida.setText("0");	
		
		sumaSnack = new JLabel("New label");
		sumaSnack.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		sumaSnack.setBounds(480, 345, 46, 14);
		frame.getContentPane().add(sumaSnack);
		sumaSnack.setText("0");	
		
		lblNewLabel = new JLabel("Subtotal Bebidas");
		lblNewLabel.setBounds(43, 345, 102, 14);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Subtotal Snacks");
		lblNewLabel_1.setBounds(350, 342, 89, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		labelHora = new JLabel("");
		labelHora.setBounds(550, 25, 100, 16);
		frame.getContentPane().add(labelHora);
		
		Escuchador.hora();
		
		botonTotal = new JButton("Total");
		botonTotal.setBounds(58, 422, 89, 23);
		frame.getContentPane().add(botonTotal);
		botonTotal.addActionListener(new Escuchador());
		
		botonBorrar = new JButton("Borrar");
		botonBorrar.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(25, 25, 112), new Color(25, 25, 112), new Color(25, 25, 112), new Color(25, 25, 112)));
		botonBorrar.setContentAreaFilled(false);
		botonBorrar.setBounds(207, 85, 89, 23);
		frame.getContentPane().add(botonBorrar);
		botonBorrar.addActionListener(new Escuchador());
		
		botonVasoQ = new JButton("Vaso 15");
		botonVasoQ.setBounds(43, 373, 89, 23);
		frame.getContentPane().add(botonVasoQ);
		botonVasoQ.addActionListener(new Ejecutor());
		
		botonVasoV = new JButton("Vaso 20");
		botonVasoV.setBounds(133, 373, 89, 23);
		frame.getContentPane().add(botonVasoV);
		botonVasoV.addActionListener(new Ejecutor());
		
		confirmar = new JButton("OK");
		confirmar.setBounds(550, 150, 50, 50);
		frame.getContentPane().add(confirmar);
		confirmar.addActionListener(new Ejecutor());
	
	
	}

	public JTextField getTextField() {
		return sumaTotal;
	}

	public void setTextField(JTextField textField) {
		InterCoffe.sumaTotal = textField;
	}
}
