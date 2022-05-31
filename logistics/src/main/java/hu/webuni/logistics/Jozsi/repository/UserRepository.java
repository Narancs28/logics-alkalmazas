package hu.webuni.logistics.Jozsi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hu.webuni.logistics.Jozsi.model.TransportPlanUser;


public interface UserRepository extends JpaRepository<TransportPlanUser, String> {

}
