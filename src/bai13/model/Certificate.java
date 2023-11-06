package bai13.model;

public class Certificate {
    private String id;
    private String name;
    private String rank;
    private String date;

    public Certificate(String id, String name, String rank, String date) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void showInfo() {
        System.out.println("Certificate ID: " + id);
        System.out.println("Certificate Name: " + name);
        System.out.println("Certificate Rank: " + rank);
        System.out.println("Certificate Date: " + date);
    }
}
