import java.time.LocalDate;

public class Customer {
    private int id;
    private String name;
    private LocalDate date;
    private Gender gender;
    private String country;
    private String mobile;
    private String email;

    public String toString() {
        return "Mã khách hàng: " + this.id + " - Tên: " + this.name + " - Ngày sinh: " + this.date + " - Giới tính: " + this.gender + " - Quê quán: " + this.country + " - SĐT: " + this.mobile + " - Email: " + this.email;
    }

    public Customer(int id, String name, LocalDate date, Gender gender, String country, String mobile, String email) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.country = country;
        this.mobile = mobile;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
