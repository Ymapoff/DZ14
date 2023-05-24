import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {

    
    @Test
    public void test1() {
        ShopRepository shopRepository = new ShopRepository();
        int nonExistingProductId = 10;

        Assertions.assertThrows(NotFoundException.class, () -> shopRepository.removeById(nonExistingProductId));
    }

    @Test
    public void test2() {
        ShopRepository shopRepository = new ShopRepository();

        Assertions.assertThrows(RuntimeException.class, () -> {
            shopRepository.removeById(-10);
        });
    }

}
