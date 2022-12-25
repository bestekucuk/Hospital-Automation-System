package windowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class adminPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminPage frame = new adminPage();
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
	public adminPage() {
		setTitle("admin İşlemleri");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("admin İşlemleri");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(225, 6, 349, 90);
		contentPane.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.WHITE);
		tabbedPane.setBounds(6, 96, 788, 470);
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Kurum Güncelle", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("Kurum Adı:");
		lblNewLabel_1_3.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_1_3.setBounds(85, 50, 93, 34);
		panel_1.add(lblNewLabel_1_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(85, 83, 262, 34);
		panel_1.add(textField_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("İl:");
		lblNewLabel_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(85, 141, 93, 34);
		panel_1.add(lblNewLabel_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(85, 174, 262, 34);
		panel_1.add(textField_4);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("İlçe:");
		lblNewLabel_1_2_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_1_2_1.setBounds(85, 230, 93, 34);
		panel_1.add(lblNewLabel_1_2_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(85, 263, 262, 34);
		panel_1.add(textField_5);
		
		JButton btnNewButton_1 = new JButton("Kurum güncelle");
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btnNewButton_1.setBounds(458, 280, 230, 89);
		panel_1.add(btnNewButton_1);
		
		String[] hastaneTurleri = {"hsatane","diş hastanesi","sağlık ocağı"};
		
		JComboBox combobox = new JComboBox(hastaneTurleri);
		combobox.setBounds(85, 342, 262, 27);
		panel_1.add(combobox);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Hastane türü");
		lblNewLabel_1_1_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_1_1_1_2.setBounds(85, 309, 183, 34);
		panel_1.add(lblNewLabel_1_1_1_2);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Kurum ekle", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Kurum Adı:");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(85, 49, 93, 34);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(85, 82, 262, 34);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("İl:");
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(85, 175, 93, 34);
		panel.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(85, 208, 262, 34);
		panel.add(textField_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("İlçe:");
		lblNewLabel_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(85, 301, 93, 34);
		panel.add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(85, 334, 262, 34);
		panel.add(textField_2);
		
		JButton btnNewButton = new JButton("Kurum ekle");
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(458, 279, 230, 89);
		panel.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Kurum Sil", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Kurum Adı:");
		lblNewLabel_1_3_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_1_3_1.setBounds(85, 50, 93, 34);
		panel_2.add(lblNewLabel_1_3_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(85, 83, 262, 34);
		panel_2.add(textField_6);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("İl:");
		lblNewLabel_1_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1.setBounds(85, 176, 93, 34);
		panel_2.add(lblNewLabel_1_1_1_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(85, 209, 262, 34);
		panel_2.add(textField_7);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("İlçe:");
		lblNewLabel_1_2_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_1_2_1_1.setBounds(85, 302, 93, 34);
		panel_2.add(lblNewLabel_1_2_1_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(85, 335, 262, 34);
		panel_2.add(textField_8);
		
		JButton btnNewButton_1_1 = new JButton("Kurum sil");
		btnNewButton_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btnNewButton_1_1.setBounds(460, 280, 230, 89);
		panel_2.add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("Güvenli Çıkış");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(677, 6, 117, 29);
		contentPane.add(btnNewButton_2);
	}
}
