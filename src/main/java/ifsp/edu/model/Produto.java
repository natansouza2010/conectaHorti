package ifsp.edu.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Produto {
    private String nome;
    private Integer id;
    private String descricao;
    private Double valorCusto;
    private Double valorVenda;
    private Fornecedor fornecedor;
}
