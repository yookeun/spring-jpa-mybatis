package com.example.test.jpa.mapper;

import com.example.test.jpa.dto.BoardDto;
import com.example.test.jpa.model.Board;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BoardMapper {
    @Mapping(target = "user.userCode", source = "userCode")
    Board toEntity(BoardDto boardDto);
    BoardDto toDto(Board board);
}
