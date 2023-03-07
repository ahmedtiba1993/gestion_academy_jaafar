package com.academy.academy.dto;

import com.academy.academy.model.Matiere;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MatiereDto {

    private Long id;

    private String nom;

    public static MatiereDto fromEntity(Matiere matiere) {

        if (matiere == null) {
            return null;
        }

        return MatiereDto.builder()
                .id(matiere.getId())
                .nom(matiere.getNom())
                .build();
    }

    public static Matiere toEntity(MatiereDto dto) {

        if(dto == null) {
            return null;
        }

        Matiere matiere = new Matiere();
        matiere.setId(dto.getId());
        matiere.setNom(dto.getNom());
        return matiere;
    }
}
