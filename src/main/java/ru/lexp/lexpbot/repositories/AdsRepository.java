package ru.lexp.lexpbot.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.lexp.lexpbot.entities.Ads;

public interface AdsRepository extends CrudRepository<Ads, Long> {

}
