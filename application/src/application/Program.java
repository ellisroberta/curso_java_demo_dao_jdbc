package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Inicializa um Scanner para entrada de dados do usuário

//        Department department = new Department(1, "Books"); // Exemplo de criação de um objeto Department
//        System.out.println(department); // Exibe o objeto department

//        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, department); // Exemplo de criação de um objeto Seller

        System.out.println("=== TESTE 1: vendedor findById =====");
        SellerDao sellerDao = DaoFactory.createSellerDao(); // Cria uma instância de SellerDao usando o padrão de projeto Factory
        Seller seller = sellerDao.findById(3); // Busca um vendedor pelo ID
        System.out.println(seller); // Exibe o vendedor encontrado

        System.out.println("\n=== TESTE 2: vendedor findByDepartment =====");
        Department department = new Department(2, null); // Cria um departamento sem nome (não é necessário nesse contexto)
        List<Seller> list = sellerDao.findByDepartment(department); // Busca vendedores pelo departamento
        for (Seller obj : list) {
            System.out.println(obj); // Exibe cada vendedor encontrado
        }

        System.out.println("\n=== TESTE 3: vendedor findAll =====");
        list = sellerDao.findAll(); // Reaproveita a lista de vendedores
        for (Seller obj : list) {
            System.out.println(obj); // Exibe todos os vendedores
        }

        System.out.println("\n=== TESTE 4: vendedor insert =====");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department); // Cria um novo vendedor
        sellerDao.insert(newSeller); // Insere o novo vendedor no banco de dados
        System.out.println("Inserido! Novo id = " + newSeller.getId()); // Exibe o ID do vendedor inserido

        System.out.println("\n=== TESTE 5: vendedor update =====");
        seller = sellerDao.findById(1); // Reaproveita um vendedor do TESTE 1
        seller.setName("Martha Waine"); // Atualiza o nome do vendedor
        seller.setEmail("martha@gmail.com"); // Atualiza o email do vendedor
        sellerDao.update(seller); // Salva as alterações no banco de dados
        System.out.println("Atualização concluída"); // Mensagem de confirmação

        System.out.println("\n=== TESTE 6: vendedor delete =====");
        System.out.println("Digite o id para o teste de exclusão: "); // Solicita o ID do vendedor a ser excluído
        int id = sc.nextInt(); // Lê o ID informado pelo usuário
        sellerDao.deleteById(id); // Exclui o vendedor do banco de dados
        System.out.println("Exclusão concluída"); // Mensagem de confirmação

        sc.close(); // Fecha o Scanner
    }
}
