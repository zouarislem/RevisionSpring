package tn.esprit.springproject.Services;

import tn.esprit.springproject.entities.Piste;
import java.util.List;

public interface IPiste {
    Piste addPiste(Piste piste);
    Piste updatePiste(Piste piste);
    Piste retrievePisteById(Integer id);
    List<Piste> retrieveAllPistes();
    void deletePiste(Integer id);
}
