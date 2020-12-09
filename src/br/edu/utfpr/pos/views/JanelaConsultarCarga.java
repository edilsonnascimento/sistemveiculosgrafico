package br.edu.utfpr.pos.views;

import br.edu.utfpr.pos.source.BDVeiculos;
import br.edu.utfpr.pos.source.Carga;
import br.edu.utfpr.pos.source.Passeio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * @author Edilson do Nascmento
 *
 */
public class JanelaConsultarCarga implements ActionListener {

    private JFrame jFConsultarCarga;

    private JLabel jLPlaca;
    private JTextField jTPlaca;
    private JLabel jLTara;
    private JTextField jTTara;
    private JLabel jLCargaMaxima;
    private JTextField jTCargaMaxima;
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

    public JanelaConsultarCarga(BDVeiculos bdVeiculos) {
        this.bdVeiculos = bdVeiculos;
        criaJanelaConsultarCarga();
        criaCampos();
        criaBotoes();
        setLayout();
    }

    private void criaJanelaConsultarCarga(){
        jFConsultarCarga = new JFrame();
        jFConsultarCarga.setTitle("Consultar / Excluir pela placa");
        jFConsultarCarga.setVisible(true);
        jFConsultarCarga.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jFConsultarCarga.setSize(515, 420);
    }

    private void criaCampos(){

        //Placa
        jLPlaca = new JLabel();
        jTPlaca = new JTextField();
        jLPlaca.setText("Informar a Placa:");
        jLPlaca.setForeground(Color.RED);
        jFConsultarCarga.add(jLPlaca);
        jFConsultarCarga.add(jTPlaca);

        //Tara
        jLTara = new JLabel();
        jLTara.setText("Tara (ref. a peso com carga - peso com carga):");
        jFConsultarCarga.add(jLTara);
        jTTara = new JTextField();
        jTTara.setEditable(false);
        jFConsultarCarga.add(jTTara);

        //Carga Máxima
        jLCargaMaxima = new JLabel();
        jLCargaMaxima.setText("Carga Máxima (info. do veículo pelo fabricante):");
        jFConsultarCarga.add(jLCargaMaxima);
        jTCargaMaxima = new JTextField();
        jTCargaMaxima.setEditable(false);
        jFConsultarCarga.add(jTCargaMaxima);


        //Marca
        jLMarca = new JLabel();
        jLMarca.setText("Marca:");
        jFConsultarCarga.add(jLMarca);
        jTMarca = new JTextField();
        jTMarca.setEditable(false);
        jFConsultarCarga.add(jTMarca);

        //Modelo
        jLModelo = new JLabel();
        jLModelo.setText("Modelo:");
        jFConsultarCarga.add(jLModelo);
        jTModelo = new JTextField();
        jTModelo.setEditable(false);
        jFConsultarCarga.add(jTModelo);

        //Cor
        jLCor = new JLabel();
        jLCor.setText("Cor:");
        jFConsultarCarga.add(jLCor);
        jTCor = new JTextField();
        jTCor.setEditable(false);
        jFConsultarCarga.add(jTCor);

        //Quantidade de Rodas
        jLQuantidadeRodas = new JLabel();
        jLQuantidadeRodas.setText("Quantidade de Rodas:");
        jFConsultarCarga.add(jLQuantidadeRodas);
        jTQuantidadeRodas = new JTextField();
        jTQuantidadeRodas.setEditable(false);
        jFConsultarCarga.add(jTQuantidadeRodas);

        //Velocidade Máxima
        jLVelocidadeMaxima = new JLabel();
        jLVelocidadeMaxima.setText("Velocidade Máxima:");
        jFConsultarCarga.add(jLVelocidadeMaxima);
        jTVelocidadeMaxima = new JTextField();
        jTVelocidadeMaxima.setEditable(false);
        jFConsultarCarga.add(jTVelocidadeMaxima);

        //Quantidade de Pistões
        jLQuantidadePistoes = new JLabel();
        jLQuantidadePistoes.setText("Quantidade de Pistões:");
        jFConsultarCarga.add(jLQuantidadePistoes);
        jTQuantidadePistoes = new JTextField();
        jTQuantidadePistoes.setEditable(false);
        jFConsultarCarga.add(jTQuantidadePistoes);

        //Potência
        jLPotencia = new JLabel();
        jLPotencia.setText("Potência:");
        jFConsultarCarga.add(jLPotencia);
        jTPotencia = new JTextField();
        jTPotencia.setEditable(false);
        jFConsultarCarga.add(jTPotencia);
    }

    private void criaBotoes(){

        //Consultar
        jBConsultar = new JButton();
        jBConsultar.setText("Consultar");
        jBConsultar.setBackground(Color.orange);
        jBConsultar.setForeground(Color.red);
        jBConsultar.addActionListener(this);
        jFConsultarCarga.add(jBConsultar);

        //Excluir
        jBExcluir = new JButton();
        jBExcluir.setText("Excluir");
        jBExcluir.setBackground(Color.orange);
        jBExcluir.setForeground(Color.red);
        jBExcluir.addActionListener(this);
        jFConsultarCarga.add(jBExcluir);

        //Sair
        jBSair = new JButton();
        jBSair.setText("Sair");
        jBSair.setMnemonic('S');
        jBSair.addActionListener(this);
        jFConsultarCarga.add(jBSair);
    }
    private void setLayout(){
        GroupLayout layout = new GroupLayout(jFConsultarCarga.getContentPane());
        jFConsultarCarga.getContentPane().setLayout(layout);
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
                                                        .addComponent(jLCargaMaxima)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTCargaMaxima, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLTara)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTTara, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
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
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLPlaca)
                                        .addComponent(jTPlaca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jLCargaMaxima)
                                .addComponent(jTCargaMaxima, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jLTara)
                                .addComponent(jTTara, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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

        jFConsultarCarga.setLayout(layout);
    }

    private void consultarVeiculo(){

        Carga veiculo = bdVeiculos.buscaVeiculoCargaPlaca(jTPlaca.getText());
        if(veiculo != null){
            jTTara.setText(String.valueOf(veiculo.getTara()));
            jTCargaMaxima.setText(String.valueOf(veiculo.getCargaMax()));
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

    @Override
    public void actionPerformed(ActionEvent event) {

        if(event.getSource().equals(jBConsultar)){
            consultarVeiculo();
        }
        if(event.getSource().equals(jBExcluir)){
            this.bdVeiculos.excluirCargaPlaca(jTPlaca.getText());
            limparCampos();
        }
        if(event.getSource().equals(jBSair)){
            jFConsultarCarga.dispose();
        }
    }
}
