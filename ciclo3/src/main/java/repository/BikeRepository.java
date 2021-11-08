package repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Bike;
import repository.crud.BikeCrudRepository;
import java.util.List;
import java.util.Optional;
//import antlr.collections.List;

@Repository
public class BikeRepository {

    @Autowired
    private BikeCrudRepository bikeCrudRepository;

    public List<Bike> getAll() {
        return (List<Bike>) bikeCrudRepository.findAll();
    }

    public Optional<Bike> getBike(int id) {
        return bikeCrudRepository.findById(id);
    }

    public Bike save(Bike b) {
        return bikeCrudRepository.save(b);
    }

}
