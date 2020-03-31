package view.gestionReservationViews;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.classes.Aeroport;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReserverVolView extends JFrame {
	private JTable table;
	private JOptionPane jop;
	private JButton btnreserver;
	private JButton btnpanier;
	private JButton btnRechercher;
	private JComboBox<Aeroport> cbxarriv�;
	private JComboBox<Aeroport> cbxdepart;
	private JFormattedTextField txtDate;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public ReserverVolView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(59, 208, 653, 282);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setAutoCreateRowSorter(true);
		
		btnreserver = new JButton("reserver dans ce vol");
		btnreserver.setEnabled(false);
		btnreserver.setBounds(306, 529, 184, 23);
		contentPane.add(btnreserver);
		
		DateFormat format = new SimpleDateFormat("dd/MM/YYYY HH:MM");
		txtDate = new JFormattedTextField(format);
		txtDate.setBounds(265, 56, 225, 21);
		contentPane.add(txtDate);
		txtDate.setValue(new Date());
		
		JLabel lblNewLabel = new JLabel("Date");
		lblNewLabel.setBounds(190, 59, 65, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Depart");
		lblNewLabel_1.setBounds(190, 92, 65, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Destination");
		lblNewLabel_2.setBounds(190, 125, 65, 14);
		contentPane.add(lblNewLabel_2);
		
		cbxdepart = new JComboBox<Aeroport>();
		cbxdepart.setBounds(265, 88, 225, 22);
		contentPane.add(cbxdepart);
		
		cbxarriv� = new JComboBox<Aeroport>();
		cbxarriv�.setBounds(265, 121, 225, 22);
		contentPane.add(cbxarriv�);
		
		btnRechercher = new JButton("recherche vol");
		btnRechercher.setBounds(305, 161, 89, 23);
		contentPane.add(btnRechercher);
		
		btnpanier = new JButton("panier");
		btnpanier.setBounds(661, 83, 89, 23);
		contentPane.add(btnpanier);
		jop = new JOptionPane();
	}

	

	
	public void setBtnDetail(JButton btnDetail) {
		this.btnreserver = btnDetail;
	}



	public JOptionPane getJop() {
		return jop;
	}



	public void setJop(JOptionPane jop) {
		this.jop = jop;
	}





	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}




	public JButton getBtnreserver() {
		return btnreserver;
	}



	public JButton getBtnpanier() {
		return btnpanier;
	}



	public JButton getBtnRechercher() {
		return btnRechercher;
	}



	public JComboBox<Aeroport> getCbxarriv�() {
		return cbxarriv�;
	}



	public JComboBox<Aeroport> getCbxdepart() {
		return cbxdepart;
	}



	public JFormattedTextField getTxtDate() {
		return txtDate;
	}



	public void setBtnreserver(JButton btnreserver) {
		this.btnreserver = btnreserver;
	}



	public void setBtnpanier(JButton btnpanier) {
		this.btnpanier = btnpanier;
	}



	public void setBtnNewButton(JButton btnNewButton) {
		this.btnRechercher = btnNewButton;
	}



	public void setCbxarriv�(JComboBox cbxarriv�) {
		this.cbxarriv� = cbxarriv�;
	}



	public void setCbxdepart(JComboBox cbxdepart) {
		this.cbxdepart = cbxdepart;
	}



	public void setTxtDate(JFormattedTextField txtDate) {
		this.txtDate = txtDate;
	}
}
