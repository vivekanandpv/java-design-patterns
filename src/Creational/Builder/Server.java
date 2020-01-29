package Creational.Builder;

public class Server {


    public static class Builder {
        private String ipAddress;
        private String hostName;
        private String country;

        public Server.Builder addIPAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return  this;
        }

        public Server.Builder addHostName(String hostName) {
            this.hostName = hostName;
            return  this;
        }

        public Server.Builder addCountry(String country) {
            this.country = country;
            return  this;
        }

        public Server build() {
            return new Server(this);
        }
    }

    private final String ipAddress;
    private final String hostName;
    private final String country;

    private Server(Builder builder) {
        this.ipAddress = builder.ipAddress;
        this.hostName = builder.hostName;
        this.country = builder.country;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getHostName() {
        return hostName;
    }

    public String getCountry() {
        return country;
    }
}
