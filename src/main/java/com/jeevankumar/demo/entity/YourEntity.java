package com.jeevankumar.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "entity")
public class YourEntity {
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;

}
