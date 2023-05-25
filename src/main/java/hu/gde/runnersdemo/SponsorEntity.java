package hu.gde.runnersdemo;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class SponsorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long sponsorId;

    private String sponsorName;

    @OneToMany(mappedBy = "sponsorName", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RunnerEntity> sponsors = new ArrayList<>();

    public void setSponsors(List<RunnerEntity> sponsors) {
        this.sponsors = sponsors;
    }

    public List<RunnerEntity> getSponsors() {
        return sponsors;
    }

    public long getSponsorId() {
        return sponsorId;
    }

    public void setSponsorId(long sponsorId) {
        this.sponsorId = sponsorId;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }


}
