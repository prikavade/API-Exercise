package schema;

import com.fasterxml.jackson.databind.node.ObjectNode;

public class UserSchema {
    private int id;
    private String name;
    private String username;
    private String email;
    private ObjectNode address;
    private String phone;
    private String website;
    private ObjectNode company ;


    public int getId() {
        return id;
    }

    public String getName() {return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public ObjectNode getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

    public ObjectNode getCompany() {
        return company;
    }


}
