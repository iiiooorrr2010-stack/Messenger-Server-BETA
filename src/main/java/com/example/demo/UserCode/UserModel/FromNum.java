package com.example.demo.UserCode.UserModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@Table(name = "FindUserWithNum")
@NoArgsConstructor
@AllArgsConstructor
public class FromNum {
    @Id
    @Column(name = "number")
    private String number;
    @Column(name = "user_Id")
    @NotNull
    private String id;
}
