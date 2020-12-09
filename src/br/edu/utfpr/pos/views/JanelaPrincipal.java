package br.edu.utfpr.pos.views;

import br.edu.utfpr.pos.source.BDVeiculos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * @author Edilson do Nascmento
 *
 */
public class JanelaPrincipal implements ActionListener {

    private JFrame jFMenuPrincipal;
    private JButton jBPasseio;
    private JButton jBCarga;
    private JLabel jLPasseio;
    private JLabel jLCarga;
    private GroupLayout layout;
    private JanelaPasseio janelaPasseio;
    private JanelaCarga janelaCarga;
    private BDVeiculos bdVeiculos;

    public JanelaPrincipal() {
        this.bdVeiculos = new BDVeiculos();
        janela();
        opcaoPasseio();
        opcaoCarga();
        layoutJanela();
    }

    private void janela(){
        //Janela
        jFMenuPrincipal = new JFrame();
        jFMenuPrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFMenuPrincipal.setTitle("Getão de Veículos");
        jFMenuPrincipal.setSize(400, 170);
        jFMenuPrincipal.setVisible(true);
    }

    private void opcaoPasseio(){
        //Botão
        jBPasseio = new JButton();
        jBPasseio.setBackground(new Color(51, 204, 0));
        jBPasseio.setForeground(new Color(51, 51, 255));
        jBPasseio.addActionListener(this);
        jFMenuPrincipal.add(jBPasseio);

        //Label
        jLPasseio = new JLabel();
        jLPasseio.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jLPasseio.setText("Passeio");
        jFMenuPrincipal.add(jLPasseio);
    }

    private void opcaoCarga(){
        //Botão
        jBCarga = new JButton();
        jBCarga.setBackground(new Color(0, 51, 255));
        jBCarga.setForeground(new Color(51, 51, 255));
        jBCarga.addActionListener(this);
        jFMenuPrincipal.add(jBCarga);
        //Label
        jLCarga = new JLabel();
        jLCarga.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jLCarga.setText("Carga");
        jFMenuPrincipal.add(jLCarga);
    }

    private void layoutJanela(){
        layout = new GroupLayout(jFMenuPrincipal.getContentPane());
        jFMenuPrincipal.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jBPasseio, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                        .addComponent(jBCarga, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLPasseio)
                                        .addComponent(jLCarga))
                                .addContainerGap(275, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jBPasseio, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLPasseio))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jBCarga, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLCarga))
                                .addContainerGap(61, Short.MAX_VALUE))
        );
        jFMenuPrincipal.setLayout(layout);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if(event.getSource().equals(jBPasseio)){
            janelaPasseio = new JanelaPasseio(this.bdVeiculos);
        }

        if(event.getSource().equals(jBCarga)){
            janelaCarga = new JanelaCarga(this.bdVeiculos);
        }
    }
}
