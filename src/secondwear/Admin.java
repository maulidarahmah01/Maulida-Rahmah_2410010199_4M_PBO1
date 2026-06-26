package secondwear;

public class Admin {

    // Attribute
    private String username;
    private String password;
    private String namaAdmin;

    // Constructor kosong
    public Admin() {

    }

    // Constructor berparameter
    public Admin(String username, String password, String namaAdmin) {

        this.username = username;
        this.password = password;
        this.namaAdmin = namaAdmin;

    }

    // Getter
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNamaAdmin() {
        return namaAdmin;
    }

    // Setter
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNamaAdmin(String namaAdmin) {
        this.namaAdmin = namaAdmin;
    }

    // Method Login
    public boolean login(String username, String password) {

        return this.username.equals(username)
                && this.password.equals(password);

    }

}