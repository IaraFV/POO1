package TelaRecebeValor;

import cliente.ClienteLance;
import TelaLeilao.Telaleilao;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Iara
 */
public class TelaRecebeValor extends javax.swing.JFrame {
    
    private ArrayList<ClienteLance> lances = new ArrayList();

    public TelaRecebeValor() {
        Color cool = new Color (0x1F1A47);
        getContentPane().setBackground(cool);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNome = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtLance = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnEncerrar = new javax.swing.JButton();
        btnLance = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(txtNome);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 330, -1));

        jScrollPane4.setViewportView(txtLance);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 330, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Coloque os valores para dar seu lance:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 440, -1));

        jLabel3.setText("Valor do primeiro lance:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 170, 20));

        jLabel4.setText("Qual seu nome?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("*Voce tem direito a dar um lance na peça, se ele for aceito a peça é sua.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        btnEncerrar.setText("Encerrar");
        btnEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        btnLance.setText("Dar lance");
        btnLance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanceActionPerformed(evt);
            }
        });
        jPanel1.add(btnLance, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnLanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanceActionPerformed

        ClienteLance cl = new ClienteLance();
        
        cl.setNome(txtNome.getText());
        cl.setLance(Integer.parseInt(txtLance.getText()));
        
        lances.add(cl);
        txtNome.setText("");
        txtLance.setText("");
       
       /*
       for (int txtLance = 100; txtLance <= 3000; ++txtLance){
           if(txtLance >= 600 && txtLance <= 800) {
            JOptionPane.showMessageDialog(null,txtNome.getText().concat( " Seu lance foi muito baixo !"));                    
            } else if(txtLance >= 800 && txtLance <= 1100){
                JOptionPane.showMessageDialog(null,txtNome.getText().concat( " Seu lance foi muito baixo !"));
            } else if(txtLance >= 1100 && txtLance <= 1800){
                JOptionPane.showMessageDialog(null,txtNome.getText().concat( " Seu lance foi aceito!"));
            } else if(txtLance >= 1800 && txtLance <= 2300){
                JOptionPane.showMessageDialog(null,txtNome.getText().concat( " Seu lance foi aceito!"));
            } else if(txtLance >= 2300 && txtLance <= 3000){
                JOptionPane.showMessageDialog(null,txtNome.getText().concat( " Seu lance foi aceito!"));
            } else{
                JOptionPane.showMessageDialog(null,txtNome.getText().concat( " Ocorreu algum erro! "));
                break;
            }
       }*/
       
    }//GEN-LAST:event_btnLanceActionPerformed

    
  
    private void btnEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncerrarActionPerformed
       Telaleilao voltar = new Telaleilao();
       voltar.setVisible(true);
       
       int maior = 0;
       ClienteLance v = null;
       for(ClienteLance cl : lances){
           if(cl.getLance()> maior){
               maior = cl.getLance();
               v=cl;
               System.out.print("O lance vencedor é" + v);
           }
       }
    }//GEN-LAST:event_btnEncerrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new TelaRecebeValor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEncerrar;
    private javax.swing.JButton btnLance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextPane txtLance;
    private javax.swing.JTextPane txtNome;
    // End of variables declaration//GEN-END:variables
}