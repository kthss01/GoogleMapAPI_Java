package practice.advance.mvc.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import practice.advance.mvc.common.GoogleMapTemplate;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;

public class OptionDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	public static void main(String[] args) {
		try {
			OptionDialog dialog = new OptionDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public OptionDialog() {
		setBounds(100, 100, 430, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(12, 23, 57, 15);
		contentPanel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(81, 20, 126, 21);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(12, 102, 57, 15);
		contentPanel.add(lblNewLabel_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(109, 99, 29, 22);
		contentPanel.add(spinner);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(12, 62, 57, 15);
		contentPanel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(81, 58, 57, 21);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(150, 58, 57, 21);
		contentPanel.add(textField_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(81, 138, 57, 21);
		contentPanel.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(12, 141, 57, 15);
		contentPanel.add(lblNewLabel_3);
		
		JList list = new JList();
		list.setBounds(245, 208, 156, 210);
		contentPanel.add(list);
		
		JPanel panel = new JPanel();
		panel.setBounds(235, 10, 166, 157);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(12, 10, 57, 15);
		panel.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(81, 7, 73, 21);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(12, 48, 57, 15);
		panel.add(lblNewLabel_5);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(81, 45, 73, 21);
		panel.add(comboBox_1);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(12, 90, 57, 15);
		panel.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(81, 87, 73, 21);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(12, 127, 57, 15);
		panel.add(lblNewLabel_7);
		
		textField_5 = new JTextField();
		textField_5.setBounds(81, 124, 73, 21);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(12, 208, 212, 210);
		contentPanel.add(textArea);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(344, 177, 57, 23);
		contentPanel.add(btnNewButton_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(301, 177, 36, 21);
		contentPanel.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(245, 177, 44, 21);
		contentPanel.add(comboBox_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(8, 179, 115, 23);
		contentPanel.add(chckbxNewCheckBox);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						GoogleMapTemplate.Map().setChanged(true);
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
