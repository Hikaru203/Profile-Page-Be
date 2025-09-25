package com.rinyal.profile.Repositories;

import com.rinyal.profile.Entities.SocialLinks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialLinksRepository extends JpaRepository<SocialLinks, Long> {
}
