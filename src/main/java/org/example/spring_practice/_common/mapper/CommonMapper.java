package org.example.spring_practice._common.mapper;

import java.util.ArrayList;
import java.util.List;

public interface CommonMapper<DTO, Entity> {
    DTO toDTO(Entity entity);
    Entity toEntity(DTO dto);
    ArrayList<DTO> toDtoList(List<Entity> list);
    ArrayList<Entity> toEntityList(List<DTO> dtoList);
    /**Null 값이 전달될 경우 변화 시키지 않도록 설정 */
//    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//    void updateFromDto(DTO dto, @MappingTarget Entity entity);
}
