package pl.axolotl.cleanweb.services.person;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Person {

    @Id
    @Type(type="uuid-char")
    private UUID id;

    @Column
    private String name;

    @Column
    private Integer age;

    public String getName() { return name; }
    public Integer getAge() { return age; }
}
