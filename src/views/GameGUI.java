package views;

import utilities.QuestionsDB;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import utilities.Users;

public class GameGUI extends javax.swing.JFrame {
    
    DefaultTableModel model;
    
    public GameGUI() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.setTitle("Preguntas & Respuestas // Juguemos");
        
        String[] titulo = {"Pregunta", "Categoría"};
        model = new DefaultTableModel(null, titulo);
        jtQuestion.setModel(model);
        mostrarPregunta();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnB = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        jlBienvenida = new javax.swing.JLabel();
        jlScore = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnScore = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtQuestion = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 420));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 420));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnB.setBackground(new java.awt.Color(0, 0, 0));
        btnB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnB.setForeground(new java.awt.Color(255, 255, 255));
        btnB.setText("B");
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });
        jPanel1.add(btnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 320, 50));

        btnA.setBackground(new java.awt.Color(0, 0, 0));
        btnA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnA.setForeground(new java.awt.Color(255, 255, 255));
        btnA.setText("A");
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });
        jPanel1.add(btnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 320, 50));

        btnC.setBackground(new java.awt.Color(0, 0, 0));
        btnC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnC.setForeground(new java.awt.Color(255, 255, 255));
        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        jPanel1.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 320, 50));

        btnD.setBackground(new java.awt.Color(0, 0, 0));
        btnD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnD.setForeground(new java.awt.Color(255, 255, 255));
        btnD.setText("D");
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });
        jPanel1.add(btnD, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 320, 50));

        jlBienvenida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlBienvenida.setForeground(new java.awt.Color(0, 0, 0));
        jlBienvenida.setText("Bienvenido");
        jPanel1.add(jlBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 300, -1));

        jlScore.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlScore.setForeground(new java.awt.Color(0, 0, 0));
        jlScore.setText("Score: ");
        jPanel1.add(jlScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 130, -1));

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, -1, -1));

        btnScore.setBackground(new java.awt.Color(0, 0, 0));
        btnScore.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnScore.setForeground(new java.awt.Color(255, 255, 255));
        btnScore.setText("Puntaje");
        btnScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScoreActionPerformed(evt);
            }
        });
        jPanel1.add(btnScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, -1, -1));

        jtQuestion.setBackground(new java.awt.Color(204, 204, 204));
        jtQuestion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtQuestion.setForeground(new java.awt.Color(0, 0, 0));
        jtQuestion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtQuestion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 650, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarPregunta() {
        QuestionsDB conexion = new QuestionsDB();
        
        try {
            ResultSet pregunta = conexion.consultar("SELECT q.Question, q.Category "
                    + "FROM questions q "
                    + "ORDER BY random()"
                    + "LIMIT 1;");
            
            while (pregunta.next()) {                
                String[] datos = {pregunta.getString("Question"),
                pregunta.getString("Category")};
                model.addRow(datos);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBActionPerformed

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(NORMAL);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScoreActionPerformed
        // TODO add your handling code here:
        ScoreGUI score = new ScoreGUI();
        score.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnScoreActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnScore;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlBienvenida;
    private javax.swing.JLabel jlScore;
    private javax.swing.JTable jtQuestion;
    // End of variables declaration//GEN-END:variables
}
