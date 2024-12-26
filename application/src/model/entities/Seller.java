package model.entities;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

// Classe que representa a entidade Seller (Vendedor)
public class Seller implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L; // Versão da serialização

    private Integer id; // ID do vendedor
    private String name; // Nome do vendedor
    private String email; // Email do vendedor
    private Date birthDate; // Data de nascimento do vendedor
    private Double baseSalary; // Salário base do vendedor
    private Department department; // Departamento ao qual o vendedor pertence

    // Construtor padrão
    public Seller() {
    }

    // Construtor com parâmetros
    public Seller(Integer id, String name, String email, Date birthDate, Double baseSalary, Department department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    // Métodos getters e setters para acessar e modificar os atributos
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public Double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }

    // Implementação do método hashCode para comparação de objetos
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    // Implementação do método equals para comparação de objetos
    @Override
    public boolean equals(Object obj) {
        if (this == obj) // Verifica se são o mesmo objeto
            return true;
        if (obj == null) // Verifica se o objeto é nulo
            return false;
        if (getClass() != obj.getClass()) // Verifica se são da mesma classe
            return false;
        Seller other = (Seller) obj; // Faz o cast para Seller
        if (id == null) {
            if (other.id != null) // Se um é nulo e o outro não, não são iguais
                return false;
        } else if (!id.equals(other.id))
            return false; // Compara os IDs
        return true; // São iguais
    }

    // Implementação do método toString para representação em string do objeto
    @Override
    public String toString() {
        return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", birthDate=" + birthDate + ", baseSalary="
                + baseSalary + ", department=" + department + "]";
    }
}
