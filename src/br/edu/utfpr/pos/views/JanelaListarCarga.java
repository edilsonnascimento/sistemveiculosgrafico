package br.edu.utfpr.pos.views;

import br.edu.utfpr.pos.source.BDVeiculos;
import br.edu.utfpr.pos.source.Carga;
import br.edu.utfpr.pos.source.Passeio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * @author Edilson do Nascmento
 *
 */
public class JanelaListarCarga implements ActionListener {

    private JScrollPane jSPainel;
    private JTable jTtabela;
    private JFrame jFListaCarga;
    private JButton jBImprimirTodos;
    private JButton jBExcluirTodos;
    private JButton jBSair;
    private GroupLayout layout;
    private Object [][] dados;
    private String[] colunas;
    private BDVeiculos bdVeiculos;
    private List<Carga> listaVeiculos;

    public JanelaListarCarga(BDVeiculos bdVeiculos) {
        this.bdVeiculos = bdVeiculos;
        this.listaVeiculos = bdVeiculos.getCarrosCarga();
        this.colunas = new String[] {"Placa", "Marca", "Modelo", "Cor", "Qtd. Rodas", "Veloc. Máx.", "Qtd. Pist.", "Potênc.", "Tara", "Carga Max."};
        novaTela();
    }

    private void novaTela(){
        dados = new Object[listaVeiculos.size()][colunas.length];
        criaJanelaListaCarga();
        criaTabela();
        criaBotoes();
        setLayout();
    }

    private void criaJanelaListaCarga(){
        jFListaCarga = new JFrame();
        jFListaCarga.setTitle("Imprimir / Excluir todos");
        jFListaCarga.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jFListaCarga.setVisible(true);
        jFListaCarga.setSize(800, 400);
    }

    private void criaBotoes() {

        //Imprimir Todos
        jBImprimirTodos = new JButton();
        jBImprimirTodos.setText("Imprimir Todos");
        jBImprimirTodos.setBackground(Color.orange);
        jBImprimirTodos.setForeground(Color.red);
        jBImprimirTodos.addActionListener(this);
        jFListaCarga.add(jBImprimirTodos);

        //Excluir
        jBExcluirTodos = new JButton();
        jBExcluirTodos.setText("Excluir Todos");
        jBExcluirTodos.setBackground(Color.orange);
        jBExcluirTodos.setForeground(Color.red);
        jBExcluirTodos.addActionListener(this);
        jFListaCarga.add(jBExcluirTodos);

        //Sair
        jBSair = new JButton();
        jBSair.setText("Sair");
        jBSair.addActionListener(this);
        jBSair.setMnemonic('S');
        jFListaCarga.add(jBSair);
    }

    private void adicionaLinha(List<Carga> listaVeiculos, int i, Object[][] dados){
        dados[i][0] = listaVeiculos.get(i).getPlaca();
        dados[i][1] = listaVeiculos.get(i).getMarca();
        dados[i][2] = listaVeiculos.get(i).getModelo();
        dados[i][3] = listaVeiculos.get(i).getCor();
        dados[i][4] = listaVeiculos.get(i).getQtdRodas();
        dados[i][5] = listaVeiculos.get(i).getVelocMax();
        dados[i][6] = listaVeiculos.get(i).getMotor().getQtdPistoes();
        dados[i][7] = listaVeiculos.get(i).getMotor().getPotencia();
        dados[i][8] = listaVeiculos.get(i).getTara();
        dados[i][9] = listaVeiculos.get(i).getCargaMax();
    }

    private void adicionaListaTabela(){

        for (int i = 0; i < listaVeiculos.size(); i++) {
            adicionaLinha(listaVeiculos, i, dados);
        }
    }
    private void criaTabela() {

        jTtabela = new JTable(dados, colunas);
        jSPainel = new JScrollPane(jTtabela);
        jFListaCarga.add(jSPainel);
    }

    private void mostrarTabela() {
        jTtabela = new JTable(dados, colunas);
        jSPainel = new JScrollPane(jTtabela);
        jFListaCarga.add(jSPainel);
    }


    private void setLayout() {
        layout = new GroupLayout(jFListaCarga.getContentPane());
        jFListaCarga.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSPainel, GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBImprimirTodos)
                                .addGap(18, 18, 18)
                                .addComponent(jBExcluirTodos)
                                .addGap(30, 30, 30)
                                .addComponent(jBSair)
                                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jSPainel, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jBImprimirTodos)
                                        .addComponent(jBExcluirTodos)
                                        .addComponent(jBSair))
                                .addContainerGap())
        );

    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if(event.getSource().equals(jBImprimirTodos)){
            adicionaListaTabela();
            mostrarTabela();
            setLayout();
        }
        if(event.getSource().equals(jBExcluirTodos)){
            jFListaCarga.dispose();
            this.bdVeiculos.getCarrosCarga().clear();
            novaTela();
        }
        if (event.getSource().equals(jBSair)){
            jFListaCarga.dispose();
        }
    }
}
