package br.edu.utfpr.pos.views;

import br.edu.utfpr.pos.source.BDVeiculos;
import br.edu.utfpr.pos.source.Carga;
import br.edu.utfpr.pos.source.VeicExistExcepetion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * @author Edilson do Nascmento
 *
 */
public class JanelaCadastrarCarga implements ActionListener {

    private JFrame jFCadastrarCarga;

    private JLabel jLTara;
    private JTextField jTTara;
    private JLabel jLCargaMaxima;
    private JTextField jTCargaMaxima;
    private JLabel jLPlaca;
    private JTextField jTPlaca;
    private JLabel jLMarca;
    private JTextField jTMarca;
    private JLabel jLModelo;
    private JTextField jTModelo;
    private JLabel jLCor;
    private JTextField jTCor;
    private JLabel jLQuantidadeRodas;
    private JTextField jTQuantidadeRodas;
    private JLabel jLVelocidadeMaxima;
    private JTextField jTVelocidadeMaxima;
    private JLabel jLQuantidadePistoes;
    private JTextField jTQuantidadePistoes;
    private JLabel jLPotencia;
    private JTextField jTPotencia;
    private JButton jBCadastrar;
    private JButton jBLimpar;
    private JButton jBNovo;
    private JButton jBSair;
    private BDVeiculos bdVeiculos;

    public JanelaCadastrarCarga(BDVeiculos bdVeiculos) {
        this.bdVeiculos = bdVeiculos;
        criaJanelaCadastroPasseio();
        criaCampos();
        criaBotoes();
        setLayout();
    }

    private void criaJanelaCadastroPasseio(){
        jFCadastrarCarga = new JFrame();
        jFCadastrarCarga.setTitle("Cadastro de Carga");
        jFCadastrarCarga.setVisible(true);
        jFCadastrarCarga.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jFCadastrarCarga.setSize(515, 420);
    }

    private void criaCampos(){

        //Tara
        jLTara = new JLabel();
        jTTara = new JTextField();
        jLTara.setText("Tara (ref. a peso com carga - peso com carga):");
        jFCadastrarCarga.add(jLTara);
        jFCadastrarCarga.add(jTTara);

        //Carga Máxima
        jLCargaMaxima = new JLabel();
        jTCargaMaxima = new JTextField();
        jLCargaMaxima.setText("Carga Máxima (info. do veículo pelo fabricante):");
        jFCadastrarCarga.add(jLCargaMaxima);
        jFCadastrarCarga.add(jTCargaMaxima);

        //Placa
        jLPlaca = new JLabel();
        jTPlaca = new JTextField();
        jLPlaca.setText("Placa:");
        jFCadastrarCarga.add(jLPlaca);
        jFCadastrarCarga.add(jTPlaca);

        //Marca
        jLMarca = new JLabel();
        jTMarca = new JTextField();
        jLMarca.setText("Marca:");
        jFCadastrarCarga.add(jLMarca);
        jFCadastrarCarga.add(jTMarca);

        //Modelo
        jLModelo = new JLabel();
        jTModelo = new JTextField();
        jLModelo.setText("Modelo:");
        jFCadastrarCarga.add(jLModelo);
        jFCadastrarCarga.add(jTModelo);

        //Cor
        jLCor = new JLabel();
        jTCor = new JTextField();
        jLCor.setText("Cor:");
        jFCadastrarCarga.add(jLCor);
        jFCadastrarCarga.add(jTCor);

        //Quantidade de Rodas
        jLQuantidadeRodas = new JLabel();
        jTQuantidadeRodas = new JTextField();
        jLQuantidadeRodas.setText("Quantidade de Rodas:");
        jFCadastrarCarga.add(jLQuantidadeRodas);
        jFCadastrarCarga.add(jTQuantidadeRodas);

        //Velocidade Máxima
        jLVelocidadeMaxima = new JLabel();
        jTVelocidadeMaxima = new JTextField();
        jLVelocidadeMaxima.setText("Velocidade Máxima:");
        jFCadastrarCarga.add(jLVelocidadeMaxima);
        jFCadastrarCarga.add(jTVelocidadeMaxima);

        //Quantidade de Pistões
        jLQuantidadePistoes = new JLabel();
        jTQuantidadePistoes = new JTextField();
        jLQuantidadePistoes.setText("Quantidade de Pistões:");
        jFCadastrarCarga.add(jLQuantidadePistoes);
        jFCadastrarCarga.add(jTQuantidadePistoes);

        //Potência
        jLPotencia = new JLabel();
        jTPotencia = new JTextField();
        jLPotencia.setText("Potência:");
        jFCadastrarCarga.add(jLPotencia);
        jFCadastrarCarga.add(jTPotencia);
    }

    private void criaBotoes(){

        //Cadastrar
        jBCadastrar = new JButton();
        jBCadastrar.setText("Cadastrar");
        jBCadastrar.setMnemonic('C');
        jBCadastrar.addActionListener(this);
        jFCadastrarCarga.add(jBCadastrar);

        //Limpar
        jBLimpar = new JButton();
        jBLimpar.setText("Limpar");
        jBLimpar.setMnemonic('L');
        jBLimpar.addActionListener(this);
        jFCadastrarCarga.add(jBLimpar);

        //Novo
        jBNovo = new JButton();
        jBNovo.setText("Novo");
        jBNovo.setMnemonic('N');
        jBNovo.addActionListener(this);
        jFCadastrarCarga.add(jBNovo);

        //Sair
        jBSair = new JButton();
        jBSair.setText("Sair");
        jBSair.setMnemonic('S');
        jBSair.addActionListener(this);
        jFCadastrarCarga.add(jBSair);
    }
    private void setLayout(){
        GroupLayout layout = new GroupLayout(jFCadastrarCarga.getContentPane());
        jFCadastrarCarga.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLTara)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTTara, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLCargaMaxima)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTCargaMaxima, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLPlaca)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jTPlaca, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLMarca)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jTMarca, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLModelo)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jTModelo, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLCor)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jTCor, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLQuantidadeRodas)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jTQuantidadeRodas, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLVelocidadeMaxima)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jTVelocidadeMaxima, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLQuantidadePistoes)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jTQuantidadePistoes, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLPotencia)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jTPotencia, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jBCadastrar)
                                                .addGap(28, 28, 28)
                                                .addComponent(jBLimpar)
                                                .addGap(30, 30, 30)
                                                .addComponent(jBNovo)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBSair)))
                                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLTara)
                                        .addComponent(jTTara, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLCargaMaxima)
                                        .addComponent(jTCargaMaxima, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLPlaca)
                                        .addComponent(jTPlaca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLMarca)
                                        .addComponent(jTMarca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLModelo)
                                        .addComponent(jTModelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLCor)
                                        .addComponent(jTCor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLQuantidadeRodas)
                                        .addComponent(jTQuantidadeRodas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLVelocidadeMaxima)
                                        .addComponent(jTVelocidadeMaxima, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLQuantidadePistoes)
                                        .addComponent(jTQuantidadePistoes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLPotencia)
                                        .addComponent(jTPotencia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jBCadastrar)
                                        .addComponent(jBLimpar)
                                        .addComponent(jBNovo)
                                        .addComponent(jBSair))
                                .addContainerGap(110, Short.MAX_VALUE))
        );

        jFCadastrarCarga.setLayout(layout);
    }

    private void cadastrarVeiculo() throws VeicExistExcepetion {
        String placa = jTPlaca.getText();
        if (bdVeiculos.veiculoExisteListaCarga(placa)) {
            throw new VeicExistExcepetion("Carga");
        } else {
            int tara = Integer.valueOf(jTTara.getText());
            int cargaMax = Integer.valueOf(jTCargaMaxima.getText());
            String marca = jTMarca.getText();
            String modelo = jTModelo.getText();
            String cor = jTCor.getText();
            int qtdRodas = Integer.parseInt(jTQuantidadeRodas.getText());
            int velocMax = Integer.parseInt(jTVelocidadeMaxima.getText());
            int qtdPistoes = Integer.parseInt(jTQuantidadePistoes.getText());
            int potencia = Integer.parseInt(jTPotencia.getText());
            this.bdVeiculos.adicionaVeiculo(new Carga(placa, marca, modelo, cor, qtdRodas, velocMax, qtdPistoes, potencia, tara, cargaMax));
        }
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if(event.getSource().equals(jBCadastrar)){
            try {
                cadastrarVeiculo();
                JOptionPane.showMessageDialog(null, "Veículo Cadastrado com Sucesso!", "Aviso", JOptionPane.PLAIN_MESSAGE);
                limparCampos();
            } catch (VeicExistExcepetion veicExistExcepetion) {
                JOptionPane.showMessageDialog(null, "Placa já cadastrada", "Alerta", JOptionPane.ERROR_MESSAGE);
                limparCampos();

            }
        }
        if(event.getSource().equals(jBLimpar)){
            limparCampos();
        }
        if(event.getSource().equals(jBNovo)){
            limparCampos();
        }
        if(event.getSource().equals(jBSair)){
            jFCadastrarCarga.dispose();
        }
    }

    private void limparCampos() {
        jTTara.setText("");
        jTCargaMaxima.setText("");
        jTPlaca.setText("");
        jTMarca.setText("");
        jTModelo.setText("");
        jTCor.setText("");
        jTQuantidadeRodas.setText("");
        jTQuantidadePistoes.setText("");
        jTVelocidadeMaxima.setText("");
        jTQuantidadePistoes.setText("");
        jTPotencia.setText("");
        jTTara.requestFocus();
    }
}
