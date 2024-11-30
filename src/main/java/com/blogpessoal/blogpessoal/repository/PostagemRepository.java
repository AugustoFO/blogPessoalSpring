package com.blogpessoal.blogpessoal.repository;

import java.util.List; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.blogpessoal.blogpessoal.model.Postagem;

/* public: nível de acesso da interface
* interface: é um contrato que define métodos que devem ser implementados por uma classe. No contexto do Spring Data JPA, interfaces como essa são usadas para definir repositórios (repositories) sem precisar implementar manualmente os métodos básicos, pois o framework faz isso automaticamente.
* JpaRepository: É uma interface fornecida pelo Spring Data JPA. Ela já contém métodos prontos para operações no banco de dados, como save(), findById(), delete(), entre outros.
* Postagem: É a entidade que será manipulada por esse repositório.
* Long: Indica o tipo do ID da entidade Postagem. Nesse caso, o ID da tabela no banco de dados é do tipo Long.
*/

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	
	public List <Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
}
