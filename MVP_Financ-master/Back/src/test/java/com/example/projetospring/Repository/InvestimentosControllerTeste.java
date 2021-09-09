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
@SpringBootTest
class InvestimentosControllerTeste {

    @Autowired
    private InvestimentosRepository repository;
    //INVESTIMENTOS
    @Test
    public void Saveteste (){
        Investimentos teste = new Investimentos(null, "", 200.0,100.0, 100.0,100.0);
        repository.save(teste);
        assertThatObject( repository.findById(teste.getId_investimento()).equals(teste));
    }
    @Test
    public void EditTeste (){
        Investimentos teste = new Investimentos(null, "", 200.0,100.0, 100.0,100.0);
        Investimentos testeSave = repository.save(teste);
        testeSave.setTipo_investimento("editado");
        testeSave = repository.save(testeSave);
        assertThatObject(repository.findById(testeSave.getId_investimento())).equals(testeSave);
    }
    @Test
    public void DeleteTeste (){
        Investimentos teste = new Investimentos(null, "", 200.0,100.0, 100.0,100.0);
        repository.deleteById(teste.getId_investimento());
        Optional<Investimentos> getInvest  = repository.findById(teste.getId_investimento());
        assertThat(!getInvest.isPresent());

    }

    @Test
    public void FindById(){
        repository.findById(null);
    }
    // FIM INVESTIMENTOS
}
