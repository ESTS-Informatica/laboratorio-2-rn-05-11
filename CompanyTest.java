

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste CompanyTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class CompanyTest
{
    Company company1;
    User user1,user2,user3,user4;
    
    /**
     * Construtor default para a classe de teste CompanyTest
     */
    public CompanyTest()
    {
        company1 = new Company();
        user1 = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        user2 = new User("António Francisco", "922222222", "tochico@hotmail.com");
        user3 = new User("Fernando Fernandes", "966777101", "fefe@remax.pt");
        user4 = new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt");
        
    }
    
    @Test
    public void testConstructor(){
       assertNotEquals(null, company1.getClients());
       assertNotEquals(null, company1.getSellers());
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
        company1.registerClient(user1);
        company1.registerClient(user2);
        company1.registerSeller(user3);
        company1.registerSeller(user4);
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
