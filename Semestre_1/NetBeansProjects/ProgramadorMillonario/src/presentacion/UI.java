package presentacion;
import controlador.PreguntasController;
/**
 *
 * @author Johan Rengifo
 */
public class UI extends javax.swing.JFrame {

    PreguntasController game = new PreguntasController();
    int num_pregunta = 0;

    public UI() {
        initComponents();
        // Labels Preguntas y Respuestas
        mostrarPregunta();
        // Puntaje
        lblPuntos.setText("Puntos: 0");
    }

    private void btnRespuestaActionPerformed(java.awt.event.ActionEvent evt, int numeroRespuesta) {
        String respuestaUsuario = obtenerRespuestaUsuario(numeroRespuesta);
        game.evaluarRespuesta(respuestaUsuario);

        // Avanzar a la siguiente pregunta
         num_pregunta++;

        // Mostrar la siguiente pregunta
        mostrarPregunta();
        
        // Puntos
        actualizarPuntos();
    }
    
    private void actualizarPuntos() {
        // Obtén los puntos del controlador y actualiza la etiqueta
        int puntos = game.obtenerPuntos();
        lblPuntos.setText("Puntos: " + puntos);
    }

    private String obtenerRespuestaUsuario(int numeroRespuesta) {
        switch (numeroRespuesta) {
            case 1:
                return "A";
            case 2:
                return "B";
            case 3:
                return "C";
            case 4:
                return "D";
            default:
                return "";
        }
    }

    public void mostrarPregunta() {
    String[][] preguntas = game.obtenerPreguntas();
        
    if (num_pregunta < preguntas.length) {
        // Lista Pregunta - Respuesta
        lblPregunta.setText(game.mostrarPregunta(num_pregunta, 0));
        // Lista Respuesta - Pregunta
        btnRespuesta1.setText(game.mostrarRespuestas(num_pregunta, 1));
        btnRespuesta2.setText(game.mostrarRespuestas(num_pregunta, 2));
        btnRespuesta3.setText(game.mostrarRespuestas(num_pregunta, 3));
        btnRespuesta4.setText(game.mostrarRespuestas(num_pregunta, 4));
        // Puntos
    } else {
        // Puedes manejar aquí el caso cuando te has quedado sin preguntas
        System.out.println("Fin del juego. Todas las preguntas han sido respondidas.");
    }
} 
    
    // ///////////////////////////////////////////////////////////////////////////////////
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPregunta = new javax.swing.JLabel();
        btnRespuesta1 = new javax.swing.JButton();
        btnRespuesta2 = new javax.swing.JButton();
        btnRespuesta3 = new javax.swing.JButton();
        btnRespuesta4 = new javax.swing.JButton();
        lblPuntos = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPregunta.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        lblPregunta.setForeground(new java.awt.Color(255, 255, 255));
        lblPregunta.setText("lblPregunta");
        getContentPane().add(lblPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        btnRespuesta1.setText("A");
        btnRespuesta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespuesta1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRespuesta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        btnRespuesta2.setText("B");
        btnRespuesta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespuesta2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRespuesta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        btnRespuesta3.setText("C");
        btnRespuesta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespuesta3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRespuesta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        btnRespuesta4.setText("D");
        btnRespuesta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespuesta4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRespuesta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, -1));

        lblPuntos.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblPuntos.setForeground(new java.awt.Color(255, 255, 255));
        lblPuntos.setText("Puntos");
        getContentPane().add(lblPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/Fondo.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRespuesta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespuesta1ActionPerformed
        btnRespuestaActionPerformed(evt, 1);
    }//GEN-LAST:event_btnRespuesta1ActionPerformed

    private void btnRespuesta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespuesta2ActionPerformed
        btnRespuestaActionPerformed(evt, 2);
    }//GEN-LAST:event_btnRespuesta2ActionPerformed

    private void btnRespuesta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespuesta3ActionPerformed
        btnRespuestaActionPerformed(evt, 3);
    }//GEN-LAST:event_btnRespuesta3ActionPerformed

    private void btnRespuesta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespuesta4ActionPerformed
        btnRespuestaActionPerformed(evt, 4);
    }//GEN-LAST:event_btnRespuesta4ActionPerformed

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnRespuesta1;
    private javax.swing.JButton btnRespuesta2;
    private javax.swing.JButton btnRespuesta3;
    private javax.swing.JButton btnRespuesta4;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblPuntos;
    // End of variables declaration//GEN-END:variables
}