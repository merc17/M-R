/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fhx;

import firehistory.FireHistory;

/**

 @author gerhardyz
 */
public class PnlFile extends javax.swing.JPanel
{
   private PnlEditSitesData pnlEditSiteData;
   private PnlEditSiteInfo pnlEditSiteInfo;
   /**
    Creates new form pnl_file
    */
   public PnlFile(FireHistory f)
   {
      initComponents();
      pnlEditSiteData = new PnlEditSitesData();
      pnlHistData.removeAll();
      pnlHistData.add(pnlEditSiteData);
      pnlEditSiteData.setVisible(true);
      pnlHistData.revalidate();
      pnlHistData.repaint();
      
      
      pnlEditSiteInfo = new PnlEditSiteInfo();
      pnlInfo.removeAll();
      pnlInfo.add(pnlEditSiteInfo);
      this.setSize(pnlEditSiteInfo.getWidth(),pnlEditSiteInfo.getHeight());
      pnlEditSiteInfo.setVisible(true);
      pnlInfo.revalidate();
      pnlInfo.repaint();
   }

   /**
    This method is called from within the constructor to initialize the form.
    WARNING: Do NOT modify this code. The content of this method is always
    regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        pnlHistData = new javax.swing.JPanel();
        pnlInfo = new javax.swing.JPanel();

        pnlHistData.setPreferredSize(new java.awt.Dimension(963, 543));

        javax.swing.GroupLayout pnlHistDataLayout = new javax.swing.GroupLayout(pnlHistData);
        pnlHistData.setLayout(pnlHistDataLayout);
        pnlHistDataLayout.setHorizontalGroup(
            pnlHistDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlHistDataLayout.setVerticalGroup(
            pnlHistDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Fire History Data", pnlHistData);

        javax.swing.GroupLayout pnlInfoLayout = new javax.swing.GroupLayout(pnlInfo);
        pnlInfo.setLayout(pnlInfoLayout);
        pnlInfoLayout.setHorizontalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 914, Short.MAX_VALUE)
        );
        pnlInfoLayout.setVerticalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Site Information", pnlInfo);

        jTabbedPane3.setSelectedIndex(1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JPanel pnlHistData;
    private javax.swing.JPanel pnlInfo;
    // End of variables declaration//GEN-END:variables
}
