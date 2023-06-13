package view;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JFLibra extends javax.swing.JFrame {

    public JFLibra() {
        setTitle("Libras");
        initComponents();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                close();
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFundo = new javax.swing.JPanel();
        jlTraducao = new javax.swing.JLabel();
        jtEntrada = new javax.swing.JTextArea();
        jlLibra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(550, 355));
        setResizable(false);

        jFundo.setBackground(new java.awt.Color(255, 255, 255));

        jlTraducao.setBackground(new java.awt.Color(0, 0, 0));
        jlTraducao.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jlTraducao.setText("TRADUÇÃO PARA LIBRAS");

        jtEntrada.setColumns(20);
        jtEntrada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtEntrada.setRows(5);
        jtEntrada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtEntradaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jFundoLayout = new javax.swing.GroupLayout(jFundo);
        jFundo.setLayout(jFundoLayout);
        jFundoLayout.setHorizontalGroup(
            jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFundoLayout.createSequentialGroup()
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jlTraducao))
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jlLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jFundoLayout.setVerticalGroup(
            jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFundoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlTraducao)
                .addGap(32, 32, 32)
                .addComponent(jtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtEntradaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtEntradaKeyTyped
        if (evt.getKeyChar() == 'a' || evt.getKeyChar() == 'A') {
            jlLibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alfabeto_libras/a.jpg")));
        }
        if (evt.getKeyChar() == 'b' || evt.getKeyChar() == 'B') {
            jlLibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alfabeto_libras/b.jpg")));
        }
        if (evt.getKeyChar() == 'c' || evt.getKeyChar() == 'C') {
            jlLibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alfabeto_libras/c.jpg")));
        }
        if (evt.getKeyChar() == 'd' || evt.getKeyChar() == 'D') {
            jlLibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alfabeto_libras/d.jpg")));
        }
        if (evt.getKeyChar() == 'e' || evt.getKeyChar() == 'E') {
            jlLibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alfabeto_libras/e.jpg")));
        }
        if (evt.getKeyChar() == 'f' || evt.getKeyChar() == 'F') {
            jlLibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alfabeto_libras/f.jpg")));
        }
        if (evt.getKeyChar() == 'g' || evt.getKeyChar() == 'G') {
            jlLibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alfabeto_libras/g.jpg")));
        }
        if (evt.getKeyChar() == 'h' || evt.getKeyChar() == 'H') {
            jlLibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alfabeto_libras/h.jpg")));
        }
        if (evt.getKeyChar() == 'i' || evt.getKeyChar() == 'I') {
            jlLibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alfabeto_libras/i.jpg")));
        }
        if (evt.getKeyChar() == 'j' || evt.getKeyChar() == 'J') {
            jlLibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alfabeto_libras/j.jpg")));
        }
        if (evt.getKeyChar() == 'k' || evt.getKeyChar() == 'K') {
            jlLibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alfabeto_libras/k.jpg")));
        }
        if (evt.getKeyChar() == 'l' || evt.getKeyChar() == 'L') {
            jlLibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alfabeto_libras/l.jpg")));
        }
        if (evt.getKeyChar() == 'm' || evt.getKeyChar() == 'M') {
            jlLibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alfabeto_libras/m.jpg")));
        }
        if (evt.getKeyChar() == 'n' || evt.getKeyChar() == 'N') {
            jlLibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alfabeto_libras/n.jpg")));
        }
        if (evt.getKeyChar() == 'o' || evt.getKeyChar() == 'O') {
            jlLibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alfabeto_libras/o.jpg")));
        }
        if (evt.getKeyChar() == 'p' || evt.getKeyChar() == 'P') {
            jlLibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alfabeto_libras/p.jpg")));
        }
        if (evt.getKeyChar() == 'q' || evt.getKeyChar() == 'Q') {
            jlLibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alfabeto_libras/q.jpg")));
        }
        if (evt.getKeyChar() == 'r' || evt.getKeyChar() == 'R') {
            jlLibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alfabeto_libras/r.jpg")));
        }
        if (evt.getKeyChar() == 's' || evt.getKeyChar() == 'S') {
            jlLibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alfabeto_libras/s.jpg")));
        }
        if (evt.getKeyChar() == 't' || evt.getKeyChar() == 'T') {
            jlLibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alfabeto_libras/t.jpg")));
        }
        if (evt.getKeyChar() == 'u' || evt.getKeyChar() == 'U') {
            jlLibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alfabeto_libras/u.jpg")));
        }
        if (evt.getKeyChar() == 'v' || evt.getKeyChar() == 'V') {
            jlLibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alfabeto_libras/v.jpg")));
        }
        if (evt.getKeyChar() == 'w' || evt.getKeyChar() == 'W') {
            jlLibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alfabeto_libras/w.jpg")));
        }
        if (evt.getKeyChar() == 'x' || evt.getKeyChar() == 'X') {
            jlLibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alfabeto_libras/x.jpg")));
        }
        if (evt.getKeyChar() == 'y' || evt.getKeyChar() == 'Y') {
            jlLibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alfabeto_libras/y.jpg")));
        }
        if (evt.getKeyChar() == 'z' || evt.getKeyChar() == 'Z') {
            jlLibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alfabeto_libras/z.jpg")));
        }
        if (evt.getKeyChar() == ' ') {
            jlLibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alfabeto_libras/espaco.jpg")));
        }
    }//GEN-LAST:event_jtEntradaKeyTyped
    
    public void close() {
        JFMenu janela = new JFMenu();
        janela.setVisible(true);
        this.dispose();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLibra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jFundo;
    private javax.swing.JLabel jlLibra;
    private javax.swing.JLabel jlTraducao;
    private javax.swing.JTextArea jtEntrada;
    // End of variables declaration//GEN-END:variables
}
