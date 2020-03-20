package br.facens.atividade01_ac1.repository;
import br.facens.atividade01_ac1.model.Produto;
import org.springframework.stereotype.Repository;
import java.util.HashMap;

@Repository
public class ProdutoRepository {

    public HashMap<Integer, Produto> p = new HashMap<Integer,Produto>();

    public ProdutoRepository(){
        p.put(0,new Produto(0,"iPhone",1500.00 ,10));
        p.put(1,new Produto(1,"Geladeira",2500.00 ,5));
        p.put(2,new Produto(2,"Laptop",1000.00 ,9));
        p.put(3,new Produto(3,"Televisao",700.00 ,5));
        p.put(4,new Produto(4,"Fogao",900.00 ,20));
        p.put(5,new Produto(5,"Maquina de Lavar",400.00 ,5));
        p.put(6,new Produto(6,"Fogao",250.00 ,18));
        p.put(7,new Produto(7,"Secador",150.00 ,10));
        p.put(8,new Produto(8,"Chapinha",280.00 ,9));
        p.put(9,new Produto(9,"Radio",95.00 ,10));
    }

    public Produto getProdutoByID(Integer id)
    {
        return p.get(id);
    }

}