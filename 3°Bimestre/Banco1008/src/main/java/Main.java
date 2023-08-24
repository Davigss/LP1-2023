import entity.Endereco;
import entity.Pedido;
import entity.Pessoa;
import entity.Produto;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.Arrays;
import java.util.List;

public class Main {

    private static void gerenciarPedido(){
    Pessoa p1 = new Pessoa("Ney", "Góes", "neyreidelas@gmail.com", new Endereco("rua al bilal", "Arabia"));
        Produto produto1 = new Produto("porche de ouro", 1000.00);
        Produto produto2 = new Produto("suco", 200.00);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Pedido pedido = new Pedido(p1, Arrays.asList(produto1, produto2));
        Transaction transaction = session.beginTransaction();
        session.persist(pedido);
        transaction.commit();
        List<Pedido> pedidos = session.createQuery("from pedido",Pedido.class).list();
        pedidos.forEach(p -> System.out.println(p));

}
    public static void main(String[]args){


        Pessoa p1 = new Pessoa("Fernado", "Fritas","Fernando.Federal@yahoo.com", new Endereco("Av. Padre Arlindo Cruz", "São Paulo"));
        Pessoa p2 = new Pessoa("Giovanni", "BaniBani","bombadao@hotmail.com", new Endereco("Rua Indio Geek", "Porto Feliz"));
        Pessoa p3 = new Pessoa("Gabrielson", "Rochedo","RoRokkj@outlook.com", new Endereco("Rua Xiró", "São Paulo"));
        Pessoa p4 = new Pessoa("Zorzettão", "Mamadissimo","Topgun@gmail.com", new Endereco("Av. Pedro Vicente", "São Paulo"));
        Pessoa p5 = new Pessoa("Davi", "Gomes","davigsousa13@gmail.com",new Endereco("Rua das Graças", "São Bernardo do Campo"));

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(p1);
        session.persist(p2);
        session.persist(p3);
        session.persist(p4);
        session.persist(p5);

        transaction.commit();

        List<Pessoa> pessoas = session.createQuery("from pessoa", Pessoa.class).list();
        pessoas.forEach(p -> System.out.println(p.toString()));


        Session session1 = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction1 = session1.beginTransaction();

        transaction1.commit();

        List<Endereco> enderecos = session1.createQuery("from endereco", Endereco.class).list();
        enderecos.forEach(p -> System.out.println(p.toString()));

        gerenciarPedido();
    }

}
