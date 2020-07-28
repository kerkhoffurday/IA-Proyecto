package pe.isil.esports.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Champion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String title;

    @Column
    private String rol;

    @Column
    private String attributes;

    @Column
    private String poster_path;

    @Column
    private String backdrop_path;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column
    private String attack_damage;

    @Column
    private String attack_speed;

    @Column
    private String attack_range;

    @Column
    private String move_speed;

    @Column
    private String armor;

    @Column
    private String magic_resistance;

    @Column
    private String hp_regeneration;

    @Column
    private String mp_regeneration;

    @Column
    private String health;

    @Column
    private String mana;
}
