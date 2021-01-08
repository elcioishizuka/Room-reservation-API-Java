package one.digitalinnovation.saladereuniaodio.repository;

import one.digitalinnovation.saladereuniaodio.model.Room;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {


}
