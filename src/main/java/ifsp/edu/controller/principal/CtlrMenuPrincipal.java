
package ifsp.edu.controller.principal;

import ifsp.edu.view.catalogo.WindowSubmenuCatalogo;
import ifsp.edu.view.clientes.WindowSubmenuClientes;
import ifsp.edu.view.compraproduto.WindowSubmenuCompraProduto;
import ifsp.edu.view.fornecedores.WindowSubmenuFornecedores;
import ifsp.edu.view.pedidos.WindowSubmenuPedidos;
import ifsp.edu.view.produtos.WindowSubmenuProdutos;
import ifsp.edu.view.renda.WindowSubmenuRenda;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class CtlrMenuPrincipal {

    @FXML Button btnGerenciarClientes;
    @FXML Button btnGerenciarProdutos;
    @FXML Button btnGerenciarFornecedores;
    @FXML Button btnGerenciarCatalogo;
    @FXML Button btnRenda;
    @FXML Button btnGerenciarPedido;
    @FXML Button btnComprasDeProduto;
    
    public void submenuClientes(ActionEvent actionEvent) throws IOException {
        WindowSubmenuClientes window = new WindowSubmenuClientes();
        try {
            window.show();
        } catch (IOException e ) {
            e.printStackTrace();
        }
    }

    public void submenuProdutos(ActionEvent actionEvent) {
        WindowSubmenuProdutos window = new WindowSubmenuProdutos();
        try {
            window.show();
        } catch (IOException e ) {
            e.printStackTrace();
        }
    }

    public void submenuFornecedores(ActionEvent actionEvent) {
        WindowSubmenuFornecedores window = new WindowSubmenuFornecedores();
        try {
            window.show();
        } catch (IOException e ) {
            e.printStackTrace();
        }
    }

    public void submenuRenda(ActionEvent actionEvent) {
        WindowSubmenuRenda window = new WindowSubmenuRenda();
        try{
            window.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void submenuPedidos(ActionEvent actionEvent) {
        WindowSubmenuPedidos window = new WindowSubmenuPedidos();
        try {
            window.show();
        } catch (IOException e ) {
            e.printStackTrace();
        }
    }

    public void submenuCatalogo(ActionEvent actionEvent) {
        WindowSubmenuCatalogo window = new WindowSubmenuCatalogo();
        try{
            window.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void submenuCompraProduto(ActionEvent actionEvent) {
        WindowSubmenuCompraProduto window = new WindowSubmenuCompraProduto();
        try{
            window.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

