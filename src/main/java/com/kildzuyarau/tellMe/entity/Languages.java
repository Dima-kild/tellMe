package com.kildzuyarau.tellMe.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "t_languages")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Languages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "language_id")
    private Long languageId;
    private String typeOfLanguage;
    @ManyToMany(mappedBy = "languages")
    private Set<User> users;
}
