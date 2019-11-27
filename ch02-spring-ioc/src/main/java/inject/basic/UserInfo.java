package inject.basic;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author 南八
 */
public class UserInfo {
    private Address address;
    String name;

    private List<Address> addressList;
    private List<String> hobbyList;
    private Set<String> xueLi;
    private Map<String,Integer> xueFen;
    private Properties properties;

    @Override
    public String toString() {
        return "UserInfo{" +
                "address=" + address +
                ", name='" + name + '\'' +
                ", addressList=" + addressList +
                ", hobbyList=" + hobbyList +
                ", xueLi=" + xueLi +
                ", xueFen=" + xueFen +
                ", properties=" + properties +
                '}';
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public List<String> getHobbyList() {
        return hobbyList;
    }

    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }

    public Set<String> getXueLi() {
        return xueLi;
    }

    public void setXueLi(Set<String> xueLi) {
        this.xueLi = xueLi;
    }

    public Map<String, Integer> getXueFen() {
        return xueFen;
    }

    public void setXueFen(Map<String, Integer> xueFen) {
        this.xueFen = xueFen;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
