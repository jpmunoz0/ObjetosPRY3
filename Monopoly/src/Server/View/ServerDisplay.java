
package Server.View;

public class ServerDisplay extends javax.swing.JFrame {

    public ServerDisplay() {
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

        jPanel_BG = new javax.swing.JPanel();
        jButton_Run = new javax.swing.JButton();
        jSpinner_Players = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Status = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_Run.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton_Run.setText("Run");

        jSpinner_Players.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jSpinner_Players.setModel(new javax.swing.SpinnerNumberModel(2, 2, 6, 1));

        jTextArea_Status.setEditable(false);
        jTextArea_Status.setColumns(20);
        jTextArea_Status.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Status);

        javax.swing.GroupLayout jPanel_BGLayout = new javax.swing.GroupLayout(jPanel_BG);
        jPanel_BG.setLayout(jPanel_BGLayout);
        jPanel_BGLayout.setHorizontalGroup(
            jPanel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BGLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_BGLayout.createSequentialGroup()
                        .addComponent(jSpinner_Players, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Run, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel_BGLayout.setVerticalGroup(
            jPanel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_BGLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Run, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner_Players, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton_Run;
    public javax.swing.JPanel jPanel_BG;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JSpinner jSpinner_Players;
    public javax.swing.JTextArea jTextArea_Status;
    // End of variables declaration//GEN-END:variables
}
