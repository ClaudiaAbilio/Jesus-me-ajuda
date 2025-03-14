/*
 Atividade 3 - UC9 - Claudia Abilio - V1
 */

import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicaoPressao extends javax.swing.JFrame {

    public static List<Medicao> medicoes;

   
    public MedicaoPressao() {

        BufferedImage img = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        setIconImage(img);
        medicoes = new ArrayList<>();
        initComponents();
        posInitComponents();
        carregarDados();
    }

    private void posInitComponents() {
        lblData.setDisplayedMnemonic(KeyEvent.VK_A);
        lblHora.setDisplayedMnemonic(KeyEvent.VK_H);
        lblSistolica.setDisplayedMnemonic(KeyEvent.VK_S);
        lblSistolica.setDisplayedMnemonicIndex(8);
        lblDiastolica.setDisplayedMnemonic(KeyEvent.VK_D);
        btnSalvar.setMnemonic(KeyEvent.VK_V);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPanePrincipal = new javax.swing.JLayeredPane();
        lblHora = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        lblSistolica = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        lblData = new javax.swing.JLabel();
        lblDiastolica = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMedicoes = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        chkStress = new javax.swing.JCheckBox();
        lblHistorico = new javax.swing.JLabel();
        txtDiastolica = new javax.swing.JTextField();
        txtSistolica = new javax.swing.JTextField();
        lblLegenda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cardio Soft");
        setBackground(new java.awt.Color(0, 102, 102));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLayeredPanePrincipal.setBackground(new java.awt.Color(75, 123, 146));
        jLayeredPanePrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLayeredPanePrincipal.setToolTipText("Insira as medições de pressão para armazenamento");
        jLayeredPanePrincipal.setOpaque(true);

        lblHora.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblHora.setLabelFor(txtHora);
        lblHora.setText("Hora:");

        txtData.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtData.setToolTipText("Insira a data da aferição da pressão arterial");
        txtData.setActionCommand("null");
        txtData.setNextFocusableComponent(txtHora);
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        lblSistolica.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblSistolica.setLabelFor(txtSistolica);
        lblSistolica.setText("Pressão Sistólica:");
        lblSistolica.setDisplayedMnemonicIndex(8);

        txtHora.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtHora.setToolTipText("Insira a hora da aferição da pressão arterial");
        txtHora.setActionCommand("null");
        txtHora.setNextFocusableComponent(chkStress);
        txtHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraActionPerformed(evt);
            }
        });

        lblData.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblData.setLabelFor(txtData);
        lblData.setText("Data:");
        lblData.setToolTipText("Insira a data da aferição da pressão arterial");

        lblDiastolica.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblDiastolica.setLabelFor(txtDiastolica);
        lblDiastolica.setText("Pressão Diastólica:");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Medição de Pressão Cardíaca");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblMedicoes.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        tblMedicoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Hora", "Pressão Sistólica", "Pressão Diastólica", "Estresse"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblMedicoes.setRowHeight(30);
        jScrollPane1.setViewportView(tblMedicoes);

        btnSalvar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        chkStress.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        chkStress.setMnemonic('E');
        chkStress.setText("Estresse ?");
        chkStress.setToolTipText("Estava com alto nível de Estresse?");
        chkStress.setDoubleBuffered(true);
        chkStress.setNextFocusableComponent(txtSistolica);

        lblHistorico.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblHistorico.setText("Histórico:");

        txtDiastolica.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtDiastolica.setToolTipText("Insira o valor da pressão Diastólica");
        txtDiastolica.setActionCommand("null");
        txtDiastolica.setNextFocusableComponent(btnSalvar);
        txtDiastolica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiastolicaActionPerformed(evt);
            }
        });

        txtSistolica.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtSistolica.setToolTipText("Insira o valor da pressão Sistólica");
        txtSistolica.setActionCommand("null");
        txtSistolica.setNextFocusableComponent(txtDiastolica);
        txtSistolica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSistolicaActionPerformed(evt);
            }
        });

        lblLegenda.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblLegenda.setLabelFor(txtSistolica);
        lblLegenda.setText("Utilize as teclas de atalho para acessar os Campos (ex: ALT+A)");

        jLayeredPanePrincipal.setLayer(lblHora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPanePrincipal.setLayer(txtData, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPanePrincipal.setLayer(lblSistolica, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPanePrincipal.setLayer(txtHora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPanePrincipal.setLayer(lblData, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPanePrincipal.setLayer(lblDiastolica, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPanePrincipal.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPanePrincipal.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPanePrincipal.setLayer(btnSalvar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPanePrincipal.setLayer(chkStress, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPanePrincipal.setLayer(lblHistorico, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPanePrincipal.setLayer(txtDiastolica, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPanePrincipal.setLayer(txtSistolica, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPanePrincipal.setLayer(lblLegenda, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPanePrincipalLayout = new javax.swing.GroupLayout(jLayeredPanePrincipal);
        jLayeredPanePrincipal.setLayout(jLayeredPanePrincipalLayout);
        jLayeredPanePrincipalLayout.setHorizontalGroup(
            jLayeredPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPanePrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jLayeredPanePrincipalLayout.createSequentialGroup()
                        .addGroup(jLayeredPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPanePrincipalLayout.createSequentialGroup()
                                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPanePrincipalLayout.createSequentialGroup()
                                .addComponent(lblSistolica)
                                .addGap(18, 18, 18)
                                .addComponent(txtSistolica, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPanePrincipalLayout.createSequentialGroup()
                                .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(chkStress))
                            .addGroup(jLayeredPanePrincipalLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(lblDiastolica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDiastolica, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jLayeredPanePrincipalLayout.createSequentialGroup()
                        .addComponent(lblLegenda, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPanePrincipalLayout.createSequentialGroup()
                        .addComponent(lblHistorico)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)))
        );
        jLayeredPanePrincipalLayout.setVerticalGroup(
            jLayeredPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPanePrincipalLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkStress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDiastolica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDiastolica, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSistolica, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSistolica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblHistorico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jLayeredPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLegenda, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPanePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPanePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void txtHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        salvarMedicao();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        salvarDados();
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void txtDiastolicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiastolicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiastolicaActionPerformed

    private void txtSistolicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSistolicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSistolicaActionPerformed

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
            java.util.logging.Logger.getLogger(MedicaoPressao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicaoPressao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicaoPressao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicaoPressao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicaoPressao().setVisible(true);
            }
        });
    }

    private void salvarMedicao() {

        if (txtData.getText().isEmpty() || txtHora.getText().isEmpty() || txtSistolica.getText().isEmpty() || txtDiastolica.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Atenção: preencher todos os campos de texto !");
            return;

        }

        String data = txtData.getText().trim();
        String hora = txtHora.getText().trim();
        int sistolica = Integer.parseInt(txtSistolica.getText().trim());
        int diastolica = Integer.parseInt(txtDiastolica.getText().trim());
        boolean stress = chkStress.isSelected();
        
        if (!data.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")) {
            JOptionPane.showMessageDialog(this, "ATENÇÃO: Data inválida. Corrija o formato DD/MM/AAAA.");
            return;
        }
        if (!hora.matches("[0-9]{2}:[0-9]{2}")) {
            JOptionPane.showMessageDialog(this, "Atenção: Hora inválida! Use o formato hh:mm.");
            return;
        }
        
        Medicao medicao = new Medicao(data, hora, sistolica, diastolica, stress);
        adicionarMedicao(medicao);
    }

    public void adicionarMedicao(Medicao medicao) {
        medicoes.add(medicao);
        atualizarTabela();
    }

    private void atualizarTabela() {
        DefaultTableModel model = (DefaultTableModel) tblMedicoes.getModel();

        for (Medicao medicao : medicoes) {
            model.addRow(new Object[]{
                medicao.getData(),
                medicao.getHora(),
                medicao.getSistolica(),
                medicao.getDiastolica(),
                medicao.isStress()
            });
        }
    }

    private void salvarDados() {
        try ( BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("medicoes.csv"), "UTF-8"))) {
            for (int row = 0; row < tblMedicoes.getRowCount(); row++) {
                String data = (String) tblMedicoes.getValueAt(row, 0);
                String hora = (String) tblMedicoes.getValueAt(row, 1);
                int sistolica = (Integer) tblMedicoes.getValueAt(row, 2);
                int diastolica = (Integer) tblMedicoes.getValueAt(row, 3);
                boolean stress = (Boolean) tblMedicoes.getValueAt(row, 4);

                Medicao medicao = new Medicao(data, hora, sistolica, diastolica, stress);
                bw.write(medicao.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Atenção: Erro ao salvar os dados.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void carregarDados() {
        File file = new File("medicoes.csv");
        if (!file.exists()) {
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblMedicoes.getModel();
        try ( BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                String data = partes[0];
                String hora = partes[1];
                int sistolica = Integer.parseInt(partes[2]);
                int diastolica = Integer.parseInt(partes[3]);
                boolean stress = "Sim".equals(partes[4]);

                model.addRow(new Object[]{data, hora, sistolica, diastolica, stress});
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Atenção Erro ao carregar os dados !!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox chkStress;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPanePrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDiastolica;
    private javax.swing.JLabel lblHistorico;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblLegenda;
    private javax.swing.JLabel lblSistolica;
    private javax.swing.JTable tblMedicoes;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDiastolica;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtSistolica;
    // End of variables declaration//GEN-END:variables
}
