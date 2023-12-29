package com.protemp.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "User")
@ToString
public class User extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @Column(unique = true)
    private String id;
    private String pw;
    private String name;

    @Column(nullable = true) // null 값을 허용하는 컬럼들
    private String tel;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String addr1;

    @Column(nullable = false)
    private String addr2;

    @Column(nullable = false)
    private String postcode;

    @Column(nullable = true)
    private String img;

    @CreatedDate
    private LocalDateTime loginAt;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Enumerated(EnumType.STRING)
    private Role role;
}
