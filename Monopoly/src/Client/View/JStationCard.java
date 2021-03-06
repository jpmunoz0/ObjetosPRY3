/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client.View;

/**
 *
 * @author macgarcia
 */
public class JStationCard extends javax.swing.JPanel {

    /**
     * Creates new form JStationCard
     */
    public JStationCard() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel_Name = new javax.swing.JLabel();
        jLabel_0Houses = new javax.swing.JLabel();
        jLabel_1HouseRnt = new javax.swing.JLabel();
        jLabel_2HouseRnt = new javax.swing.JLabel();
        jLabel_3HouseRnt = new javax.swing.JLabel();
        jLabel_HotelRnt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel_Name.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Name.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        jLabel_Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Name.setText("Station");
        jLabel_Name.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jLabel_Name.setOpaque(true);

        jLabel_0Houses.setFont(new java.awt.Font("Futura", 1, 14)); // NOI18N
        jLabel_0Houses.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_0Houses.setText("Rent                                   $25     ");

        jLabel_1HouseRnt.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        jLabel_1HouseRnt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_1HouseRnt.setText(" If 2 railroads are owned              $50");

        jLabel_2HouseRnt.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        jLabel_2HouseRnt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_2HouseRnt.setText(" If 3 railroads are owned              $100");

        jLabel_3HouseRnt.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        jLabel_3HouseRnt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_3HouseRnt.setText(" If 4 railroads are owned              $200");

        jLabel_HotelRnt.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        jLabel_HotelRnt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_HotelRnt.setText("Mortgage Value $100");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Client/View/IconImages/Train.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_2HouseRnt, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel_3HouseRnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_1HouseRnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_0Houses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel_HotelRnt, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel_0Houses)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_1HouseRnt)
                .addGap(12, 12, 12)
                .addComponent(jLabel_2HouseRnt)
                .addGap(12, 12, 12)
                .addComponent(jLabel_3HouseRnt)
                .addGap(18, 18, 18)
                .addComponent(jLabel_HotelRnt)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel_0Houses;
    public javax.swing.JLabel jLabel_1HouseRnt;
    public javax.swing.JLabel jLabel_2HouseRnt;
    public javax.swing.JLabel jLabel_3HouseRnt;
    public javax.swing.JLabel jLabel_HotelRnt;
    public javax.swing.JLabel jLabel_Name;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
