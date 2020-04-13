package project.uas.cadangan;

public class ldgjframe extends javax.swing.JFrame {

    public ldgjframe() {
        initComponents();
    }

    public void mati() {
        setLocation(480,200);
        this.setVisible(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loading = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 270, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/uas/cadangan/newpackage/giphy (1).gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 370));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/uas/cadangan/newpackage/Copy of Season Sale Flyer template colorful - Made with PosterMyWall.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        ldgjframe lf = new ldgjframe();
        lf.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {

                if (true) {
                    Thread.sleep(50);
                    ldgjframe.loading.setValue(i);
                }
            }

            loginadmin log = new loginadmin();
            log.setVisible(true);
            lf.mati();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JProgressBar loading;
    // End of variables declaration//GEN-END:variables
}
