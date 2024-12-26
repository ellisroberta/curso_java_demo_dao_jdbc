package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

// Interface que define as operações de acesso a dados para a entidade Seller
public interface SellerDao {

    void insert(Seller obj); // Método para inserir um novo vendedor
    void update(Seller obj); // Método para atualizar um vendedor existente
    void deleteById(Integer id); // Método para excluir um vendedor pelo ID
    Seller findById(Integer id); // Método para buscar um vendedor pelo ID
    List<Seller> findAll(); // Método para buscar todos os vendedores
    List<Seller> findByDepartment(Department department); // Método para buscar vendedores por departamento
}