package sda.java6.simplejpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sda.java6.simplejpa.entity.Alkohol;


@Repository
public interface AlcoholRepository extends JpaRepository<Alcohol, Long> {
}
