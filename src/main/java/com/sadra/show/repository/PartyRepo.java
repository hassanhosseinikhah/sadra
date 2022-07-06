package com.sadra.show.repository;

import com.sadra.show.entity.Party;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyRepo extends JpaRepository<Party,Long> {
}
