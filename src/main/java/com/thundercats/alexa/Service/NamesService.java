package com.thundercats.alexa.Service;

import com.thundercats.alexa.Repository.NamesRepository;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class NamesService {

    public NamesRepository namesRepository;

    public NamesService(NamesRepository namesRepository){
        this.namesRepository = namesRepository;
    }

    public String randomName(){
        Random r = new Random();
        int max = namesRepository.findAll().size();
        double id = (double) (r.nextInt((max - 1) + 1) + 1);
        return namesRepository.findById(id).get().getName();
    }


}
