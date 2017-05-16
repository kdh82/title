package kr.or.dgit.title.framework;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class TextField extends JPanel {
	private JTextField tF;
	private JLabel lblB;

	public TextField() {
		setLayout(new GridLayout(0, 2, 0, 0));

		lblB = new JLabel("New label");
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblB);

		tF = new JTextField();
		add(tF);
		tF.setColumns(10);

	}

	public JTextField gettF() {
		return tF;
	}

	public void settF(JTextField tF) {
		this.tF = tF;
	}

	public JLabel getLblB() {
		return lblB;
	}

	public void setLblB(JLabel lblB) {
		this.lblB = lblB;
	}

}
