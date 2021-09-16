package repository.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "car")
@Data
//@Accessors(chain = false)
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String carBrand;
    private String carModel;
    private String fabricationYear;
    private String kilometers;
    @JoinColumn
    private CarType carType;
    @JoinColumn
    private FuelType fuelType;
    @JoinColumn
    private CarStatus carStatus;
}
