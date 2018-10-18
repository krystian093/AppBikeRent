package service;


import exceptions.BikeNotFoundException;
import model.Bike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.*;

import java.util.List;

@Service
public class BikeService {

    private BikeRepository bikeRepository;

    @Autowired
    public BikeService(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    public Bike save(Bike bike) {return bikeRepository.save(bike);}

    public List<Bike> getBikes() {return bikeRepository.findAll();}

    public Bike getBikeById (Long id){
        Bike bike = bikeRepository.findById(id).orElseThrow(() -> {
            return new BikeNotFoundException(id);
        });
        return bike;

    public void deleteBike(Long id) { bikeRepository.delete(getBikeById(id));}

    public void editBike(Long id, Bike bike){
        Bike editingBike = new Bike();
        editingBike.setBikeName(editingBike.getBikeName());
        save(editingBike);

    }


}
