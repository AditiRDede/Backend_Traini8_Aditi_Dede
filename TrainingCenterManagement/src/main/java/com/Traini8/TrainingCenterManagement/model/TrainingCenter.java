package com.Traini8.TrainingCenterManagement.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.time.Instant;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity

public class TrainingCenter {
    @Id
    @Size(min = 12, max = 12, message = "Center code must be exactly 12 characters.")
    private String centerCode;

    @Size(max = 40, message = "Center name must be less than 40 characters.")
    private String centerName;

    // Specify foreign key column
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    private int studentCapacity;


    @ElementCollection
    private List<String> courses;

    @Column(updatable = false)
    private Long createdOn;

   @Email(message = "Email should be valid")
    private String contactEmail;


   @Pattern(regexp = "^\\+?[0-9]{10,15}$", message = "Phone number should be valid.")
    private String contactPhone;

    // Automatically set the createdOn epoch time before persisting the entity
    @PrePersist
    public void onCreate() {
        this.createdOn = Instant.now().getEpochSecond();
    }
    public void setCreatedOn(Long createdOn) {
        // Discard user input for createdOn
        this.createdOn = Instant.now().getEpochSecond();
    }
}