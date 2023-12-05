package br.com.imobiliaria.controller;

import br.com.imobiliaria.model.Calculos;
import br.com.imobiliaria.model.Imovel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class JFXImobiliaria {
    @FXML
    private TextField tfProprietario, tfCidade, tfArea;

    @FXML
    private Button bQuadrado, bRetangulo, bTriangulo, bLosango, bCirculo, bSalvar, bFechar;


    Calculos calculos = new Calculos();
    Imovel imovel = new Imovel();

    public void calcularAreaQuadrado() {

        double lado;

        while (true) {
            try {
                lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado do Quadrado: "));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor Inválido!Digite um número");
            }
        }

        imovel.setAreaTerreno(String.valueOf((calculos.calcularAreaQuadrado(lado))));
        tfArea.setText(String.valueOf(imovel.getAreaTerreno));
    }

    public void calcularAreaRetangulo() {

        double lado, altura;

        while (true) {
            try {
                lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado do Retângulo: "));
                altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do Retângulo: "));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor Inválido!Digite um número");
            }
        }

        imovel.setAreaTerreno(String.valueOf((calculos.calcularAreaRetangulo(lado, altura))));
        tfArea.setText(String.valueOf(imovel.getAreaTerreno));
    }

    public void calcularAreaTriangulo(){

        double base, altura;

        while (true){
            try{
                base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base do Triângulo"));
                altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do Triângulo"));
                break;
            }catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor Inválido!Digite um número");
            }
        }

        imovel.setAreaTerreno(String.valueOf((calculos.calcularAreaTriangulo(base, altura))));
        tfArea.setText(String.valueOf(imovel.getAreaTerreno));
    }

    public void calcularAreaCirculo(){

        double raio;

        while (true){
            try {
                raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio do Círculo: "));
                break;
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Valor Inválido!Digite um número");
            }
        }

        imovel.setAreaTerreno(String.valueOf((calculos.calcularAreaCirculo(raio))));
        tfArea.setText(String.valueOf(imovel.getAreaTerreno));
    }

    public void calcularAreaLosango(){

        double dMenor, dMaior;

        while (true) {
            try {
                dMenor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da diagonal menor do Losângo"));
                dMaior = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da diagonal maior do Losângo"));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor Inválido!Digite um número");
            }
        }

        imovel.setAreaTerreno(String.valueOf((calculos.calcularAreaLosango(dMenor, dMaior))));
        tfArea.setText(String.valueOf(imovel.getAreaTerreno));
    }

    public void salvar() {

    }

    public void fechar() {
        System.exit(0);
    }
}

