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
	private JTextField textFieldLocation;
	private JTextField textFieldSizeX;
	private JTextField textFieldSizeY;
	private JTextField textFieldMarkerLocation;
	private JTextField textFieldMarkerColor;
	private JTextField textFieldMarkerLabel;

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
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setBounds(12, 23, 57, 15);
		contentPanel.add(lblLocation);
		
		textFieldLocation = new JTextField();
		textFieldLocation.setBounds(81, 20, 126, 21);
		contentPanel.add(textFieldLocation);
		textFieldLocation.setColumns(10);
		
		JLabel lblZoomLevel = new JLabel("Zoom Level");
		lblZoomLevel.setBounds(12, 102, 73, 15);
		contentPanel.add(lblZoomLevel);
		
		JSpinner spinnerZoomLevel = new JSpinner();
		spinnerZoomLevel.setBounds(109, 99, 29, 22);
		contentPanel.add(spinnerZoomLevel);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setBounds(12, 62, 57, 15);
		contentPanel.add(lblSize);
		
		textFieldSizeX = new JTextField();
		textFieldSizeX.setBounds(81, 58, 57, 21);
		contentPanel.add(textFieldSizeX);
		textFieldSizeX.setColumns(10);
		
		textFieldSizeY = new JTextField();
		textFieldSizeY.setColumns(10);
		textFieldSizeY.setBounds(150, 58, 57, 21);
		contentPanel.add(textFieldSizeY);
		
		JComboBox comboBoxMaptype = new JComboBox();
		comboBoxMaptype.setBounds(81, 138, 126, 21);
		contentPanel.add(comboBoxMaptype);
		
		JLabel lblMaptype = new JLabel("Maptype");
		lblMaptype.setBounds(12, 141, 57, 15);
		contentPanel.add(lblMaptype);
		
		JList listMarker = new JList();
		listMarker.setBounds(245, 241, 156, 177);
		contentPanel.add(listMarker);
		
		JPanel panelMarkerParameter = new JPanel();
		panelMarkerParameter.setBounds(235, 10, 166, 188);
		contentPanel.add(panelMarkerParameter);
		panelMarkerParameter.setLayout(null);
		
		JLabel lblMarkerLocation = new JLabel("Location");
		lblMarkerLocation.setBounds(12, 10, 57, 15);
		panelMarkerParameter.add(lblMarkerLocation);
		
		textFieldMarkerLocation = new JTextField();
		textFieldMarkerLocation.setBounds(81, 7, 73, 21);
		panelMarkerParameter.add(textFieldMarkerLocation);
		textFieldMarkerLocation.setColumns(10);
		
		JLabel lblMarkerSize = new JLabel("Size");
		lblMarkerSize.setBounds(12, 43, 57, 15);
		panelMarkerParameter.add(lblMarkerSize);
		
		JComboBox comboBoxMarkerSize = new JComboBox();
		comboBoxMarkerSize.setBounds(81, 42, 73, 21);
		panelMarkerParameter.add(comboBoxMarkerSize);
		
		JLabel lblMarkerColor = new JLabel("Color");
		lblMarkerColor.setBounds(12, 71, 57, 15);
		panelMarkerParameter.add(lblMarkerColor);
		
		textFieldMarkerColor = new JTextField();
		textFieldMarkerColor.setBounds(81, 85, 73, 21);
		panelMarkerParameter.add(textFieldMarkerColor);
		textFieldMarkerColor.setColumns(10);
		
		JLabel lblMarkerLabel = new JLabel("Label");
		lblMarkerLabel.setBounds(12, 118, 57, 15);
		panelMarkerParameter.add(lblMarkerLabel);
		
		textFieldMarkerLabel = new JTextField();
		textFieldMarkerLabel.setBounds(81, 122, 73, 21);
		panelMarkerParameter.add(textFieldMarkerLabel);
		textFieldMarkerLabel.setColumns(10);
		
		JComboBox comboBoxMarkerColor = new JComboBox();
		comboBoxMarkerColor.setBounds(12, 87, 57, 21);
		panelMarkerParameter.add(comboBoxMarkerColor);
		
		JComboBox comboBoxMarkerLabel = new JComboBox();
		comboBoxMarkerLabel.setBounds(22, 136, 47, 21);
		panelMarkerParameter.add(comboBoxMarkerLabel);
		
		JButton btnMarkerAdd = new JButton("Add");
		btnMarkerAdd.setBounds(81, 155, 73, 23);
		panelMarkerParameter.add(btnMarkerAdd);
		
		JTextArea textAreaMarker = new JTextArea();
		textAreaMarker.setBounds(12, 208, 212, 210);
		contentPanel.add(textAreaMarker);
		
		JCheckBox chckbxShowAllMarkers = new JCheckBox("Show All Markers");
		chckbxShowAllMarkers.setBounds(8, 179, 133, 23);
		contentPanel.add(chckbxShowAllMarkers);
		
		JButton btnMarkerDelete = new JButton("Delete");
		btnMarkerDelete.setBounds(329, 208, 73, 23);
		contentPanel.add(btnMarkerDelete);
		
		JButton btnMarekrsClear = new JButton("Clear");
		btnMarekrsClear.setBounds(245, 208, 72, 23);
		contentPanel.add(btnMarekrsClear);
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
