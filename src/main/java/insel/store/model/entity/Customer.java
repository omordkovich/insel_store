package insel.store.model.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;


@Entity
@Table(name = "customer")
@Schema(description = "Class for customer description.")
public class Customer {

    @Schema(description = "Customer unique identifier", example = "7", accessMode = Schema.AccessMode.READ_ONLY)
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Schema(description = "Last name of customer", example = "Kuznetsov")
    @Column
    private String lastname;

    @Schema(description = "First name of customer", example = "Ivan")
    @Column
    private String firstname;

    @Schema(description = "Gender of customer", example = "m")
    @Column
    private String gender;

    @Schema(description = "Address name of customer", example = "Berliner Str. 5")
    @Column
    private String address;

    @Schema(description = "Country of customer", example = "Deutschland")
    @Column
    private String country;

    @Schema(description = "City of customer", example = "Berlin")
    @Column
    private String city;

    @Schema(description = "Postcode of the city", example = "50675")
    @Column
    private String postcode;

    @Schema(description = "Belonging to agency", example = "INSEL")
    @Column
    private String agency;

    @Schema(description = "Email of customer", example = "noname@mail.ru")
    @Column
    private String email;

    @Schema(description = "Mobile phone number of customer", example = "+49156545516")
    @Column
    private String mobilePhoneNumber;

    @Schema(description = "Phone number of customer", example = "+4922154421")
    @Column
    private String phoneNumber;

    @Schema(description = "Other phone number of customer", example = "+4922154421")
    @Column
    private String phoneOtherNumber;

    @Schema(description = "Fax number of customer", example = "+4922154421")
    @Column
    private String faxNumber;

    @Schema(description = "Comments", example = "Ist ein Rollstuhlfahrer")
    @Column
    private String comment;


    @Override
    public String toString() {
        return String.format("Customer: ID: %d | Name: %s, %s | Address: %s, %s, %s, %s | Gender: %s | Agency: %s | Email: %s | Mobile: %s | Phone: %s | Other Phone: %s | Fax: %s | Comment: %s", id, lastname, firstname, address, postcode, city, country, gender, agency, email, mobilePhoneNumber, phoneNumber, phoneOtherNumber, faxNumber, comment);
    }
}
