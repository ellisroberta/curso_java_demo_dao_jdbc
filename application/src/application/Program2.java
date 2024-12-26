package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Inicializa um Scanner para entrada de dados do usuário

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao(); // Cria uma instância de DepartmentDao

        System.out.println("=== TESTE 1: findById =======");
        Department dep = departmentDao.findById(1); // Busca um departamento pelo ID
        System.out.println(dep); // Exibe o departamento encontrado

        System.out.println("\n=== TESTE 2: findAll =======");
        List<Department> list = departmentDao.findAll(); // Busca todos os departamentos
        for (Department d : list) {
            System.out.println(d); // Exibe cada departamento encontrado
        }

        System.out.println("\n=== TESTE 3: insert =======");
        Department newDepartment = new Department(null, "Music"); // Cria um novo departamento
        departmentDao.insert(newDepartment); // Insere o novo departamento no banco de dados
        System.out.println("Inserido! Novo id: " + newDepartment.getId()); // Exibe o ID do departamento inserido

        System.out.println("\n=== TESTE 4: update =======");
        Department dep2 = departmentDao.findById(1); // Reaproveita um departamento do TESTE 1
        dep2.setName("Food"); // Atualiza o nome do departamento
        departmentDao.update(dep2); // Salva as alterações no banco de dados
        System.out.println("Atualização concluída"); // Mensagem de confirmação

        System.out.println("\n=== TESTE 5: delete =======");
        System.out.print("Digite o id para o teste de exclusão: "); // Solicita o ID do departamento a ser excluído
        int id = sc.nextInt(); // Lê o ID informado pelo usuário
        departmentDao.deleteById(id); // Exclui o departamento do banco de dados
        System.out.println("Exclusão concluída"); // Mensagem de confirmação

        sc.close(); // Fecha o Scanner
    }
}
