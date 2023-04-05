package com.ms.email.models;

import com.ms.email.enums.StatusEmail;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "email")
public class EmailModel {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long emailId;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String text;
    private LocalDateTime sendDataEmail;
    private StatusEmail statusEmail;
}
