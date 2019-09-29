package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(219, 27, 48, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("       \u0417\u0434\u0440\u0430\u0432\u0441\u0442\u0432\u0443\u0439, \u041F\u043E\u0432\u0430\u0440 ! \u041E\u0442\u0432\u0435\u0442\u044C \u043D\u0430 \u043D\u0435\u0441\u043A\u043E\u043B\u044C\u043A\u043E \u0432\u043E\u043F\u0440\u043E\u0441\u043E\u0432, \u0434\u043B\u044F \u0442\u043E\u0433\u043E \u0447\u0442\u043E\u0431\u044B \u0442\u0435\u0431\u044F \u0438\u0434\u0438\u043D\u0446\u0438\u0444\u0438\u0446\u0438\u0440\u043E\u0432\u0430\u043B\u0438.");
		label_1.setBounds(152, 11, 498, 89);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("     \u0424\u0418\u041E");
		label_2.setBounds(10, 86, 48, 14);
		contentPane.add(label_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(68, 86, 696, 16);
		contentPane.add(textArea);
		
		JLabel label_3 = new JLabel("  \u041B\u044E\u0431\u043E\u0439 \u043F\u043E\u0432\u0430\u0440 \u0434\u043E\u043B\u0436\u0435\u043D \u0437\u043D\u0430\u0442\u044C \u0430\u043D\u0435\u043A\u0434\u043E\u0442, \u0432 \u043A\u043E\u0442\u043E\u0440\u043E\u043C \u043F\u043E\u0432\u0430\u0440 \u0441\u043F\u0440\u0430\u0448\u0438\u0432\u0430\u0435\u0442 \u043F\u043E\u0432\u0430\u0440\u0430, \u043A\u0442\u043E \u0442\u044B \u043F\u043E \u043F\u0440\u043E\u0444\u0435\u0441\u0441\u0438\u0438 ,\u043F\u043E\u0432\u0430\u0440 ? \u0427\u0442\u043E \u043E\u0442\u0432\u0435\u0447\u0430\u0435\u0442 \u043F\u043E\u0432\u0430\u0440 ?");
		label_3.setBounds(20, 111, 744, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("  ");
		label_4.setBounds(20, 196, 48, 14);
		contentPane.add(label_4);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(30, 136, 734, 14);
		contentPane.add(textArea_1);
		
		JLabel label_5 = new JLabel("  \u041A\u0430\u043A\u043E\u0433\u043E \u0432\u044B \u043F\u043E\u043B\u0430 ?");
		label_5.setBounds(20, 161, 93, 14);
		contentPane.add(label_5);
		
		JRadioButton radioButton = new JRadioButton("\u041C\u0443\u0436\u0441\u043A\u043E\u0439");
		radioButton.setBounds(127, 157, 109, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_2 = new JRadioButton("\u041B\u0430\u043C\u0438\u043D\u0430\u0442");
		radioButton_2.setBounds(385, 157, 109, 23);
		contentPane.add(radioButton_2);
		
		JRadioButton radioButton_1 = new JRadioButton("\u0416\u0435\u043D\u0441\u043A\u0438\u0439");
		radioButton_1.setBounds(249, 157, 109, 23);
		contentPane.add(radioButton_1);
	}
}
