package br.edu.utfpr.pos.views;

import br.edu.utfpr.pos.source.BDVeiculos;
import br.edu.utfpr.pos.source.Passeio;
import br.edu.utfpr.pos.source.VeicExistExcepetion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * @author Edilson do Nascmento
 *
 */
public class JanelaCadastrarPasseio implements ActionListener {

    private JFrame jFCadastrarPasseio;

    private JLabel jLQuantidadePassageiros;
    private JTextField jTQuantidadePassageiros;
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

    public JanelaCadastrarPasseio(BDVeiculos bdVeiculos) {
        this.bdVeiculos = bdVeiculos;
        criaJanelaCadastroPasseio();
        criaCampos();
        criaBotoes();
        setLayout();
    }

    private void criaJanelaCadastroPasseio(){
        jFCadastrarPasseio = new JFrame();
        jFCadastrarPasseio.setTitle("Cadastro de Passeio");
        jFCadastrarPasseio.setVisible(true);
        jFCadastrarPasseio.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jFCadastrarPasseio.setSize(415, 400);
    }

    private void criaCampos(){

        //Quantidade de Passageiros
        jLQuantidadePassageiros = new JLabel();
        jTQuantidadePassageiros  = new JTextField();
        jLQuantidadePassageiros.setText("Quantidade de Passageiros:");
        jFCadastrarPasseio.add(jLQuantidadePassageiros);
        jFCadastrarPasseio.add(jTQuantidadePassageiros);

        //Placa
        jLPlaca = new JLabel();
        jTPlaca = new JTextField();
        jLPlaca.setText("Placa:");
        jFCadastrarPasseio.add(jLPlaca);
        jFCadastrarPasseio.add(jTPlaca);

        //Marca
        jLMarca = new JLabel();
        jTMarca = new JTextField();
        jLMarca.setText("Marca:");
        jFCadastrarPasseio.add(jLMarca);
        jFCadastrarPasseio.add(jTMarca);

        //Modelo
        jLModelo = new JLabel();
        jTModelo = new JTextField();
        jLModelo.setText("Modelo:");
        jFCadastrarPasseio.add(jLModelo);
        jFCadastrarPasseio.add(jTModelo);

        //Cor
        jLCor = new JLabel();
        jTCor = new JTextField();
        jLCor.setText("Cor:");
        jFCadastrarPasseio.add(jLCor);
        jFCadastrarPasseio.add(jTCor);

        //Quantidade de Rodas
        jLQuantidadeRodas = new JLabel();
        jTQuantidadeRodas = new JTextField();
        jLQuantidadeRodas.setText("Quantidade de Rodas:");
        jFCadastrarPasseio.add(jLQuantidadeRodas);
        jFCadastrarPasseio.add(jTQuantidadeRodas);

        //Velocidade Máxima
        jLVelocidadeMaxima = new JLabel();
        jTVelocidadeMaxima = new JTextField();
        jLVelocidadeMaxima.setText("Velocidade Máxima:");
        jFCadastrarPasseio.add(jLVelocidadeMaxima);
        jFCadastrarPasseio.add(jTVelocidadeMaxima);

        //Quantidade de Pistões
        jLQuantidadePistoes = new JLabel();
        jTQuantidadePistoes = new JTextField();
        jLQuantidadePistoes.setText("Quantidade de Pistões:");
        jFCadastrarPasseio.add(jLQuantidadePistoes);
        jFCadastrarPasseio.add(jTQuantidadePistoes);

        //Potência
        jLPotencia = new JLabel();
        jTPotencia = new JTextField();
        jLPotencia.setText("Potência:");
        jFCadastrarPasseio.add(jLPotencia);
        jFCadastrarPasseio.add(jTPotencia);
    }

    private void criaBotoes(){

        //Cadastrar
        jBCadastrar = new JButton();
        jBCadastrar.setText("Cadastrar");
        jBCadastrar.setMnemonic('C');
        jBCadastrar.addActionListener(this);
        jFCadastrarPasseio.add(jBCadastrar);

        //Limpar
        jBLimpar = new JButton();
        jBLimpar.setText("Limpar");
        jBLimpar.setMnemonic('L');
        jBLimpar.addActionListener(this);
        jFCadastrarPasseio.add(jBLimpar);

        //Novo
        jBNovo = new JButton();
        jBNovo.setText("Novo");
        jBNovo.setMnemonic('N');
        jBNovo.addActionListener(this);
        jFCadastrarPasseio.add(jBNovo);

        //Sair
        jBSair = new JButton();
        jBSair.setText("Sair");
        jBSair.setMnemonic('S');
        jBSair.addActionListener(this);
        jFCadastrarPasseio.add(jBSair);
    }
    private void setLayout(){
        GroupLayout layout = new GroupLayout(jFCadastrarPasseio.getContentPane());
        jFCadastrarPasseio.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLQuantidadePassageiros)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTQuantidadePassageiros, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
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
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLQuantidadePassageiros)
                                        .addComponent(jTQuantidadePassageiros, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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

        jFCadastrarPasseio.setLayout(layout);
    }

    private void cadastrarVeiculo() throws VeicExistExcepetion{
        String placa = jTPlaca.getText();
        if (bdVeiculos.veiculoExisteListaPasseio(placa)) {
            throw new VeicExistExcepetion("Passeio");
        } else {
            String marca = jTMarca.getText();
            String modelo = jTModelo.getText();
            String cor = jTCor.getText();
            int qtdRodas = Integer.parseInt(jTQuantidadeRodas.getText());
            int velocMax = Integer.parseInt(jTVelocidadeMaxima.getText());
            int qtdPistoes = Integer.parseInt(jTQuantidadePistoes.getText());
            int potencia = Integer.parseInt(jTPotencia.getText());
            int qtdPassageiro = Integer.parseInt(jTQuantidadePassageiros.getText());
            this.bdVeiculos.adicionaVeiculo(new Passeio(placa, marca, modelo, cor, qtdRodas, velocMax,
                    qtdPistoes, potencia, qtdPassageiro));

        }
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if(event.getSource().equals(jBCadastrar)) {
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
            jFCadastrarPasseio.dispose();
        }
    }

    private void limparCampos() {
        jTQuantidadePassageiros.setText("");
        jTPlaca.setText("");
        jTMarca.setText("");
        jTModelo.setText("");
        jTCor.setText("");
        jTQuantidadeRodas.setText("");
        jTVelocidadeMaxima.setText("");
        jTQuantidadePistoes.setText("");
        jTPotencia.setText("");
        jTQuantidadePassageiros.requestFocus();
    }
}
