/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author danielh
 */
public class MainFrame extends javax.swing.JFrame {

	/**
	 * Creates new form MainFrame
	 */
	public MainFrame() {
		initComponents();
		this.setLocationRelativeTo(this);
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING:
	 * Do NOT modify this code. The content of this method is always regenerated by the
	 * Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        TEXTO2 = new javax.swing.JLabel();
        TEXTO = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        placeholde1 = new javax.swing.JMenu();
        placeholder2 = new javax.swing.JMenu();
        menuSistema = new javax.swing.JMenu();
        terminarSesionBtn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ventana principal");
        setBackground(new java.awt.Color(255, 255, 255));
        setName("mainframe"); // NOI18N
        setPreferredSize(new java.awt.Dimension(500, 300));
        setResizable(false);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setMinimumSize(new java.awt.Dimension(500, 300));
        panel.setPreferredSize(new java.awt.Dimension(500, 260));

        TEXTO2.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        TEXTO2.setText("Ctrl+Shift+Q  para terminar la sesion");

        TEXTO.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        TEXTO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TEXTO.setText("PROGRAMA PRINCIPAL");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(TEXTO2)
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TEXTO)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TEXTO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(TEXTO2)
                .addContainerGap())
        );

        barraMenu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        barraMenu.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        barraMenu.setMinimumSize(new java.awt.Dimension(128, 30));

        placeholde1.setText("...");
        barraMenu.add(placeholde1);

        placeholder2.setText("...");
        barraMenu.add(placeholder2);

        menuSistema.setText("Sistema");

        terminarSesionBtn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        terminarSesionBtn.setText("Terminar sesion");
        terminarSesionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarSesionBtnActionPerformed(evt);
            }
        });
        menuSistema.add(terminarSesionBtn);

        barraMenu.add(menuSistema);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void terminarSesionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarSesionBtnActionPerformed
		LoginFrame.LoggedIn = false;
		LoginFrame loginFrame = new LoginFrame();
		loginFrame.setVisible(true);
		this.dispose();
    }//GEN-LAST:event_terminarSesionBtnActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				//if (LoginFrame.LoggedIn)
				//{
					new MainFrame().setVisible(true);
				//}
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TEXTO;
    private javax.swing.JLabel TEXTO2;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenu menuSistema;
    private javax.swing.JPanel panel;
    private javax.swing.JMenu placeholde1;
    private javax.swing.JMenu placeholder2;
    private javax.swing.JMenuItem terminarSesionBtn;
    // End of variables declaration//GEN-END:variables
}
