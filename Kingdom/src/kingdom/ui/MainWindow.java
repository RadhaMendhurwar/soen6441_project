/*
 * TEAM C in SOEN6441/WW
 */
package kingdom.ui;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import kingdom.gameitems.BoardCell;
import kingdom.gameitems.Castle;
import kingdom.gameitems.Game;
import kingdom.gameitems.Tile;
import kingdom.gameitems.User;

/**
 * Main window of the game. The window will show all properties of <code>Game.java</code>
 */
public class MainWindow extends javax.swing.JFrame implements PropertyChangeListener{
    
    private final Game theGame = Game.getInstance();

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        createCellZone();
        
        // register listeners
        theGame.addPropertyChangeListener(this);
        
        redrawFreeTiles();
        redrawFreeCastles();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        pnlGame = new javax.swing.JPanel();
        pnlRight = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelCastles = new javax.swing.JPanel();
        panelTiles = new javax.swing.JPanel();
        pnlUserInfo = new javax.swing.JPanel();
        lblUser0 = new javax.swing.JLabel();
        lblUser1 = new javax.swing.JLabel();
        lblUser2 = new javax.swing.JLabel();
        lblUser3 = new javax.swing.JLabel();
        lblUserTotal = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblUserCastle = new javax.swing.JLabel();
        lblUserTile = new javax.swing.JLabel();
        btnNextUser = new javax.swing.JButton();
        mnbTopMenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemSaveGame = new javax.swing.JMenuItem();
        itemLoadGame = new javax.swing.JMenuItem();
        itemStartWizard = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        actNextUser = new javax.swing.JMenuItem();

        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kingdom");
        setPreferredSize(new java.awt.Dimension(800, 700));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(751, 50));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 951, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel3.setBackground(new java.awt.Color(190, 204, 249));
        jPanel3.setAutoscrolls(true);
        jPanel3.setMinimumSize(new java.awt.Dimension(550, 100));
        jPanel3.setPreferredSize(new java.awt.Dimension(700, 523));

        pnlGame.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnlGame.setLayout(new java.awt.GridLayout(5, 6, 3, 3));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(pnlGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(518, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(pnlGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(468, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel3);

        pnlRight.setLayout(new java.awt.BorderLayout());

        jTabbedPane1.setBackground(new java.awt.Color(237, 236, 235));
        jTabbedPane1.addTab("Casles", panelCastles);
        jTabbedPane1.addTab("Tiles", panelTiles);

        pnlRight.add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pnlUserInfo.setBackground(new java.awt.Color(182, 242, 183));
        pnlUserInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlUserInfo.setAutoscrolls(true);
        pnlUserInfo.setPreferredSize(new java.awt.Dimension(245, 150));

        lblUser0.setText("user: ");

        lblUser1.setText("total $:");

        lblUser2.setText("castle:");

        lblUser3.setText("tile:");

        lblUserTotal.setText(" ");

        lblUserName.setText(" ");

        lblUserCastle.setText(" ");

        lblUserTile.setText(" ");

        btnNextUser.setText("Next");
        btnNextUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUserInfoLayout = new javax.swing.GroupLayout(pnlUserInfo);
        pnlUserInfo.setLayout(pnlUserInfoLayout);
        pnlUserInfoLayout.setHorizontalGroup(
            pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUser0)
                    .addComponent(lblUser1)
                    .addComponent(lblUser2)
                    .addComponent(lblUser3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserInfoLayout.createSequentialGroup()
                        .addGroup(pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserName)
                            .addComponent(lblUserTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                        .addComponent(btnNextUser))
                    .addGroup(pnlUserInfoLayout.createSequentialGroup()
                        .addGroup(pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserCastle)
                            .addComponent(lblUserTile))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlUserInfoLayout.setVerticalGroup(
            pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserInfoLayout.createSequentialGroup()
                .addGroup(pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserInfoLayout.createSequentialGroup()
                        .addGroup(pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUser0)
                            .addComponent(lblUserName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUser1)
                            .addComponent(lblUserTotal)))
                    .addComponent(btnNextUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser2)
                    .addComponent(lblUserCastle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser3)
                    .addComponent(lblUserTile))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pnlRight.add(pnlUserInfo, java.awt.BorderLayout.SOUTH);

        jSplitPane1.setRightComponent(pnlRight);

        jPanel1.add(jSplitPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");

        itemSaveGame.setText("Save Game");
        itemSaveGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSaveGameActionPerformed(evt);
            }
        });
        jMenu1.add(itemSaveGame);

        itemLoadGame.setText("Load Game");
        itemLoadGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLoadGameActionPerformed(evt);
            }
        });
        jMenu1.add(itemLoadGame);

        itemStartWizard.setText("Start Game");
        itemStartWizard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemStartWizardActionPerformed(evt);
            }
        });
        jMenu1.add(itemStartWizard);

        mnbTopMenu.add(jMenu1);

        jMenu2.setText("Start");

        actNextUser.setText("Next User (debug)");
        actNextUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actNextUserActionPerformed(evt);
            }
        });
        jMenu2.add(actNextUser);

        mnbTopMenu.add(jMenu2);

        setJMenuBar(mnbTopMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemSaveGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSaveGameActionPerformed
        boolean isSaved = Game.getInstance().saveAllConfigs();
        if(isSaved){
            JOptionPane.showMessageDialog(this, "Configuration Saved");
        } else {
            JOptionPane.showMessageDialog(this, "Problem saving Configuration", null, JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_itemSaveGameActionPerformed

    private void itemLoadGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLoadGameActionPerformed
        // TODO add your handling code here:
        boolean loadResult = Game.getInstance().loadAllConfigs();
        //redrawTiles(); //aaa
        if(loadResult){
            JOptionPane.showMessageDialog(this, "Configuration Loaded");
        } else {
            JOptionPane.showMessageDialog(this, "Problem loading Configuration", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_itemLoadGameActionPerformed

    private void itemStartWizardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemStartWizardActionPerformed
        StartWizard startWizard = new StartWizard(this, true);
        startWizard.setVisible(true);
    }//GEN-LAST:event_itemStartWizardActionPerformed

    private void actNextUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actNextUserActionPerformed
        showNextUser();
    }//GEN-LAST:event_actNextUserActionPerformed

    private void btnNextUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextUserActionPerformed
        showNextUser();
    }//GEN-LAST:event_btnNextUserActionPerformed

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel6MouseEntered

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem actNextUser;
    private javax.swing.JButton btnNextUser;
    private javax.swing.JMenuItem itemLoadGame;
    private javax.swing.JMenuItem itemSaveGame;
    private javax.swing.JMenuItem itemStartWizard;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblUser0;
    private javax.swing.JLabel lblUser1;
    private javax.swing.JLabel lblUser2;
    private javax.swing.JLabel lblUser3;
    private javax.swing.JLabel lblUserCastle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserTile;
    private javax.swing.JLabel lblUserTotal;
    private javax.swing.JMenuBar mnbTopMenu;
    private javax.swing.JPanel panelCastles;
    private javax.swing.JPanel panelTiles;
    private javax.swing.JPanel pnlGame;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JPanel pnlUserInfo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void dispose() {
        theGame.removePropertyChangeListener(this);
        super.dispose();
    }
    
    private void showNextUser() {
        
        User curUser = theGame.switchNextUser();
        
        if(curUser == null){
            return;
        }
        
        //show user info
        lblUserName.setText(curUser.getUserName());
        lblUserCastle.setText("" + curUser.getCastles());
        lblUserTile.setText("" + curUser.getOwnedTile());
        lblUserTotal.setText("" + curUser.getMoney());
        
    }

    private void createCellZone() {
         BoardCell[][] cells = theGame.getBoardCells();
         
         for(BoardCell row[]: cells){
             for(BoardCell cell: row){
                 pnlGame.add(cell);
             }
         }
         createNumericBorder();
         pack();
    }
    
    /* draw numbers for columns and rows */
    private void createNumericBorder(){
        int cellSpace = 3;
        int beginOffset = 10;
        int cellOffset = 60;
        JLabel horLab;
        
        // set columns numeration
        for(int i = 1; i < 7; ++i){
            horLab = new JLabel(String.valueOf(i));
            int xIncrement = (i - 1) * (BoardCell.SIDE + cellSpace);
            horLab.setBounds(cellOffset + xIncrement, beginOffset, 20, 20);
            jPanel3.add(horLab);
        }
        
        // set rows numeration
        for(int i = 1; i < 6; ++i){
            horLab = new JLabel(String.valueOf(i));
            int yIncrement = (i - 1) * (BoardCell.SIDE + cellSpace);
            horLab.setBounds(beginOffset, (cellOffset + beginOffset) + yIncrement, 20, 20);
            jPanel3.add(horLab);
        }
    }
    
    private void redrawFreeTiles(){
        panelTiles.removeAll();
        JLabel tempLabel;
        for(Tile t : theGame.getFreeTiles()){
            tempLabel = new JLabel("" + t.toString());
            panelTiles.add(tempLabel);
        }
        panelTiles.validate();
        panelTiles.repaint();
    }

    private void redrawFreeCastles(){
        panelCastles.removeAll();
        String iconPath;
        JLabel tempLabel;
        
         for(Castle c : theGame.getFreeCastles()){
            tempLabel = new JLabel();
            iconPath = "/res/" + String.valueOf(c.getColor()).toLowerCase().charAt(0) + String.valueOf(c.getRank()) + ".png";
            tempLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconPath)));
            panelCastles.add(tempLabel);
        }
        panelCastles.validate();
        panelCastles.repaint();
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String propName = evt.getPropertyName();
        if(Game.PROP_SET_CONFIG.equals(propName)){
            redrawFreeTiles();
            redrawFreeCastles();
        }
    }
}
