
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
    User client1,client2,seller1,seller2;
    Property property1,property2;
    Sell sell1,sell2;

    /**
     * Construtor default para a classe de teste CompanyTest
     */
    public CompanyTest()
    {
        company1 = new Company();
        client1 = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        client2 = new User("António Francisco", "922222222", "tochico@hotmail.com");
        seller1 = new User("Fernando Fernandes", "966777101", "fefe@remax.pt");
        seller2 = new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt");
        property1 = new Property("T3 Monte Belo", 150000.0);
        property2 = new Property("T4 Monte Belo", 180000.0);
        sell1 = new Sell(client1, seller1, property1);
        sell2 = new Sell(client2, seller2, property2);

    }

    @Test
    public void testConstructor(){
        assertNotEquals(null, company1.getClients());
        assertNotEquals(null, company1.getSellers());
    }

    @Test
    public void testRegisterClient(){
        User localclient = new User("Teste", "123123123", "teste@teste.teste");
        company1.registerClient(localclient);
    }

    @Test
    public void testRegisterClients(){
        User localclient = new User("Teste", "123123123", "teste@teste.teste");
        User localclient1 = new User("Teste1", "123123124", "teste1@teste1.teste1");
        company1.registerClient(localclient);
        company1.registerClient(localclient1);
    }

    @Test
    public void testRegisterClientDuplicate(){
        User localclient = new User("Teste", "123123123", "teste@teste.teste");
        company1.registerClient(localclient);
        assertEquals(false, company1.registerClient(localclient));

    }

    @Test
    public void testRegisterClientNull(){
        User localclient = null;
        assertEquals(false, company1.registerClient(localclient));
    }

    @Test
    public void testRegisterSeller(){
        User localclient = new User("Teste", "123123123", "teste@teste.teste");
        company1.registerSeller(localclient);
    }

    @Test
    public void testRegisterSellers(){
        User localclient = new User("Teste", "123123123", "teste@teste.teste");
        User localclient1 = new User("Teste1", "123123124", "teste1@teste1.teste1");
        company1.registerSeller(localclient);
        company1.registerSeller(localclient1);
    }

    @Test
    public void testRegisterSellerDuplicate(){
        User localclient = new User("Teste", "123123123", "teste@teste.teste");
        company1.registerSeller(localclient);
        assertEquals(false, company1.registerSeller(localclient));

    }

    @Test
    public void testRegisterSellerNull(){
        User localclient = null;
        assertEquals(false, company1.registerSeller(localclient));
    }
    
    
        @Test
    public void testRegisterProperty(){
        Property localproperty = new Property("T3 Monte Belo", 150000.0);
        company1.registerProperty(localproperty);
    }

    @Test
    public void testRegisterProperties(){
        Property localproperty = new Property("T3 Monte Belo", 150000.0);
        Property localproperty1 = new Property("T4 Monte Belo", 180000.0);
        company1.registerProperty(localproperty);
        company1.registerProperty(localproperty1);
    }

    @Test
    public void testRegisterPropertyDuplicate(){
        Property localproperty = new Property("T3 Monte Belo", 150000.0);
        company1.registerProperty(localproperty);
        assertEquals(false, company1.registerProperty(localproperty));

    }

    @Test
    public void testRegisterPropertyNull(){
        Property localproperty = null;
        assertEquals(false, company1.registerProperty(localproperty));
    }
    
    @Test
    public void testCreateSell(){
        assertEquals(true, company1.createSell(client1, seller1, property1));

    }
    
    @Test
    public void testCalculateSellsOfTheYear(){
        assertEquals(2, company1.calculateSellsOfTheYear(2024));
    }
    
    @Test
    public void testFindSellerOfTheYear(){
        
    }
    
    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
        company1.registerClient(client1);
        company1.registerClient(client2);
        company1.registerSeller(seller1);
        company1.registerSeller(seller2);
        company1.registerProperty(property1);
        company1.registerProperty(property2);
        company1.registerSell(sell1);
        company1.registerSell(sell2);
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
