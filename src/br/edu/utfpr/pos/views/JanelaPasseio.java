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
public class JanelaPasseio implements ActionListener {

    private JFrame jFVeiculoCarga;
    private JButton jBCadastrar;
    private JButton jBConsultarExcluir;
    private JButton jBImprimirExcluirTodos;
    private JButton jBSair;
    private JLabel jLCadastrar;
    private JLabel jLConsultarExcluir;
    private JLabel jLImprimirExcluirTodos;
    private JLabel jLSair;
    private GroupLayout layout;
    private BDVeiculos bdVeiculos;


    public JanelaPasseio(BDVeiculos bdVeiculos) {
        this.bdVeiculos = bdVeiculos;
        janela();
        opcaoCadastrar();
        opcaoConsultarExcluir();
        opcaoImprimirExcluirTodos();
        opcaoSair();
        layoutJanela();
    }

    private void janela(){
        //Janela
        jFVeiculoCarga = new JFrame();
        jFVeiculoCarga.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jFVeiculoCarga.setTitle("Veículos de Passeio");
        jFVeiculoCarga.setSize(400, 250);
        jFVeiculoCarga.setVisible(true);
    }

    private void opcaoCadastrar(){
        //Botão
        jBCadastrar = new JButton();
        jBCadastrar.setBackground(new Color(56, 176, 222));
        jBCadastrar.addActionListener(this);
        jFVeiculoCarga.add(jBCadastrar);
        //Label
        jLCadastrar = new JLabel();
        jLCadastrar.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jLCadastrar.setText("Cadastrar");
        jFVeiculoCarga.add(jLCadastrar);
    }

    private void opcaoConsultarExcluir(){
        //Botão
        jBConsultarExcluir = new JButton();
        jBConsultarExcluir.setBackground(new Color(56, 176, 222));
        jBConsultarExcluir.addActionListener(this);
        jFVeiculoCarga.add(jBConsultarExcluir);
        //Label
        jLConsultarExcluir = new JLabel();
        jLConsultarExcluir.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jLConsultarExcluir.setText("Consultar / Excluir pela placa");
        jFVeiculoCarga.add(jLConsultarExcluir);
    }

    private void opcaoImprimirExcluirTodos() {
        //Botão
        jBImprimirExcluirTodos = new JButton();
        jBImprimirExcluirTodos.setBackground(new Color(56, 176, 222));
        jBImprimirExcluirTodos.addActionListener(this);
        jFVeiculoCarga.add(jBImprimirExcluirTodos);
        //Label
        jLImprimirExcluirTodos = new JLabel();
        jLImprimirExcluirTodos.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jLImprimirExcluirTodos.setText("Imprimir / Excluir todos");
        jFVeiculoCarga.add(jLImprimirExcluirTodos);
    }

    private void opcaoSair() {
        //Botão
        jBSair = new JButton();
        jBSair.setBackground(new Color(255, 0, 0));
        jBSair.addActionListener(this);
        jFVeiculoCarga.add(jBSair);
        //Label
        jLSair = new JLabel();
        jLSair.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jLSair.setText("Sair");
        jFVeiculoCarga.add(jLSair);
    }

    private void layoutJanela(){
        layout = new GroupLayout(jFVeiculoCarga.getContentPane());
        jFVeiculoCarga.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jBCadastrar, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                        .addComponent(jBConsultarExcluir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBImprimirExcluirTodos, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBSair, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLCadastrar)
                                        .addComponent(jLConsultarExcluir)
                                        .addComponent(jLImprimirExcluirTodos)
                                        .addComponent(jLSair))
                                .addContainerGap(275, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jBCadastrar, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLCadastrar))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jBConsultarExcluir, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLConsultarExcluir))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jBImprimirExcluirTodos, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLImprimirExcluirTodos))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jBSair, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLSair))
                                .addContainerGap(61, Short.MAX_VALUE))
        );
        jFVeiculoCarga.setLayout(layout);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if(event.getSource().equals(jBCadastrar)){
            new JanelaCadastrarPasseio(this.bdVeiculos);
        }
        if(event.getSource().equals(jBConsultarExcluir)){
            new JanelaConsultarPasseio(this.bdVeiculos);
        }
        if(event.getSource().equals(jBImprimirExcluirTodos)){
            new JanelaListarPasseio(this.bdVeiculos);
        }

        if(event.getSource().equals(jBSair)){
            jFVeiculoCarga.dispose();
        }
    }
}