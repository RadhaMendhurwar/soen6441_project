/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kingdom.ui;

import java.util.List;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import kingdom.gameitems.Castle;
import kingdom.gameitems.Game;
import kingdom.gameitems.ItemLabel;
import kingdom.gameitems.Tile;
import kingdom.gameitems.User;
import kingdom.utiles.MoneyManager;

/**
 *
 * @author andriy
 */
public class UserPanel extends JPanel {

    public final String NAME;
    /* single tile owned by user */
    private Tile userTile;
    /* castles owned by user */
    private List<Castle> userCastles;
    /* all many owned by user */
    private int[] userWallet;
    
    private final JPanel pTop = new JPanel();
    private final JPanel pCenter = new JPanel();
    private final JPanel pButtom = new JPanel();

    public UserPanel(User user) {
        this.NAME = user.getUserName();
        init();
        updateProperties(user);
        userWallet = user.getWallet();
    }

    private void init() {
        // this panel
        setPreferredSize(new java.awt.Dimension(245, 200));
        setLayout(new java.awt.BorderLayout());
        
        pTop.setPreferredSize(new java.awt.Dimension(250, 70));
        pTop.setBackground(new java.awt.Color(232, 232, 240));
        pTop.setLayout(null);
        add(pTop, java.awt.BorderLayout.PAGE_START);

        pCenter.setBackground(new java.awt.Color(222, 222, 230));
        pCenter.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        pCenter.setPreferredSize(new java.awt.Dimension(250, 100));
        add(pCenter, java.awt.BorderLayout.CENTER);

        pButtom.setPreferredSize(new java.awt.Dimension(250, 60));
        pButtom.setBackground(new java.awt.Color(212, 212, 220));
        add(pButtom, java.awt.BorderLayout.PAGE_END);
    }

    private void updateProperties(User user) {
        this.userWallet = user.getWallet();
        this.userTile = user.getOwnedTile();
        this.userCastles = user.getCastles();

        drawUserInfo();
        drawTileAndCasles();
        drawMoney();
    }

    private void drawUserInfo() {
        pCenter.removeAll();
        pCenter.add(new JLabel("Gold total: " + MoneyManager.getTotal(userWallet)));
        pCenter.repaint();
    }

    
    private void drawTileAndCasles() {
        pButtom.removeAll();
        String iconPath;
        ItemLabel tempLabel = null;

        // first - draw user tile
        if (userTile != null) {
            tempLabel = new ItemLabel(userTile.toString());
            pButtom.add(tempLabel);
            addClickListeners(tempLabel);
            tempLabel.setItem(userTile);
        }

        // draw users castles
        for (Castle c : userCastles) {
            tempLabel = new ItemLabel();
            iconPath = "/res/24x24/" + String.valueOf(c.getColor()).toLowerCase().charAt(0) + String.valueOf(c.getRank()) + ".png";
            tempLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconPath)));
            pButtom.add(tempLabel);
            addClickListeners(tempLabel);
            tempLabel.setItem(c);
        }

        pButtom.repaint();
    }

    private void drawMoney() {
        pTop.removeAll();
        JLabel tempLabel;
        int width = 32;
        int height = 32;
        int x = 10;
        int y = 2;
        int xIncr = 40;
        int yIncr = 5;

        Icon ic1 = new javax.swing.ImageIcon(getClass().getResource("/res/coins/c1.png"));
        Icon ic5 = new javax.swing.ImageIcon(getClass().getResource("/res/coins/c5.png"));
        Icon ic10 = new javax.swing.ImageIcon(getClass().getResource("/res/coins/c10.png"));
        Icon ic50 = new javax.swing.ImageIcon(getClass().getResource("/res/coins/c50.png"));
        Icon ic100 = new javax.swing.ImageIcon(getClass().getResource("/res/coins/c100.png"));

        for (int i = 0; i < userWallet.length; ++i) {
            for (int m = 0; m < userWallet[i]; ++m) {
                tempLabel = new JLabel();
                switch (i) {
                    case MoneyManager.c1:
                        tempLabel.setIcon(ic1);
                        break;
                    case MoneyManager.c5:
                        tempLabel.setIcon(ic5);
                        break;
                    case MoneyManager.c10:
                        tempLabel.setIcon(ic10);
                        break;
                    case MoneyManager.c50:
                        tempLabel.setIcon(ic50);
                        break;
                    case MoneyManager.c100:
                        tempLabel.setIcon(ic100);
                        break;
                }
                pTop.add(tempLabel);
                tempLabel.setBounds(x, y, width, height);
                y += yIncr;
            }
            x += xIncr;
            y = 2;
        }
        pTop.repaint();
    }

    private void addClickListeners(final ItemLabel tempLabel) {
        tempLabel.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tempLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 255, 0)));
                Game.getInstance().setSelectedItem(tempLabel);
            }
        });
    }
    
    public void refreshUserPanel(){
        this.drawTileAndCasles();
        this.drawMoney();
        this.drawUserInfo();
    }
}
