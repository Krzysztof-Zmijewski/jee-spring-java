package pl.coderslab.beans;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class Ship {
    private Captain capitan;

    public void setCapitan(Captain capitan) {
        this.capitan = capitan;
    }

    public Captain getCaptain() {
        return capitan;
    }
}
