package angularchampions.mapper;

import angularchampions.DTOs.ChampionDTO;
import angularchampions.repository.Champion;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface ChampionMapper {
    Champion toChampion(ChampionDTO championDTO);
    ChampionDTO toDTO(Champion champion);
    void updateChampionFromDTO(ChampionDTO championDTO, @MappingTarget Champion champion);
}
