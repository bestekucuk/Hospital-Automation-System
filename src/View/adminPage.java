package View;

import Helper.Helper;
import Model.Admin;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class adminPage extends JFrame {

    private JPanel contentPane;
    private JTextField textFieldKurumadi;
    private JTextField textFieldil;
    private JTextField textFieldİlce;
    private JTable kurumSilTable;
    private JTable kurumGuncelleTable;
    private JTextField adTextfield;
    private JTextField ilTextfield;
    private JTextField ilceTextfield;
    private JTextField adresTextfield;
    private JTextField textFieldAdres;

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
    public adminPage() throws SQLException {
        setResizable(false);
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



        String[] hastaneTurleri = {"hastane","diş hastanesi","sağlık ocağı"};

        JPanel panel = new JPanel();
        tabbedPane.addTab("Kurum ekle", null, panel, null);
        panel.setLayout(null);

        JButton kurumEkleBbuton = new JButton("Kurum ekle");
        kurumEkleBbuton.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        kurumEkleBbuton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Admin a=new Admin();
                String s;
                s="hastane";
                try {
                    a.addSaglikKurumu(textFieldKurumadi.getText(),textFieldil.getText(),textFieldİlce.getText(),s);

                    Helper.showMsg("success");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        kurumEkleBbuton.setBounds(458, 279, 230, 89);
        panel.add(kurumEkleBbuton);

        JLabel kurumadiLabel = new JLabel("Kurum Adı:");
        kurumadiLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
        kurumadiLabel.setBounds(78, 25, 93, 34);
        panel.add(kurumadiLabel);

        textFieldKurumadi = new JTextField();
        textFieldKurumadi.setColumns(10);
        textFieldKurumadi.setBounds(78, 58, 262, 34);
        panel.add(textFieldKurumadi);

        JLabel ilLabel = new JLabel("İl:");
        ilLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
        ilLabel.setBounds(78, 93, 93, 34);
        panel.add(ilLabel);

        textFieldil = new JTextField();
        textFieldil.setColumns(10);
        textFieldil.setBounds(78, 126, 262, 34);
        panel.add(textFieldil);

        JLabel ilceLabel = new JLabel("İlçe:");
        ilceLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
        ilceLabel.setBounds(78, 172, 93, 34);
        panel.add(ilceLabel);

        JLabel hastaneLabel = new JLabel("Hastane türü:");
        hastaneLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
        hastaneLabel.setBounds(78, 321, 183, 34);
        panel.add(hastaneLabel);

        textFieldİlce = new JTextField();
        textFieldİlce.setColumns(10);
        textFieldİlce.setBounds(78, 205, 262, 34);
        panel.add(textFieldİlce);

        JComboBox comboboxHastane = new JComboBox(hastaneTurleri);
        comboboxHastane.setBounds(78, 354, 262, 27);
        panel.add(comboboxHastane);

        JLabel adresLabel = new JLabel("Adres:");
        adresLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
        adresLabel.setBounds(78, 251, 93, 34);
        panel.add(adresLabel);

        textFieldAdres = new JTextField();
        textFieldAdres.setColumns(10);
        textFieldAdres.setBounds(78, 284, 262, 34);
        panel.add(textFieldAdres);

        //KURUM SILL

        JPanel panel_2 = new JPanel();
        tabbedPane.addTab("Kurum Sil", null, panel_2, null);
        panel_2.setLayout(null);



        //JButton tabloUpdate = new JButton("Tablo Güncelle");
        //tabloUpdate .setBounds(460, 140, 230, 89);
        //tabloUpdate .setFont(new Font("Lucida Grande", Font.BOLD, 16));
        //panel_2.add(tabloUpdate );


        JButton kurumSilButon = new JButton("Kurum sil");
        kurumSilButon.setBounds(460, 280, 230, 89);
        kurumSilButon.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        panel_2.add(kurumSilButon);

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Ad");
        model.addColumn("Soyad");

        Admin r=new Admin();
       // for (int i = 0; i < r.getList().size(); i++) {
         //   model.addRow(new String[]{r.getList().get(i).getIsim(),r.getList().get(i).getIl(),r.getList().get(i).getIlce()});
        //}
        kurumSilTable = new JTable(model);
        kurumSilTable.setBounds(6, 6, 399, 412);
        panel_2.add(kurumSilTable);



        //SATIR SİL

        // JTable'a bir MouseListener ekleyelim
        kurumSilTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Fare tıklandığında, tıklanan satırı silelim
                int row = kurumSilTable.rowAtPoint(e.getPoint()); // Tıklanan satırı bulalım
                kurumSilButon.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        model.removeRow(row); // Satırı silelim
                        Helper.showMsg("success");

                    }
                });

            }
        });





        JButton guvenliCikis = new JButton("Güvenli Çıkış");
        guvenliCikis.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame1 f1 = new frame1();
                f1.setVisible(true);
            }
        });
        guvenliCikis.setBounds(677, 6, 117, 29);
        contentPane.add(guvenliCikis);
    }
}
