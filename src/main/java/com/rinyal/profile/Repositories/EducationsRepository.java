package com.rinyal.profile.Repositories;

import com.rinyal.profile.Entities.Educations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationsRepository extends JpaRepository<Educations, Long> {
}
