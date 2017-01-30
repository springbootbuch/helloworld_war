package de.springbootbuch.helloworld_war;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<GreetingEntity, Integer> {
}
