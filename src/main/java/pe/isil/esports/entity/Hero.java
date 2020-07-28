package pe.isil.esports.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String attribute;

    @Column
    private String type;

    @Column
    private String roles;

    @Column
    private String poster_path;

    @Column
    private String backdrop_path;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column
    private String strength;

    @Column
    private String agility;

    @Column
    private String intelligence;

    @Column
    private String attack_damage;

    @Column
    private String armor;

    @Column
    private String move_speed;

    @Column
    private String health;

    @Column
    private String hp_regeneration;

    @Column
    private String mana;

    @Column
    private String mp_regeneration;
}
