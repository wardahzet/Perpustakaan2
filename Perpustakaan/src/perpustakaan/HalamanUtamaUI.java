/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;


public class HalamanUtamaUI extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public HalamanUtamaUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuPencarian = new javax.swing.JMenu();
        menuPeminjaman = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuPencarian.setText("Pencarian");
        menuPencarian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPencarianMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuPencarian);

        menuPeminjaman.setText("Peminjaman");
        menuPeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPeminjamanMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuPeminjaman);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 257, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 135, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuPencarianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPencarianMouseClicked
        Perpustakaan.controllerPencarian = new PencarianController();
        Perpustakaan.controllerPencarian.showFormPencarian();
    }//GEN-LAST:event_menuPencarianMouseClicked

    private void menuPeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPencarianMouseClicked
        Perpustakaan.controllerPeminjaman = new PeminjamanController();
        Perpustakaan.controllerPeminjaman.showFormPeminjaman();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuPeminjaman;
    private javax.swing.JMenu menuPencarian;
    // End of variables declaration//GEN-END:variables
}
