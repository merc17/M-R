/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fhx;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andreskis
 */
public class mainFrame extends javax.swing.JFrame {
    private int indexOfNewTab = 1;
    private PnlHome homePanel;
    private PnlGeneral pnlGeneral;
    private List<PnlFile> files;

    /**
     * Creates new form mainFrame
     */
    public mainFrame() {
        initComponents();
        pnlWelcome.removeAll();
        homePanel = new PnlHome();
        pnlWelcome.add(homePanel);
        homePanel.setSize(514, 118);
        homePanel.setVisible(true);
        pnlWelcome.revalidate();
        pnlWelcome.repaint();

        pnlNew.removeAll();
        pnlGeneral = new PnlGeneral();
        pnlNew.add(pnlGeneral);
        pnlGeneral.setSize(400, 260);
        pnlGeneral.setVisible(true);
        pnlNew.revalidate();
        pnlNew.repaint();

        files = new ArrayList<>();
        addPanel("String");
        addPanel("Test");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        tabs = new javax.swing.JTabbedPane();
        pnlWelcome = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        pnlNew = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextPane2.setEditable(false);
        jTextPane2.setText("Directions on how to use our software will be added here!!\n\n\nTo create a new sample select \"File->New Sample\"");
        jScrollPane3.setViewportView(jTextPane2);

        javax.swing.GroupLayout pnlWelcomeLayout = new javax.swing.GroupLayout(pnlWelcome);
        pnlWelcome.setLayout(pnlWelcomeLayout);
        pnlWelcomeLayout.setHorizontalGroup(
            pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlWelcomeLayout.createSequentialGroup()
                .addContainerGap(488, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        pnlWelcomeLayout.setVerticalGroup(
            pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlWelcomeLayout.createSequentialGroup()
                .addContainerGap(224, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        tabs.addTab("Welcome", pnlWelcome);

        javax.swing.GroupLayout pnlNewLayout = new javax.swing.GroupLayout(pnlNew);
        pnlNew.setLayout(pnlNewLayout);
        pnlNewLayout.setHorizontalGroup(
            pnlNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 941, Short.MAX_VALUE)
        );
        pnlNewLayout.setVerticalGroup(
            pnlNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        tabs.addTab("New", pnlNew);

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
        );

        jMenu1.setText("File");

        jMenuItem1.setText("New Sample");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Save All");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Export File");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Import File");
        jMenu1.add(jMenuItem5);

        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        //TODO Check to save file
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.tabs.setSelectedIndex(indexOfNewTab);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

//   /**
//    @param args the command line arguments
//    */
//   public static void main(String args[])
//   {
//      /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//       * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//       */
//      try
//      {
//         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
//         {
//            if ("Nimbus".equals(info.getName()))
//            {
//               javax.swing.UIManager.setLookAndFeel(info.getClassName());
//               break;
//            }
//         }
//      }
//      catch (ClassNotFoundException ex)
//      {
//         java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//      }
//      catch (InstantiationException ex)
//      {
//         java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//      }
//      catch (IllegalAccessException ex)
//      {
//         java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//      }
//      catch (javax.swing.UnsupportedLookAndFeelException ex)
//      {
//         java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//      }
//        //</editor-fold>
//
//      /* Create and display the form */
//      java.awt.EventQueue.invokeLater(new Runnable()
//      {
//         public void run()
//         {
//            
//            new mainFrame().setVisible(true);
//            
//         }
//      });
//   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlNew;
    private javax.swing.JPanel pnlWelcome;
    private javax.swing.JTabbedPane tabs;
    // End of variables declaration//GEN-END:variables

    private void addPanel(String title) {
        tabs.remove(indexOfNewTab);
        PnlFile tmp = new PnlFile();
        files.add(tmp);
        tabs.addTab(title, tmp);
        //Icon icon = new MetalIconFactory.PaletteCloseIcon();
        //tabs.insertTab(title, icon, tmp, title, indexOfNewTab);
        tabs.add("New", pnlNew);
        indexOfNewTab++;
        
    }

}
