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

        Scanner sc = new Scanner(System.in);

//        Department department = new Department(1, "Books");
//        System.out.println(department);
//
//        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, department);

        System.out.println("=== TEST 1: seller findById =====");
        SellerDao sellerDao = DaoFactory.createSellerDao(); // injeção de dependência sem explicitar a implementação
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment =====");
        Department department = new Department(2, null); // não é necessário instanciar o nome do departamento
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: seller findAll =====");
        list = sellerDao.findAll(); // reaproveitando a lista de Sellers
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 4: seller insert =====");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department); // department já instanciado no TEST 2
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\n=== TEST 5: seller update =====");
        seller = sellerDao.findById(1); // reaproveitando o seller do TEST 1
        seller.setName("Martha Waine");
        seller.setEmail("martha@gmail.com");
        sellerDao.update(seller);
        System.out.println("Update completed");

        System.out.println("\n=== TEST 6: seller delete =====");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete completed");

        sc.close();
    }
}
