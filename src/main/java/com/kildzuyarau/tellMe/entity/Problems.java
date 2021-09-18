package com.kildzuyarau.tellMe.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "t_problems")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Problems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "problem_id")
    private Long problemId;
    private String typeOfProblem;
    @ManyToMany(mappedBy = "problems")
    private Set<User> users;
}
