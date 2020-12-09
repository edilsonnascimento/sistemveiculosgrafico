package br.edu.utfpr.pos.views;

import br.edu.utfpr.pos.source.BDVeiculos;
import br.edu.utfpr.pos.source.Passeio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * @author Edilson do Nascmento
 *
 */
public class JanelaConsultarPasseio implements ActionListener {

    private JFrame jFConsultarPasseio;

    private JLabel jLPlaca;
    private JTextField jTPlaca;
    private JLabel jLQuantidadePassageiros;
    private JTextField jTQuantidadePassageiros;
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
    private JButton jBConsultar;
    private JButton jBExcluir;
    private JButton jBSair;
    private BDVeiculos bdVeiculos;

    public JanelaConsultarPasseio(BDVeiculos bdVeiculos) {
        this.bdVeiculos = bdVeiculos;
        criaJanelaConsultarPasseio();
        criaCampos();
        criaBotoes();
        setLayout();
    }

    private void criaJanelaConsultarPasseio(){
        jFConsultarPasseio = new JFrame();
        jFConsultarPasseio.setTitle("Consultar / Excluir pela placa");
        jFConsultarPasseio.setVisible(true);
        jFConsultarPasseio.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jFConsultarPasseio.setSize(415, 400);
    }

    private void criaCampos(){

        //Placa
        jLPlaca = new JLabel();
        jTPlaca = new JTextField();
        jLPlaca.setText("Informe a Placa:");
        jLPlaca.setForeground(Color.RED);
        jFConsultarPasseio.add(jLPlaca);
        jFConsultarPasseio.add(jTPlaca);

        //Quantidade de Passageiros
        jLQuantidadePassageiros = new JLabel();
        jLQuantidadePassageiros.setText("Quantidade de Passageiros:");
        jTQuantidadePassageiros  = new JTextField();
        jTQuantidadePassageiros.setEditable(false);
        jFConsultarPasseio.add(jLQuantidadePassageiros);
        jFConsultarPasseio.add(jTQuantidadePassageiros);


        //Marca
        jLMarca = new JLabel();
        jLMarca.setText("Marca:");
        jTMarca = new JTextField();
        jTMarca.setEditable(false);
        jFConsultarPasseio.add(jLMarca);
        jFConsultarPasseio.add(jTMarca);

        //Modelo
        jLModelo = new JLabel();
        jLModelo.setText("Modelo:");
        jTModelo = new JTextField();
        jTModelo.setEditable(false);
        jFConsultarPasseio.add(jLModelo);
        jFConsultarPasseio.add(jTModelo);

        //Cor
        jLCor = new JLabel();
        jLCor.setText("Cor:");
        jTCor = new JTextField();
        jTCor.setEditable(false);
        jFConsultarPasseio.add(jLCor);
        jFConsultarPasseio.add(jTCor);

        //Quantidade de Rodas
        jLQuantidadeRodas = new JLabel();
        jLQuantidadeRodas.setText("Quantidade de Rodas:");
        jTQuantidadeRodas = new JTextField();
        jTQuantidadeRodas.setEditable(false);
        jFConsultarPasseio.add(jLQuantidadeRodas);
        jFConsultarPasseio.add(jTQuantidadeRodas);

        //Velocidade Máxima
        jLVelocidadeMaxima = new JLabel();
        jLVelocidadeMaxima.setText("Velocidade Máxima:");
        jTVelocidadeMaxima = new JTextField();
        jTVelocidadeMaxima.setEditable(false);
        jFConsultarPasseio.add(jLVelocidadeMaxima);
        jFConsultarPasseio.add(jTVelocidadeMaxima);

        //Quantidade de Pistões
        jLQuantidadePistoes = new JLabel();
        jLQuantidadePistoes.setText("Quantidade de Pistões:");
        jTQuantidadePistoes = new JTextField();
        jTQuantidadePistoes.setEditable(false);
        jFConsultarPasseio.add(jLQuantidadePistoes);
        jFConsultarPasseio.add(jTQuantidadePistoes);

        //Potência
        jLPotencia = new JLabel();
        jLPotencia.setText("Potência:");
        jTPotencia = new JTextField();
        jTPotencia.setEditable(false);
        jFConsultarPasseio.add(jLPotencia);
        jFConsultarPasseio.add(jTPotencia);
    }

    private void criaBotoes(){

        //Consultar
        jBConsultar = new JButton();
        jBConsultar.setText("Consultar");
        jBConsultar.setBackground(Color.orange);
        jBConsultar.setForeground(Color.red);
        jBConsultar.addActionListener(this);
        jFConsultarPasseio.add(jBConsultar);

        //Excluir
        jBExcluir = new JButton();
        jBExcluir.setText("Excluir");
        jBExcluir.setBackground(Color.orange);
        jBExcluir.setForeground(Color.red);
        jBExcluir.addActionListener(this);
        jFConsultarPasseio.add(jBExcluir);

        //Sair
        jBSair = new JButton();
        jBSair.setText("Sair");
        jBSair.setMnemonic('S');
        jBSair.addActionListener(this);
        jFConsultarPasseio.add(jBSair);
    }
    private void setLayout(){
        GroupLayout layout = new GroupLayout(jFConsultarPasseio.getContentPane());
        jFConsultarPasseio.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLPlaca)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jTPlaca, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLQuantidadePassageiros)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTQuantidadePassageiros, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
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
                                                .addComponent(jBConsultar)
                                                .addGap(28, 28, 28)
                                                .addComponent(jBExcluir)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBSair)))
                                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLPlaca)
                                        .addComponent(jTPlaca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLQuantidadePassageiros)
                                        .addComponent(jTQuantidadePassageiros, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
                                        .addComponent(jBConsultar)
                                        .addComponent(jBExcluir)
                                        .addComponent(jBSair))
                                .addContainerGap(110, Short.MAX_VALUE))
        );

        jFConsultarPasseio.setLayout(layout);
    }

    private void consultarVeiculo(){
        Passeio veiculo = bdVeiculos.buscaVeiculoPassioPlaca(jTPlaca.getText());
        if(veiculo != null){
            jTQuantidadePassageiros.setText(String.valueOf(veiculo.getQtdPassageiro()));
            jTMarca.setText(veiculo.getMarca());
            jTModelo.setText(veiculo.getModelo());
            jTCor.setText(veiculo.getCor());
            jTQuantidadeRodas.setText(String.valueOf(veiculo.getQtdRodas()));
            jTVelocidadeMaxima.setText(String.valueOf(veiculo.getVelocMax()));
            jTQuantidadePistoes.setText((String.valueOf(veiculo.getMotor().getQtdPistoes())));
            jTPotencia.setText(String.valueOf(veiculo.getMotor().getPotencia()));
        }else {
            JOptionPane.showMessageDialog( null,
                    "Veículo não encontrado!",
                    "Aviso!",
                    JOptionPane.WARNING_MESSAGE );
            limparCampos();
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
        jTPlaca.requestFocus();
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if(event.getSource().equals(jBConsultar)){
            consultarVeiculo();
        }
        if(event.getSource().equals(jBExcluir)){
            this.bdVeiculos.excluirPasseioPlaca(jTPlaca.getText());
            limparCampos();
        }
        if(event.getSource().equals(jBSair)){
            jFConsultarPasseio.dispose();
        }
    }
}
