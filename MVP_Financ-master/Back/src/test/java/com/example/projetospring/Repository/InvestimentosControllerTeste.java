package com.example.projetospring.Repository;


import com.example.projetospring.model.Investimentos;
        import com.example.projetospring.repository.InvestimentosRepository;
        import org.assertj.core.api.Assert;
        import org.junit.jupiter.api.Test;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.test.context.SpringBootTest;

        import java.util.Optional;

        import static org.assertj.core.api.Assertions.assertThat;
        import static org.assertj.core.api.Assertions.assertThatObject;

class InvestimentosControllerTeste {
    @Autowired

    private InvestimentosRepository repository;
    //INVESTIMENTOS
    @Test
    public void Saveteste (){
        Investimentos teste = new Investimentos(null, "", 200.0,100.0, 100.0,100.0);
        repository.save(teste);
        repository.findByid(teste.getId_investimento());
    }

    @Test
    public void EditTeste (){
        Investimentos teste = new Investimentos(null, "", 200.0,100.0, 100.0,100.0);
        repository.save(teste);
        Optional<Investimentos> find = repository.findById(teste.getId_investimento());
        assertThatObject(teste).isEqualTo(find);
    }
    @Test
    public void DeleteTeste (){
        Investimentos teste = new Investimentos(null, "", 200.0,100.0, 100.0,100.0);
        repository.deleteById(teste.getId_investimento());
        Optional<Investimentos> getInvest  = repository.findById(teste.getId_investimento());
        assertThat(getInvest == null);
    }

    @Test
    public void FindById(){
        repository.findById(null);
    }
    // FIM INVESTIMENTOS
}
