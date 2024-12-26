package model.dao;

import model.entities.Department;

import java.util.List;

// Interface que define as operações de acesso a dados para a entidade Department
public interface DepartmentDao {

    void insert(Department obj); // Método para inserir um novo departamento
    void update(Department obj); // Método para atualizar um departamento existente
    void deleteById(Integer id); // Método para excluir um departamento pelo ID
    Department findById(Integer id); // Método para buscar um departamento pelo ID
    List<Department> findAll(); // Método para buscar todos os departamentos
}
