package demo.batis;

import demo.batis.dao.CityDao;
import demo.batis.mapper.HotelMapper;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class DemoApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    private final CityDao cityDao;

    private final HotelMapper hotelMapper;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("-------------> Run okkkkkk");
        System.out.println(this.cityDao.selectCityById(1));
        System.out.println(this.hotelMapper.selectByCityId(1));

    }
}
