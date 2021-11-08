package repository.crud;

import org.springframework.data.repository.CrudRepository;
import model.Bike;


public interface BikeCrudRepository extends CrudRepository <Bike,Integer> {
    
}
