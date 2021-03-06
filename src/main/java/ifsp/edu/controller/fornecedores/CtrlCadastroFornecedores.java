package ifsp.edu.controller.fornecedores;

import ifsp.edu.model.Endereco;
import ifsp.edu.sqlitedao.FornecedorDAOImpl;
import ifsp.edu.usecases.fornecedor.FornecedorDAO;
import ifsp.edu.model.Fornecedor;
import ifsp.edu.usecases.fornecedor.InsertFornecedorUseCase;
import ifsp.edu.usecases.fornecedor.UpdateFornecedorUseCase;
import ifsp.edu.view.fornecedores.WindowSubmenuFornecedores;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CtrlCadastroFornecedores {

    @FXML TextField txtCnpjFornecedor;
    @FXML TextField txtNomeFornecedor;
    @FXML TextField txtTel1Fornecedor;
    @FXML TextField txtTel2Fornecedor;
    @FXML TextField txtEnderecoFornecedor;
    @FXML TextField txtRazaoSocial;
    @FXML Button btnCadastrarFornecedor;

    private Fornecedor fornecedor;
    private InsertFornecedorUseCase insertFornecedorUseCase;
    private UpdateFornecedorUseCase updateFornecedorUseCase;
    private FornecedorDAO fornecedorDAO = new FornecedorDAOImpl();


    public void saveOrUpdate(ActionEvent actionEvent) {
        saveOrUpdate();
        close();
    }

    public void btnVoltar(ActionEvent actionEvent) {
        close();
    }

    private Fornecedor getFornecedorFromView(){
        String cnpj = String.valueOf(txtCnpjFornecedor.getText());
        String nome = String.valueOf(txtNomeFornecedor.getText());
        String tel1 = String.valueOf(txtTel1Fornecedor.getText());
        String tel2 = String.valueOf(txtTel2Fornecedor.getText());
        String end = String.valueOf(txtEnderecoFornecedor.getText());
        String razao = String.valueOf(txtRazaoSocial.getText());

        Fornecedor fornecedor = new Fornecedor(cnpj,nome,tel1,tel2,end,razao);
        return fornecedor;
    }

    public void setFornecedoresToView(Fornecedor f) {
        fornecedor=f;
        txtCnpjFornecedor.setText(f.getCnpj());
        txtCnpjFornecedor.setDisable(true);
        txtEnderecoFornecedor.setText(f.getEndereco());
        txtNomeFornecedor.setText(f.getNome());
        txtTel1Fornecedor.setText(f.getTelefone1());
        txtTel2Fornecedor.setText(f.getTelefone2());
        txtRazaoSocial.setText(f.getRazaoSocial());
    }

    public void saveOrUpdate() throws RuntimeException{
        Fornecedor a = getFornecedorFromView();
        if (fornecedor == null && a != null ) {
            save(a);
        } else if (fornecedor != null && a != null ) {
            update(getFornecedorFromView());
        }
    }

    private void update(Fornecedor f) {
        updateFornecedorUseCase = new UpdateFornecedorUseCase(fornecedorDAO);
        updateFornecedorUseCase.update(f);
    }

    private void save(Fornecedor f) {
        insertFornecedorUseCase = new InsertFornecedorUseCase(fornecedorDAO);
        insertFornecedorUseCase.insert(f);
    }

    private void close(){
        Stage stage = (Stage) txtCnpjFornecedor.getScene().getWindow();
        stage.close();
    }

}
