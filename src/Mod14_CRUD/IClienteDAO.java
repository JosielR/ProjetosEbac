package Mod14_CRUD;

import java.util.Collection;

/**
 * @author Josiel Rocha
 * Projeto CRUD
 */
public interface IClienteDAO {
    public Boolean cadastrar (Cliente cliente);
    public void excluir (Long cpf);
    public void alterar (Cliente cliente);
    public Cliente consultar (Long cpf);
    public Collection<Cliente> buscarTodos();

}
