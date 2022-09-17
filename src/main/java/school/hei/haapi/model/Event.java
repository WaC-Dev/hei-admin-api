package school.hei.haapi.model;

import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@Data
@Table(name="\"event\"")
@NoArgsConstructor
@Builder
@Entity
@EqualsAndHashCode
public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
 //   @NotBlank
    @Column(name = "event_type" , nullable = false )
    private String eventType;
   // @NotBlank(message = "must not be blank")
    //@NotEmpty
    private String startTime;
    //@NotBlank
    //@NotEmpty
    private String endTime;

    /*@ManyToOne
    @JoinColumn(name = "id_place")
    @Cascade(CascadeType.REMOVE)
    private Place place;

     */
}
