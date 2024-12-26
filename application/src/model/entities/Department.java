package model.entities;

import java.io.Serial;
import java.io.Serializable;

// Classe que representa a entidade Department (Departamento)
public class Department implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L; // Versão da serialização

    private Integer id; // ID do departamento
    private String name; // Nome do departamento

    // Construtor padrão
    public Department() {
    }

    // Construtor com parâmetros
    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    // Implementação do método hashCode para comparação de objetos
    @Override
    public int hashCode() {
        final int prime = 31; // Número primo para cálculo do hash
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
        Department other = (Department) obj; // Faz o cast para Department
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
        return "Department [id=" + id + ", name=" + name + "]";
    }
}