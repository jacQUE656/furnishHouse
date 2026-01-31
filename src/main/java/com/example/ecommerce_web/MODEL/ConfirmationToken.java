package com.example.ecommerce_web.MODEL;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ConfirmationToken{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String token;
    private LocalDateTime createdAt;
    private LocalDateTime validatedAt;
    private LocalDateTime expiresAt;
    private boolean expired;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

}

