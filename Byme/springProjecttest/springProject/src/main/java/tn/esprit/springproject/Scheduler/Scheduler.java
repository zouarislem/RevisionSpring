package tn.esprit.springproject.Scheduler;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import tn.esprit.springproject.entities.Abonnement;
import tn.esprit.springproject.entities.Skieur;
import tn.esprit.springproject.repositories.AbonnementRepository;
import tn.esprit.springproject.repositories.SkieurRepository;

import java.time.LocalDate;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
public class Scheduler {

    AbonnementRepository abonnementRepository;
    SkieurRepository skieurRepository;
    @Scheduled(cron = "0 0 0 * * *")
    public void retrieveSubscriptions() {

        LocalDate aujourdHui = LocalDate.now();


        LocalDate dateDans7Jours = aujourdHui.plusDays(7);


        List<Abonnement> abonnements = abonnementRepository.findByDateFinBetween(aujourdHui, dateDans7Jours);


        for (Abonnement abonnement : abonnements) {
            Skieur skieur=skieurRepository.findByAbonnement(abonnement);
            skieurRepository.findById(skieur.getNumSkieur());
        }
    }

    @Scheduled(cron = "0 0 0 1 * *")
    public void showMonthlyRecurringRevenue()
    {
        abonnementRepository.total();
    }
}
