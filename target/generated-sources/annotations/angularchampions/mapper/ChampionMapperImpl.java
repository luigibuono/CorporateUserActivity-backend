package angularchampions.mapper;

import angularchampions.DTOs.ChampionDTO;
import angularchampions.repository.Champion;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-07T16:58:40+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
@Component
public class ChampionMapperImpl implements ChampionMapper {

    @Override
    public Champion toChampion(ChampionDTO championDTO) {
        if ( championDTO == null ) {
            return null;
        }

        Champion champion = new Champion();

        if ( championDTO.getId() != null ) {
            champion.setId( championDTO.getId() );
        }
        champion.setFirstName( championDTO.getFirstName() );
        champion.setLastName( championDTO.getLastName() );
        champion.setemail( championDTO.getEmail() );

        return champion;
    }

    @Override
    public ChampionDTO toDTO(Champion champion) {
        if ( champion == null ) {
            return null;
        }

        ChampionDTO championDTO = new ChampionDTO();

        championDTO.setId( champion.getId() );
        championDTO.setFirstName( champion.getFirstName() );
        championDTO.setLastName( champion.getLastName() );
        championDTO.setEmail( champion.getemail() );

        return championDTO;
    }

    @Override
    public void updateChampionFromDTO(ChampionDTO championDTO, Champion champion) {
        if ( championDTO == null ) {
            return;
        }

        if ( championDTO.getId() != null ) {
            champion.setId( championDTO.getId() );
        }
        champion.setFirstName( championDTO.getFirstName() );
        champion.setLastName( championDTO.getLastName() );
        champion.setemail( championDTO.getEmail() );
    }
}
