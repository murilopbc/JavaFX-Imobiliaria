package br.com.imobiliaria.controller;

import br.com.imobiliaria.model.Calculos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class JFXImobiliaria {

    public TextField tfProprietario;
    public TextField tfCidade;
    public TextField tfArea;
    public Button bQuadrado;
    public Button bRetangulo;
    public Button bTriangulo;
    public Button bLosango;
    public Button bCirculo;
    public Button bSalvar;
    public Button bFechar;

    Calculos calculos = new Calculos();

    public void calcularAreaQuadrado(ActionEvent actionEvent) {
        JOptionPane.showInputDialog("Digite o valor do lado do Quadrado: ");


    }
    public void calcularAreaRetangulo(ActionEvent actionEvent){
        JOptionPane.showInputDialog("Digite o valor do ladoA do Retângulo: ");
        JOptionPane.showInputDialog("Digite o valor do ladoB do Retângulo: ");

    }
    public void calcularAreaTriangulo(ActionEvent actionEvent){
        JOptionPane.showInputDialog("Digite o valor da base do Triângulo");
        JOptionPane.showInputDialog("Digite o valor da altura do Triângulo");

    }
    public void calcularAreaCirculo(ActionEvent actionEvent){
        JOptionPane.showInputDialog("Digite o valor do raio do Círculo: ");

    }
    public void calcularAreaLosango(ActionEvent actionEvent){
        JOptionPane.showInputDialog("Digite o valor da diagonal menor do Losângo");
        JOptionPane.showInputDialog("Digite o valor da diagonal maior do Losângo");

    }
    public void salvar(ActionEvent actionEvent) {

    }
    public void fechar(ActionEvent actionEvent) {
        System.exit(0);
    }
}

