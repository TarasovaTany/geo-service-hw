import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;

public class GeoServiceImplTest {
    @Test
    void testGeoServiceImpl() {

        GeoService geoService = new GeoServiceImpl();
        Location expected = new Location("Moscow", Country.RUSSIA, "Lenina", 15);
        Location actual = geoService.byIp("172.0.0.0");

        Assertions.assertEquals(expected.getCountry(), actual.getCountry());
    }
}
