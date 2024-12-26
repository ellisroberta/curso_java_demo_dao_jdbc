package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

// Fábrica de DAO para abstrair a criação das implementações de acesso a dados
public class DaoFactory {

    // Método para criar uma instância de SellerDao
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection()); // Retorna uma instância de SellerDaoJDBC com a conexão do banco de dados
    }

    // Método para criar uma instância de DepartmentDao
    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection()); // Retorna uma instância de DepartmentDaoJDBC com a conexão do banco de dados
    }
}