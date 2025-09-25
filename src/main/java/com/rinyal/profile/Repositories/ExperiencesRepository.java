package com.rinyal.profile.Repositories;

import com.rinyal.profile.Entities.Experiences;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperiencesRepository extends JpaRepository<Experiences, Long> {
}
