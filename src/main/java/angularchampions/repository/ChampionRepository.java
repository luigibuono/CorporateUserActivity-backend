package angularchampions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

@Repository
public interface ChampionRepository extends JpaRepository<Champion, Long> {

   @Query("SELECT c FROM Champion c WHERE c.firstName LIKE CONCAT('%', :keyword, '%') OR c.lastName LIKE CONCAT('%', :keyword, '%') OR c.email LIKE CONCAT('%', :keyword, '%')")
    List<Champion> searchChampions(@Param("keyword") String keyword);

}
