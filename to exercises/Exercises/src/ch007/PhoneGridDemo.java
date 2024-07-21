package ch007;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class PhoneGridDemo {
    private static String currentNumber = "";
    private static JTextField displayField;
    private static ArrayList<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {
        // Yeni bir JFrame penceresi oluşturuluyor
        JFrame frame = new JFrame("Telefon Tuş Takımı Demo: ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600); // Ekran boyutu iPhone arama ekranına daha uygun hale getirildi

        // Telefon tuş takımı paneli oluşturuluyor
        JPanel phonePad = new JPanel(new GridLayout(4, 3, 5, 5)); // GridLayout satır ve sütun sayısı 4x3 olarak ayarlandı
        phonePad.setBackground(Color.decode("#EFF4F7")); // Arka plan rengi ayarlandı

        // 12 buton oluşturuluyor ve panel'e ekleniyor, yukarıdan aşağıya ve soldan sağa sırayla
        phonePad.add(createButton("1"));
        phonePad.add(createButton("2"));
        phonePad.add(createButton("3"));

        phonePad.add(createButton("4"));
        phonePad.add(createButton("5"));
        phonePad.add(createButton("6"));

        phonePad.add(createButton("7"));
        phonePad.add(createButton("8"));
        phonePad.add(createButton("9"));

        phonePad.add(createButton("*"));
        phonePad.add(createButton("0"));
        phonePad.add(createButton("#"));

        // Telefon tuş takımı paneli çerçeveye ekleniyor
        frame.add(phonePad, BorderLayout.CENTER);

        // Ekranın üst kısmında bir boşluk bırakmak için üst panel ekleniyor
        JPanel topPanel = new JPanel();
        topPanel.setPreferredSize(new Dimension(400, 150)); // Üst panel boyutu ayarlanıyor
        topPanel.setBackground(Color.decode("#A5C4BD")); // Arka plan rengi ayarlandı
        topPanel.setLayout(new BorderLayout());

        // Display field oluşturuluyor
        displayField = new JTextField();
        displayField.setFont(new Font("Arial", Font.PLAIN, 24)); // Font boyutu ayarlandı
        displayField.setHorizontalAlignment(JTextField.CENTER);
        displayField.setEditable(false);
        displayField.setBackground(Color.decode("#EFF4F7"));
        displayField.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        topPanel.add(displayField, BorderLayout.CENTER);

        // Kayıt ve Kayıtlarım butonları ekleniyor
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        buttonPanel.setBackground(Color.decode("#A5C4BD"));
        JButton saveButton = new JButton("Kayıt");
        saveButton.setFont(new Font("Arial", Font.PLAIN, 16));
        saveButton.setBackground(Color.decode("#8E9A9A"));
        saveButton.setForeground(Color.WHITE);
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!currentNumber.isEmpty()) {
                    saveContact();
                }
            }
        });
        JButton viewContactsButton = new JButton("Kayıtlarım");
        viewContactsButton.setFont(new Font("Arial", Font.PLAIN, 16));
        viewContactsButton.setBackground(Color.decode("#69716F"));
        viewContactsButton.setForeground(Color.WHITE);
        viewContactsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewContacts();
            }
        });

        buttonPanel.add(saveButton);
        buttonPanel.add(viewContactsButton);

        topPanel.add(buttonPanel, BorderLayout.SOUTH);

        frame.add(topPanel, BorderLayout.NORTH);

        // JFrame görünür yapılıyor
        frame.setVisible(true);
    }

    // Buton oluşturma metodunu basitleştirmek için yardımcı bir metod oluşturuluyor
    private static JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.PLAIN, 24)); // Font boyutu ayarlandı
        button.setFocusPainted(false); // Buton odak göstergesi kapatıldı
        button.setBackground(Color.decode("#003664")); // Buton arka plan rengi ayarlandı
        button.setForeground(Color.WHITE); // Buton yazı rengi ayarlandı

        // Butona tıklama sesi ekleniyor ve display alanına basılan sayı ekleniyor
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentNumber += text;
                displayField.setText(currentNumber);
                playClickSound();
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

    // Kayıt işlemi için metod
    private static void saveContact() {
        String name = JOptionPane.showInputDialog("İsim ve Soyisim giriniz:");
        if (name != null && !name.isEmpty()) {
            contacts.add(new Contact(name, currentNumber));
            currentNumber = "";
            displayField.setText("");
            JOptionPane.showMessageDialog(null, "Kayıt başarıyla eklendi.");
        }
    }

    // Kayıtları görüntülemek için metod
    private static void viewContacts() {
        JFrame contactsFrame = new JFrame("Kayıtlarım");
        contactsFrame.setSize(400, 300);
        contactsFrame.setLayout(new BorderLayout());

        JTextArea contactsArea = new JTextArea();
        contactsArea.setEditable(false);
        for (Contact contact : contacts) {
            contactsArea.append(contact.getName() + " - " + contact.getNumber() + "\n");
        }

        JScrollPane scrollPane = new JScrollPane(contactsArea);
        contactsFrame.add(scrollPane, BorderLayout.CENTER);

        // Sil ve Güncelle butonları için panel
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        buttonPanel.setBackground(Color.decode("#A5C4BD"));

        JButton deleteButton = new JButton("Sil");
        deleteButton.setBackground(Color.decode("#8E9A9A"));
        deleteButton.setForeground(Color.WHITE);
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numberToDelete = JOptionPane.showInputDialog("Silinecek numarayı giriniz:");
                if (numberToDelete != null && !numberToDelete.isEmpty()) {
                    contacts.removeIf(contact -> contact.getNumber().equals(numberToDelete));
                    contactsArea.setText("");
                    for (Contact contact : contacts) {
                        contactsArea.append(contact.getName() + " - " + contact.getNumber() + "\n");
                    }
                }
            }
        });

        JButton updateButton = new JButton("Güncelle");
        updateButton.setBackground(Color.decode("#69716F"));
        updateButton.setForeground(Color.WHITE);
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numberToUpdate = JOptionPane.showInputDialog("Güncellenecek numarayı giriniz:");
                if (numberToUpdate != null && !numberToUpdate.isEmpty()) {
                    for (Contact contact : contacts) {
                        if (contact.getNumber().equals(numberToUpdate)) {
                            String newName = JOptionPane.showInputDialog("Yeni isim ve soyisim giriniz:");
                            if (newName != null && !newName.isEmpty()) {
                                contact.setName(newName);
                                contactsArea.setText("");
                                for (Contact c : contacts) {
                                    contactsArea.append(c.getName() + " - " + c.getNumber() + "\n");
                                }
                            }
                            break;
                        }
                    }
                }
            }
        });

        buttonPanel.add(deleteButton);
        buttonPanel.add(updateButton);

        contactsFrame.add(buttonPanel, BorderLayout.SOUTH);
        contactsFrame.setVisible(true);
    }
}



