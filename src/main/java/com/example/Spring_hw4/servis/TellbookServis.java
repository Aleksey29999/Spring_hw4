package com.example.Spring_hw4.servis;

import com.example.Spring_hw4.models.Tellbook;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Service
public class TellbookServis {
    private final Tellbook tellbook = new Tellbook();
    List<Tellbook> tellbooks = new ArrayList<>();
    private Integer idCounter = 1;

    public void addTellbook(Tellbook tellbook) {
        tellbooks.add(tellbook);
        tellbook.setId(idCounter++);
        System.out.println(tellbooks.toString());
    }

    public List<Tellbook> getAllTellbooks() {
        return tellbooks;
    }


    public void deleteById(Integer id) {
//        for (int i = 0; i <tellbooks.size() ; i++) {
//            if (tellbook.getId().equals(id))
//                tellbooks.remove(tellbook);
        tellbooks.removeIf(tellbook -> tellbook.getId().equals(id));
        System.out.println(tellbooks.toString());
//        }
//        tellbooks.removeIf(tellbook -> tellbook.getId().equals(id));

    }
}
