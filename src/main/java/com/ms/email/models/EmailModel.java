package com.ms.email.models;

import com.ms.email.enums.StatusEmail;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table (name = "email")
public class EmailModel {
    private static final long serialVersionUID = 1L;

    public  EmailModel(){
        this.id = UUID.randomUUID();
    }

    @Id
    private UUID id;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;
    @Column(columnDefinition = "TEXT")
    private String text;
    private LocalDateTime sendDataEmail;
    @Enumerated(EnumType.STRING)
    private StatusEmail statusEmail;
}
