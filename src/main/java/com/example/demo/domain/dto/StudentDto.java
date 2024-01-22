package com.example.demo.domain.dto;

import com.example.demo.annotation.ExcelColumn;
import com.example.demo.domain.entity.CompareStudent;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@NoArgsConstructor
public class StudentDto {

    @ExcelColumn(headerName = "반")
    private Long ban;

    @ExcelColumn(headerName = "이름")
    private String name;

    public CompareStudent toEntity() {
        return CompareStudent.builder()
                .id(ban)
                .name(name)
                .build();
    }
}
