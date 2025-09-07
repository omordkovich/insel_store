package insel.store.model.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

import java.util.Objects;


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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneOtherNumber() {
        return phoneOtherNumber;
    }

    public void setPhoneOtherNumber(String phoneOtherNumber) {
        this.phoneOtherNumber = phoneOtherNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Customer customer)) return false;
        return Objects.equals(id, customer.id) && Objects.equals(lastname, customer.lastname) && Objects.equals(firstname, customer.firstname) && Objects.equals(gender, customer.gender) && Objects.equals(address, customer.address) && Objects.equals(country, customer.country) && Objects.equals(city, customer.city) && Objects.equals(postcode, customer.postcode) && Objects.equals(agency, customer.agency) && Objects.equals(email, customer.email) && Objects.equals(mobilePhoneNumber, customer.mobilePhoneNumber) && Objects.equals(phoneNumber, customer.phoneNumber) && Objects.equals(phoneOtherNumber, customer.phoneOtherNumber) && Objects.equals(faxNumber, customer.faxNumber) && Objects.equals(comment, customer.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastname, firstname, gender, address, country, city, postcode, agency, email, mobilePhoneNumber, phoneNumber, phoneOtherNumber, faxNumber, comment);
    }

    @Override
    public String toString() {
        return String.format("Customer: ID: %d | Name: %s, %s | Address: %s, %s, %s, %s | Gender: %s | Agency: %s | Email: %s | Mobile: %s | Phone: %s | Other Phone: %s | Fax: %s | Comment: %s", id, lastname, firstname, address, postcode, city, country, gender, agency, email, mobilePhoneNumber, phoneNumber, phoneOtherNumber, faxNumber, comment);
    }
}
