package ch007;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.util.ArrayList;

public class PhoneGridDemo {
    private static JButton[] buttons = new JButton[12]; // Butonları saklamak için dizi
    private static JTextField displayField = new JTextField(); // Ekranda numarayı göstermek için
    private static ArrayList<Contact> contacts = new ArrayList<>(); // Kaydedilen numaraları tutacak liste

    public static void main(String[] args) {
        // Yeni bir JFrame penceresi oluşturuluyor
        JFrame frame = new JFrame("Telefon Tuş Takımı Demo: ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600); // Ekran boyutu iPhone arama ekranına daha uygun hale getirildi

        // Telefon tuş takımı paneli oluşturuluyor
        JPanel phonePad = new JPanel(new GridLayout(4, 3, 5, 5)); // GridLayout satır ve sütun sayısı 4x3 olarak ayarlandı

        // 12 buton oluşturuluyor ve panel'e ekleniyor, yukarıdan aşağıya ve soldan sağa sırayla
        buttons[0] = createButton("1");
        buttons[1] = createButton("2");
        buttons[2] = createButton("3");
        buttons[3] = createButton("4");
        buttons[4] = createButton("5");
        buttons[5] = createButton("6");
        buttons[6] = createButton("7");
        buttons[7] = createButton("8");
        buttons[8] = createButton("9");
        buttons[9] = createButton("*");
        buttons[10] = createButton("0");
        buttons[11] = createButton("#");

        for (JButton button : buttons) {
            phonePad.add(button);
        }

        // Telefon tuş takımı paneli çerçeveye ekleniyor
        frame.add(phonePad, BorderLayout.CENTER);

        // Ekranın üst kısmında bir boşluk bırakmak için üst panel ekleniyor
        JPanel topPanel = new JPanel();
        topPanel.setPreferredSize(new Dimension(400, 150)); // Üst panel boyutu ayarlanıyor
        topPanel.setLayout(new BorderLayout());

        // Ekranda girilen numarayı gösterecek alan ekleniyor
        displayField.setFont(new Font("Arial", Font.PLAIN, 24));
        displayField.setEditable(false);
        topPanel.add(displayField, BorderLayout.CENTER);

        // Kayıt butonu ekleniyor
        JButton saveButton = new JButton("Kaydet");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveContact();
            }
        });
        topPanel.add(saveButton, BorderLayout.WEST);

        // Kayıtlarım butonu ekleniyor
        JButton viewContactsButton = new JButton("Kayıtlarım");
        viewContactsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewContacts();
            }
        });
        topPanel.add(viewContactsButton, BorderLayout.EAST);

        frame.add(topPanel, BorderLayout.NORTH);

        // JFrame görünür yapılıyor
        frame.setVisible(true);
    }

    // Buton oluşturma metodunu basitleştirmek için yardımcı bir metod oluşturuluyor
    private static JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.PLAIN, 24)); // Font boyutu ayarlandı
        button.setFocusPainted(false); // Buton odak göstergesi kapatıldı
        button.setBackground(Color.white); // Buton arka plan rengi beyaz yapıldı

        // Butona tıklama sesi ekleniyor
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playClickSound();
                displayField.setText(displayField.getText() + text); // Ekrana tıklanan sayıyı ekle
            }
        });

        return button;
    }

    // Tıklama sesi oynatma metodu
    private static void playClickSound() {
        try {
            // Ses dosyasını yükle
            File soundFile = new File("src/ch007/click.wav");
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start(); // Sesi oynat
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Girilen numarayı kaydetme metodu
    private static void saveContact() {
        String phoneNumber = displayField.getText();
        if (!phoneNumber.isEmpty()) {
            String name = JOptionPane.showInputDialog("İsim:");
            String surname = JOptionPane.showInputDialog("Soyisim:");
            if (name != null && surname != null) {
                contacts.add(new Contact(name, surname, phoneNumber));
                displayField.setText("");
                JOptionPane.showMessageDialog(null, "Numara kaydedildi.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lütfen bir numara girin.");
        }
    }

    // Kayıtlı numaraları görüntüleme metodu
    private static void viewContacts() {
        JFrame contactsFrame = new JFrame("Kayıtlı Numaralar");
        contactsFrame.setSize(400, 300);

        JList<Contact> contactsList = new JList<>(new DefaultListModel<>());
        DefaultListModel<Contact> listModel = (DefaultListModel<Contact>) contactsList.getModel();

        for (Contact contact : contacts) {
            listModel.addElement(contact);
        }

        contactsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Silme butonu ekleniyor
        JButton deleteButton = new JButton("Sil");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = contactsList.getSelectedIndex();
                if (selectedIndex != -1) {
                    listModel.remove(selectedIndex);
                    contacts.remove(selectedIndex);
                }
            }
        });

        // Güncelleme butonu ekleniyor
        JButton updateButton = new JButton("Güncelle");
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = contactsList.getSelectedIndex();
                if (selectedIndex != -1) {
                    Contact contact = contacts.get(selectedIndex);
                    String newName = JOptionPane.showInputDialog("Yeni İsim:", contact.getFirstName());
                    String newSurname = JOptionPane.showInputDialog("Yeni Soyisim:", contact.getLastName());
                    String newPhoneNumber = JOptionPane.showInputDialog("Yeni Numara:", contact.getPhoneNumber());

                    if (newName != null && newSurname != null && newPhoneNumber != null) {
                        contact.setFirstName(newName);
                        contact.setLastName(newSurname);
                        contact.setPhoneNumber(newPhoneNumber);
                        listModel.set(selectedIndex, contact);
                    }
                }
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(deleteButton);
        buttonPanel.add(updateButton);

        contactsFrame.add(new JScrollPane(contactsList), BorderLayout.CENTER);
        contactsFrame.add(buttonPanel, BorderLayout.SOUTH);

        contactsFrame.setVisible(true);
    }
}
